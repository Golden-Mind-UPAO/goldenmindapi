package com.goldenmind.goldenmindapi.controller;

import java.net.URI;
import java.util.List;

import com.goldenmind.goldenmindapi.domain.Psicologo;
import com.goldenmind.goldenmindapi.service.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/psicologos/")
public class PsicologoController {

    @Autowired
    private PsicologoService psicologoService;

    @GetMapping
    private ResponseEntity<List<Psicologo>> getAllPersonas (){
        return ResponseEntity.ok(psicologoService.findAll());
    }

    @PostMapping
    private ResponseEntity<Psicologo> savePsicologo (@RequestBody Psicologo psicologo){
        try {
            Psicologo  psicologoGuardada = psicologoService.save(psicologo);
            return ResponseEntity.created(new URI("/psicologo/"+psicologoGuardada.getId())).body(psicologoGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping (value = "delete/{id}")
    private ResponseEntity<Boolean> deletePsicologo (@PathVariable ("id") Long id){
        psicologoService.deleteById(id);
        return ResponseEntity.ok(!(psicologoService.findById(id)!=null));

    }

}