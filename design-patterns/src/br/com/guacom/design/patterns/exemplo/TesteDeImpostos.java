package br.com.guacom.design.patterns.exemplo;

public class TesteDeImpostos {
// - Um padrão de projeto é uma solução elegante para um problema que é recorrente no dia-a-dia do desenvolvedor.
// - Ou seja, por mais que desenvolvamos projetos diferentes, muitos dos problemas se repetem. 
// - Padrões de projeto são soluções elegantes e flexíveis para esses problemas.
// - O mais importante ao estudar padrões de projeto é entender qual a real motivação do padrão, e quando ele deve ser aplicado.

// - As implementações são menos importantes, pois elas podem variar. 
// - O importante é resolver o problema de maneira elegante, usando a ideia por trás do padrão como um guia na implementação.
	public static void main(String[] args) {
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		Orcamento orcamento = new Orcamento(500.0);
	
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
													
													//Strategy
		calculadorDeImpostos.realizaCalculo(orcamento, iss);
		calculadorDeImpostos.realizaCalculo(orcamento, icms);
	}
}
