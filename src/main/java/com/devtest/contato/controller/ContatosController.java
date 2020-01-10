package com.devtest.contato.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.devtest.contato.controller.form.ContatoCreate;
import com.devtest.contato.controller.form.ContatoUpdate;
import com.devtest.contato.modelo.Contato;
import com.devtest.contato.repository.ContatoRepository;

@RestController
@RequestMapping(value="/contatos")
public class ContatosController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping
	public ResponseEntity<?> lista(@PageableDefault(page = 0, size = 10) Pageable paginacao) {
		
		Page<Contato> contatos = contatoRepository.findAll(paginacao);
		if(!contatos.isEmpty()) {
			return ResponseEntity.ok(contatos);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Contato> cadastrar(@RequestBody @Valid ContatoCreate contatoCreate, UriComponentsBuilder uriBuilder) {
		Contato contato = contatoCreate.converter();
		contatoRepository.save(contato);
		URI uri = uriBuilder.path("/contatos/{id}").buildAndExpand(contato.getId()).toUri();
		return ResponseEntity.created(uri).body(contato);
	}
	
	@GetMapping("/{idContato}")
	public ResponseEntity<Contato> buscaPorId(@PathVariable(name="idContato") Long id) {
		Optional<Contato> contato = contatoRepository.findById(id);
		if(contato.isPresent()) {
			return ResponseEntity.ok(contato.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{idContato}")
	@Transactional
	public ResponseEntity<Contato> atualizarContato(@PathVariable(name="idContato") Long id, @RequestBody ContatoUpdate contatoUpdate){
		
		Optional<Contato> optional = contatoRepository.findById(id);
		if(optional.isPresent()) {
			Contato contato = contatoUpdate.atualizar(id, contatoRepository);
			return ResponseEntity.ok(contato);
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{idContato}")
	@Transactional
	public ResponseEntity<?> removerContato(@PathVariable(name="idContato") Long id){
		Optional<Contato> optional = contatoRepository.findById(id);
		if(optional.isPresent()) {
			contatoRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	
}
