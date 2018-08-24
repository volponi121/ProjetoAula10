package br.com.db1.exercicio03;
import br.com.db1.ex03.interfaces.OperacaoMatematica;

public class Subtracao implements OperacaoMatematica{


	public Integer calcula(Integer a, Integer b) {
		return a-b;
	}
	
	
}
