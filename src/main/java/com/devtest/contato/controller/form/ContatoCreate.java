package com.devtest.contato.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.devtest.contato.modelo.Contato;

public class ContatoCreate {

	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String canal;
	@NotNull @NotEmpty
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
	
	
	public Contato converter() {
		
		return new Contato(nome, canal, valor, obs);
	}
	
	
	
	
}
