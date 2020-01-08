package com.devtest.contato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtest.contato.modelo.Contato;
import com.devtest.contato.repository.ContatoRepository;

@RestController
public class ContatosController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@RequestMapping("/")
	public List<Contato> lista() {
		List<Contato> contatos = contatoRepository.findAll();
		
		return contatos;
	}
}
