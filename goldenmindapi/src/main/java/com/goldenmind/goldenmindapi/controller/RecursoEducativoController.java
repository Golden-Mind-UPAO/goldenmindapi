package com.goldenmind.goldenmindapi.controller;

import com.goldenmind.goldenmindapi.domain.RecursoEducativo;
import com.goldenmind.goldenmindapi.service.RecursoEducativoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/recursoseducativos")
public class RecursoEducativoController{
    private final RecursoEducativoService recursoEducativoService;
    RecursoEducativoController(RecursoEducativoService recursoEducativoService)
    {
        this.recursoEducativoService = recursoEducativoService;
    }
    @PostMapping
    public ResponseEntity<RecursoEducativo> addRecursoEducativo(@RequestBody RecursoEducativo recursoEducativo){
        return new ResponseEntity<RecursoEducativo>(recursoEducativoService.createRecursoEducativo(recursoEducativo), HttpStatus.CREATED);
    }
}