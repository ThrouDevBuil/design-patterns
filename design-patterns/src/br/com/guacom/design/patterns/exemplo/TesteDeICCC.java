package br.com.guacom.design.patterns.exemplo;


public class TesteDeICCC {
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(4000);
		
		Imposto icc = new ICCC2();
	
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();		
		
		calculadorDeImpostos.realizaCalculo(orcamento, icc);
		
	}
}
