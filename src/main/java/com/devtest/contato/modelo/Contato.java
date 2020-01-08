package com.devtest.contato.modelo;


public class Contato {

	private String id;
	private String nome;
	private String canal;
	private String valor;
	private String obs;
	
	
	
	public Contato() {
		
	}


	public Contato(String id, String nome, String canal, String valor, String obs) {
		this.id = id;
		this.nome = nome;
		this.canal = canal;
		this.valor = valor;
		this.obs = obs;
	}
	
	
	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", canal=" + canal + ", valor=" + valor + ", obs=" + obs + "]";
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
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
