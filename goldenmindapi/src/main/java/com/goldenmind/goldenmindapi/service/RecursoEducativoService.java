package com.goldenmind.goldenmindapi.service;

import com.goldenmind.goldenmindapi.domain.RecursoEducativo;

import java.util.List;

public interface RecursoEducativoService {
    RecursoEducativo createRecursoEducativo(RecursoEducativo recursoEducativo);
    List<RecursoEducativo> getAllRecursosEducativos();
    void deleteRecursoEducativo(Long recursoeducativoId);
}