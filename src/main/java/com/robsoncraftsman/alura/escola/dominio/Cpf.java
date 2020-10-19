package com.robsoncraftsman.alura.escola.dominio;


public class Cpf {

	private final String valor;

	public Cpf(final String valor) {
		if ((valor == null) || !valor.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
			throw new IllegalArgumentException(String.format("%s não é um CPF válido.", valor));
		}
		this.valor = valor;
	}

	public String getValor() {
		return this.valor;
	}

}
