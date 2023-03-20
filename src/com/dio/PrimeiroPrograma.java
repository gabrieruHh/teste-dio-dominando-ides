package com.dio;

import com.dio.br.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println(gato);
		System.out.println(livros);
		
		
		int a = 2;
		int b = 3;
		System.out.println("Bom dia Gabrieru! " + (a + b));
	}
}

class Livros {
	private String nome;
	private String npag;
}
