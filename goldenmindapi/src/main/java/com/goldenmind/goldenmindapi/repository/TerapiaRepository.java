package com.goldenmind.goldenmindapi.repository;

import com.goldenmind.goldenmindapi.domain.Terapia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerapiaRepository extends JpaRepository<Terapia, Long> {
}