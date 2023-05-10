package de.berlin.htw.webtech.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Nutzer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String gender;
    private int age;
    private String allergies;

    public Nutzer(){}

    public Nutzer(String name, String gender, int age, String allergies){
        this.name = name;
        this.gender=gender;
        this.age=age;
        this.allergies=allergies;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nutzer nutzer)) return false;
        return getGender() == nutzer.getGender() && getAge() == nutzer.getAge() && Objects.equals(getId(), nutzer.getId()) && Objects.equals(getName(), nutzer.getName()) && Objects.equals(getAllergies(), nutzer.getAllergies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getGender(), getAge(), getAllergies());
    }

    @Override
    public String toString() {
        return "Nutzer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", allergies='" + allergies + '\'' +
                '}';
    }
}
