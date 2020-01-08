package com.devtest.contato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtest.contato.modelo.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
