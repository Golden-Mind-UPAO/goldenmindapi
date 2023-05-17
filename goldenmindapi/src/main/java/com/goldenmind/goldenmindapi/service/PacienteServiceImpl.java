package com.goldenmind.goldenmindapi.service;

import com.goldenmind.goldenmindapi.domain.Paciente;
import com.goldenmind.goldenmindapi.repository.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService{
    private final PacienteRepository pacienteRepository;
    public PacienteServiceImpl(PacienteRepository pacienteRepository)
    {
        this.pacienteRepository = pacienteRepository;
    }
    @Override
    public Paciente createPaciente(Paciente paciente)
    {
        return pacienteRepository.save(paciente);
    }
}
