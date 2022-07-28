package com.divyakant.vaccination.VaccinationCentreService.repository;

import com.divyakant.vaccination.VaccinationCentreService.model.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccination,Integer> {
}