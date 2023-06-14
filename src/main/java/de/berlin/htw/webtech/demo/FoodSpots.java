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
    private String Lokalname;
    private String cateogry;
    private String address;
    private int rating;

    public FoodSpots(){}

    public FoodSpots(String Lokalname, String cateogry, String address, int rating){
        this.Lokalname = Lokalname;
        this.cateogry=cateogry;
        this.address=address;
        this.rating=rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLokalname() {
        return Lokalname;
    }

    public void setLokalname(String lokalname) {
        Lokalname = lokalname;
    }

    public String getCateogry() {
        return cateogry;
    }

    public void setCateogry(String cateogry) {
        this.cateogry = cateogry;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodSpots foodSpots)) return false;
        return getRating() == foodSpots.getRating() && Objects.equals(getId(), foodSpots.getId()) && Objects.equals(getLokalname(), foodSpots.getLokalname()) && Objects.equals(getCateogry(), foodSpots.getCateogry()) && Objects.equals(getAddress(), foodSpots.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLokalname(), getCateogry(), getAddress(), getRating());
    }


    @Override
    public String toString() {
        return "FoodSpots{" +
                "id=" + id +
                ", Lokalname='" + Lokalname + '\'' +
                ", cateogry='" + cateogry + '\'' +
                ", address='" + address + '\'' +
                ", rating=" + rating +
                '}';
    }
}

