package com.devtest.contato.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtest.contato.modelo.Contato;

@RestController
public class ContatosController {

	@RequestMapping("/")
	public List<Contato> lista() {
		Contato contato = new Contato("joao", "E-mail","joao@email.com.br", "cliente importante");
		return Arrays.asList(contato,contato,contato);
	}
}
