package be.thomasmore.music.model;

import jakarta.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private int duration;
    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;
}
