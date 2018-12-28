package br.com.guacom.design.patterns.exemplo;

//Somente em 1995, os padrões de projeto (ou design patterns) ganharam popularidade, quando Erich Gamma, Richard Helm, 
//Ralph Johnson e John Vlissides publicaram o livro “Design Patterns – Elements of Reusable Object-Oriented Software“, 
//catalogando 23 design patterns. Esses 4 autores ficaram então conhecidos como Gang of Four (GoF)


public class ICCC implements Imposto {
	
	//ConcreteStrategy - Implementa o algoritmo usando a interface Strategy
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}
