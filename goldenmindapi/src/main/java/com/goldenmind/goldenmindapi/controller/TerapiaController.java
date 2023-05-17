package com.goldenmind.goldenmindapi.controller;

import com.goldenmind.goldenmindapi.domain.Terapia;
import com.goldenmind.goldenmindapi.service.TerapiaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/terapias")
public class TerapiaController {
    private final TerapiaService terapiaService;

    TerapiaController(TerapiaService terapiaService){
        this.terapiaService = terapiaService;
    }
    @PostMapping
    public ResponseEntity<Terapia> addTerapia(@RequestBody Terapia terapia){
        return new ResponseEntity<Terapia>(terapiaService.createTerapia(terapia), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Terapia>> getAllTerapia()
    {
        return ResponseEntity.ok(terapiaService.getAllTerapias());
    }
}