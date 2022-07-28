package com.divyakant.vaccination.VaccinationCentreService.model;

import javax.persistence.*;

@Entity
@Table(name = "VaccinationCentre")
public class Vaccination {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "vaccine_id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    public Vaccination(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
