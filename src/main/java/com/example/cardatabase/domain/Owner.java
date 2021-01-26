package com.example.cardatabase.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Owner  {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long ownerId;
    private String firstname, lastName;


    public Owner() {}

    public Owner(String firstname, String lastName) {
        super();
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    //Create MTM relationship with table car_owner
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "car_owner", joinColumns = { @JoinColumn(name =
            "ownerid") }, inverseJoinColumns = { @JoinColumn(name = "id") })
     Set<Car> cars = new HashSet<Car>(0);


    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}




