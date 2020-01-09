package com.devtest.contato.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.devtest.contato.controller.form.ContatoCreate;
import com.devtest.contato.modelo.Contato;
import com.devtest.contato.repository.ContatoRepository;

@RestController
@RequestMapping(value="/contatos")
public class ContatosController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping
	public List<Contato> lista() {
		List<Contato> contatos = contatoRepository.findAll();
		
		return contatos;
	}
	
	@PostMapping
	public ResponseEntity<Contato> cadastrar(@RequestBody @Valid ContatoCreate contatoCreate, UriComponentsBuilder uriBuilder) {
		Contato contato = contatoCreate.converter();
		contatoRepository.save(contato);
		URI uri = uriBuilder.path("/contatos/{id}").buildAndExpand(contato.getId()).toUri();
		return ResponseEntity.created(uri).body(contato);
	}

	
}
