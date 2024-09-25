package com.gym.gerenciadorfichas.repository;

import com.gym.gerenciadorfichas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
