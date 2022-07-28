package com.divyakant.citizenservice.CitizenService.repository;

import com.divyakant.citizenservice.CitizenService.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
    public List<Citizen> findByVid(int vid);
}
