package be.thomasmore.font.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String bio;
    private String country;
    private String city;

    @OneToMany(mappedBy = "designer")
    private Collection<Font> fonts;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
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

    public Collection<Font> getFonts() {
        return fonts;
    }

    public void setFonts(Collection<Font> fonts) {
        this.fonts = fonts;
    }
}
