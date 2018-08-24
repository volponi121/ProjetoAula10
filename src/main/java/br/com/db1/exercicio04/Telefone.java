package br.com.db1.exercicio04;

public class Telefone {

	private Integer ddd;
	private Integer numero;
	private Pessoa pessoa;
	
	public String exibirTelefoneFormatado(){
		return "("+ddd+")"+numero;
	}
	
}
