package br.com.guacom.design.patterns.exemplo;
public class CalculadorDeImpostos {
	
	//Calcula o imposto usando a estr�tegia (strategy) recebida
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double tax = imposto.calculaImposto(orcamento);
		System.out.println(tax);
	}
	//Context - 
}
