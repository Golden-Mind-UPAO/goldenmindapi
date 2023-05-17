package com.goldenmind.goldenmindapi.service;

import com.goldenmind.goldenmindapi.domain.Terapia;
import com.goldenmind.goldenmindapi.repository.TerapiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TerapiaServiceImpl implements TerapiaService{
    private final TerapiaRepository terapiaRepository;
    public TerapiaServiceImpl(TerapiaRepository terapiaRepository)
    {
        this.terapiaRepository = terapiaRepository;
    }
    @Override
    public Terapia createTerapia(Terapia terapia)
    {
        return terapiaRepository.save(terapia);
    }
    @Override
    public List<Terapia> getAllTerapias() {
        return terapiaRepository.findAll();
    }
    @Override
    public void deleteTerapia(Long terapiaId) {
        terapiaRepository.deleteById(terapiaId);
    }


}