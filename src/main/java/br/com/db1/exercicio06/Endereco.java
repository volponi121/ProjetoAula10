package br.com.db1.exercicio06;

import br.com.db1.type.TipoLogradouro;

public class Endereco {
	private String logradouro;
	private Integer cep;
	private TipoLogradouro tLogradouro;

	public String exibirCepFormatado() {
		return cep.toString();
	}

}
