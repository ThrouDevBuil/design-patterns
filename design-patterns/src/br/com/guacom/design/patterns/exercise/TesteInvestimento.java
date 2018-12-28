package br.com.guacom.design.patterns.exercise;

public class TesteInvestimento {
	public static void main(String[] args) {
		
		Investimento invest = new Conservador();
		Investimento invest1 = new Moderado();
		Investimento invest2 = new Arrojado();
		
		RealizadorDeInvestimentos ri = new RealizadorDeInvestimentos();
	
		Conta c1 = new Conta(300);
		Conta c2 = new Conta(400);
		Conta c3 = new Conta(500);
		
		System.out.println(ri.realizaInvestimento(c1, invest));
		System.out.println(ri.realizaInvestimento(c2, invest1));
		System.out.println(ri.realizaInvestimento(c3, invest2));
	}
}
