package com.robsoncraftsman.alura.escola.dominio;

public class Email {

	private final String endereco;

	public Email(final String endereco) {
		if ((endereco == null) || (!endereco.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))) {
			throw new IllegalArgumentException(String.format("%s não é um email válido.", endereco));
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

}
