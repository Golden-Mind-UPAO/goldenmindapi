package com.goldenmind.goldenmindapi.service;

import com.goldenmind.goldenmindapi.domain.RecursoEducativo;
import com.goldenmind.goldenmindapi.repository.RecursoEducativoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecursoEducativoServiceImpl implements RecursoEducativoService {
    private final RecursoEducativoRepository recursoEducativoRepository;
    public RecursoEducativoServiceImpl(RecursoEducativoRepository recursoEducativoRepository)
    {
        this.recursoEducativoRepository = recursoEducativoRepository;
    }
    @Override
    public RecursoEducativo createRecursoEducativo(RecursoEducativo recursoEducativo)
    {
        return recursoEducativoRepository.save(recursoEducativo);
    }

}