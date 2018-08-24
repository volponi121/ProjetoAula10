package br.com.db1.type;

public enum Sexo {

	MASCULINO("M"),
	FEMININO("F");
	
	private String tipo;
	
	Sexo (String tipo){
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
