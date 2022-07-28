package com.divyakant.vaccination.VaccinationCentreService.controller;

import com.divyakant.vaccination.VaccinationCentreService.model.Citizen;
import com.divyakant.vaccination.VaccinationCentreService.model.ControllerResponse;
import com.divyakant.vaccination.VaccinationCentreService.model.Vaccination;
import com.divyakant.vaccination.VaccinationCentreService.repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    VaccinationRepository vaccinationRepository;

    @PostMapping("/add")
    public ResponseEntity<Vaccination> add(@RequestBody Vaccination vaccination)
    {
        return new ResponseEntity<>(vaccinationRepository.save(vaccination), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ControllerResponse> getVaccinationCentreDetails(@PathVariable("id") int id)
    {
        ControllerResponse controllerResponse = new ControllerResponse();
        Vaccination vaccination = vaccinationRepository.findById(id).get();
        controllerResponse.setVaccination(vaccination);

        List<Citizen> citizenList = restTemplate.getForObject("http://Citizen-Service/citizen/id/"+id, List.class);
        controllerResponse.setCitizenList(citizenList);

        return new ResponseEntity<>(controllerResponse,HttpStatus.OK);
    }
}
