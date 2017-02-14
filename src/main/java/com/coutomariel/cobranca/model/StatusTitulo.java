package com.coutomariel.cobranca.model;

public enum StatusTitulo {

	PENDENTE("Pendente"),
	PAGO("Pago");
	
	private String descricao;

	private StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
