package com.goldenmind.goldenmindapi.service;

import com.goldenmind.goldenmindapi.domain.Terapia;

import java.util.List;

public interface TerapiaService {
    Terapia createTerapia(Terapia terapia);
    List<Terapia> getAllTerapias();
    void deleteTerapia(Long terapiaId);
    Terapia updateTerapia(Long id, Terapia terapia);


}