package com.dio_class.devweek.Repository;

import com.dio_class.devweek.Entity.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepo extends JpaRepository<IncidenciaExame, Long> {
}