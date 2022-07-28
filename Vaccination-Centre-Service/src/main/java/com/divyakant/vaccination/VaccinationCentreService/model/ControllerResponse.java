package com.divyakant.vaccination.VaccinationCentreService.model;

import java.util.List;

public class ControllerResponse {

    private Vaccination vaccination;
    private List<Citizen> citizenList;

    public Vaccination getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination vaccination) {
        this.vaccination = vaccination;
    }

    public List<Citizen> getCitizenList() {
        return citizenList;
    }

    public void setCitizenList(List<Citizen> citizenList) {
        this.citizenList = citizenList;
    }
}
