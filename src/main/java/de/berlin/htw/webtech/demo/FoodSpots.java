package de.berlin.htw.webtech.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class FoodSpots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String address;
    private int rating;
    private String website;


    public FoodSpots(){}

    public FoodSpots(String name, String category, String address, int rating, String website){
        this.name = name;
        this.category=category;
        this.address=address;
        this.rating=rating;
        this.website=website;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodSpots foodSpots)) return false;
        return getRating() == foodSpots.getRating() && Objects.equals(getId(), foodSpots.getId()) && Objects.equals(getName(), foodSpots.getName()) && Objects.equals(getCategory(), foodSpots.getCategory()) && Objects.equals(getAddress(), foodSpots.getAddress()) && Objects.equals(getWebsite(), foodSpots.getWebsite());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCategory(), getAddress(), getRating(), getWebsite());
    }


    @Override
    public String toString() {
        return "FoodSpots{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", address='" + address + '\'' +
                ", rating=" + rating + '\'' +
                ", website=" + website +
                '}';
    }
}

