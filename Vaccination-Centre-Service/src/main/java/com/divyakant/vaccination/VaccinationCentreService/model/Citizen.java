package com.divyakant.vaccination.VaccinationCentreService.model;

import javax.persistence.*;

public class Citizen {


    private int id;
    private String name;
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

