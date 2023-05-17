package com.goldenmind.goldenmindapi.controller;

import com.goldenmind.goldenmindapi.domain.Paciente;
import com.goldenmind.goldenmindapi.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/api/v1/pacientes")
public class PacienteController {
    private final PacienteService pacienteService;
    PacienteController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }
    @PostMapping
    public ResponseEntity<Paciente> addPaciente(@RequestBody Paciente paciente){
        return new ResponseEntity<Paciente>(pacienteService.createPaciente(paciente), HttpStatus.CREATED);
    }
}
