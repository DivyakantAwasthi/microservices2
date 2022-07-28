package com.divyakant.citizenservice.CitizenService.model;

import javax.persistence.*;

@Entity
@Table(name = "Citizens")
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "citizenId")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "vaccineId")
    private int vid;

    public Citizen(int id, String name, int vid) {
        this.id = id;
        this.name = name;
        this.vid = vid;
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

    public int getVid() {
        return vid;
    }

    public void setVid(int vid) {
        this.vid = vid;
    }
}

