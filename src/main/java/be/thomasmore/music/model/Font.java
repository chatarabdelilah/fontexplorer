package be.thomasmore.music.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Font {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }
}
