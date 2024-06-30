package edu.navegador_internet;

public class Computador implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página.");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página.");
	}

}
