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
    @Override
    public List<RecursoEducativo> getAllRecursosEducativos() {
        return recursoEducativoRepository.findAll();
    }
    @Override
    public void deleteRecursoEducativo(Long recursoeducativoId) {
        recursoEducativoRepository.deleteById(recursoeducativoId);
    }
    @Override
    public RecursoEducativo updateRecursoEducativo(Long id, RecursoEducativo recursoEducativo) {
        RecursoEducativo existingRecursoEducativo = recursoEducativoRepository.findById(id).orElse(null);
        if (existingRecursoEducativo != null) {
            existingRecursoEducativo.setNombreRecurso(recursoEducativo.getNombreRecurso());
            existingRecursoEducativo.setTipoRecurso(recursoEducativo.getTipoRecurso());
            existingRecursoEducativo.setAutor(recursoEducativo.getAutor());
            existingRecursoEducativo.setDetalleRecurso(recursoEducativo.getDetalleRecurso());
            return recursoEducativoRepository.save(existingRecursoEducativo);
        } else {
            return null;
        }
    }
}