package be.thomasmore.font.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String occupation;
    private String bio;
    private String country;
    private String city;
    private boolean loggedIn;

    @ManyToMany
    private Collection<Font> favoriteFonts;

    @ManyToMany
    @JoinTable(name = "user_font_collections",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "font_id")
    )
    private Collection<Font> fontCollections;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return occupation;
    }

    public void setJob(String occupation) {
        this.occupation = occupation;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public Collection<Font> getFavoriteFonts() {
        return favoriteFonts;
    }

    public void setFavoriteFonts(Collection<Font> favoriteFonts) {
        this.favoriteFonts = favoriteFonts;
    }

    public Collection<Font> getFontCollections() {
        return fontCollections;
    }

    public void setFontCollections(Collection<Font> fontCollections) {
        this.fontCollections = fontCollections;
    }
}
