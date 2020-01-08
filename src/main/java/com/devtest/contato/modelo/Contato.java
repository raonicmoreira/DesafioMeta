package com.devtest.contato.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String canal;
	private String valor;
	private String obs;
	
	
	
	public Contato() {
		
	}


	public Contato(String nome, String canal, String valor, String obs) {
		this.nome = nome;
		this.canal = canal;
		this.valor = valor;
		this.obs = obs;
	}
	
	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", canal=" + canal + ", valor=" + valor + ", obs=" + obs + "]";
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	
}
