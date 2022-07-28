package com.divyakant.citizenservice.CitizenService.controller;

import com.divyakant.citizenservice.CitizenService.model.Citizen;
import com.divyakant.citizenservice.CitizenService.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenRepository citizenRepository;

    @PostMapping("/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen)
    {
        return new ResponseEntity<Citizen>(citizenRepository.save(citizen), HttpStatus.OK);
    }

    @GetMapping("/id/{vid}")
    public ResponseEntity<List<Citizen>> getCitizenByVaccineId(@PathVariable("vid") int vid)
    {
        return new ResponseEntity<List<Citizen>>(citizenRepository.findByVid(vid), HttpStatus.OK);
    }
}
