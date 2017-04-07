package com.gmail.lizaiatsenko;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
@NamedQuery(name = "Car.getAll", query = "Select c from Car c ")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column
    private String name;      

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate; 

    @Column
    private float cost;     

    public Car(String name, Date releaseDate, float cost) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.cost = cost;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", cost=" + cost +
                '}';
    }
}
