package com.goldenmind.goldenmindapi.repository;

import com.goldenmind.goldenmindapi.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
