package com.goldenmind.goldenmindapi.repository;

import com.goldenmind.goldenmindapi.domain.RecursoEducativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecursoEducativoRepository extends JpaRepository<RecursoEducativo, Long> {
}
