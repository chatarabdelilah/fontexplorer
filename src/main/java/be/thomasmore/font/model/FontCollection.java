package be.thomasmore.font.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class FontCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    @ManyToOne
    private AppUser owner;

    @ManyToMany
    private List<Font> fonts;
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppUser getOwner() {
        return owner;
    }

    public void setOwner(AppUser owner) {
        this.owner = owner;
    }

    public List<Font> getFonts() {
        return fonts;
    }

    public void setFonts(List<Font> fonts) {
        this.fonts = fonts;
    }
}
