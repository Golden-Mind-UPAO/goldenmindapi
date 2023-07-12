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
    @Override
    public Terapia updateTerapia(Long id, Terapia terapia) {
        Terapia existingTerapia = terapiaRepository.findById(id).orElse(null);
        if (existingTerapia != null) {
            existingTerapia.setNombreTerapia(terapia.getNombreTerapia());
            existingTerapia.setDescription(terapia.getDescription());
            existingTerapia.setNombreSeccion1(terapia.getNombreSeccion1());
            existingTerapia.setNombreSeccion2(terapia.getNombreSeccion2());
            existingTerapia.setNombreSeccion3(terapia.getNombreSeccion3());
            existingTerapia.setReto1Seccion1(terapia.getReto1Seccion1());
            existingTerapia.setReto2Seccion1(terapia.getReto2Seccion1());
            existingTerapia.setReto1Seccion2(terapia.getReto1Seccion2());
            existingTerapia.setReto2Seccion2(terapia.getReto2Seccion2());
            existingTerapia.setReto1Seccion3(terapia.getReto1Seccion3());
            existingTerapia.setReto2Seccion3(terapia.getReto2Seccion3());
            return terapiaRepository.save(existingTerapia);
        } else {
            return null;
        }
    }

}