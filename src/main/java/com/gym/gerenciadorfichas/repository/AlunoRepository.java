package com.gym.gerenciadorfichas.repository;

import com.gym.gerenciadorfichas.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
