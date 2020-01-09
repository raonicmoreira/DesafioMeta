package com.devtest.contato.config.validacao;

public class ErroDeContatoCreate {

	private String campo;
	private String erro;
	
	public ErroDeContatoCreate(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}
	
	public String getCampo() {
		return campo;
	}
	public String getErro() {
		return erro;
	}
	
	
}
