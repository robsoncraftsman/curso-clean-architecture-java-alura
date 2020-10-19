package com.robsoncraftsman.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import com.robsoncraftsman.alura.escola.dominio.Cpf;
import com.robsoncraftsman.alura.escola.dominio.Email;
import com.robsoncraftsman.alura.escola.dominio.Telefone;

public class Aluno {

	private final Cpf cpf;
	private final String nome;
	private final Email email;
	private final List<Telefone> telefones = new ArrayList<>();

	public Aluno(final Cpf cpf, final String nome, final Email email) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public Cpf getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public Email getEmail() {
		return this.email;
	}

	public void addTelefone(final Telefone telefone) {
		this.telefones.add(telefone);
	}

}
