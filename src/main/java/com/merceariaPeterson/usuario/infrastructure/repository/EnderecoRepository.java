package com.merceariaPeterson.usuario.infrastructure.repository;

import com.merceariaPeterson.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
