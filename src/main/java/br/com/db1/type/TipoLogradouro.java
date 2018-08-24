package br.com.db1.type;

public enum TipoLogradouro {
	RUA("Rua"),
	AVENIDA("Avenida");
	
	private String tipo;
	
	TipoLogradouro(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}

}
