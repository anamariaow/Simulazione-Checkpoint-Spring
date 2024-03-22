package com.example.Studentisimulazionecheckpoint3.controller;

import com.example.Studentisimulazionecheckpoint3.entity.Studenti;
import com.example.Studentisimulazionecheckpoint3.repository.StudentiRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentiController {
    @Autowired
    private StudentiRepository studentRepository;

    @GetMapping("/getstudent")
    public List<Studenti> getAllStudenti() {
        return studentRepository.findAll();
    }

    @PostMapping
    public Studenti createStudente(@RequestBody Studenti studente) {
        return studentRepository.save(studente);
    }
}
