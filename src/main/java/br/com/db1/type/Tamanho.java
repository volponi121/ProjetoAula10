package br.com.db1.type;

public enum Tamanho {
	
	P("P"),
	M("M"),
	G("G");
	
	private String tamanhoConteudo;

	Tamanho(String tamanhoConteudo) {
		this.tamanhoConteudo=tamanhoConteudo;
	}

	public String getTamanhoConteudo() {
		return tamanhoConteudo;
	}

}
