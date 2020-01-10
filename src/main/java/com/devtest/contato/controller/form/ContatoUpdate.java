package com.devtest.contato.controller.form;

import com.devtest.contato.modelo.Contato;
import com.devtest.contato.repository.ContatoRepository;

public class ContatoUpdate {

	private String nome;
	private String canal;
	private String valor;
	private String obs;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public Contato atualizar(Long id, ContatoRepository contatoRepository) {
		Contato contato = contatoRepository.getOne(id);
		contato.setNome(this.nome);
		contato.setCanal(canal);
		contato.setValor(valor);
		contato.setObs(obs);
		return contato;
	}
	
}
