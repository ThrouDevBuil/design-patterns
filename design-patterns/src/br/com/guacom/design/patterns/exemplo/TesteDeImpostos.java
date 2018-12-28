package br.com.guacom.design.patterns.exemplo;

public class TesteDeImpostos {
// - Um padr�o de projeto � uma solu��o elegante para um problema que � recorrente no dia-a-dia do desenvolvedor.
// - Ou seja, por mais que desenvolvamos projetos diferentes, muitos dos problemas se repetem. 
// - Padr�es de projeto s�o solu��es elegantes e flex�veis para esses problemas.
// - O mais importante ao estudar padr�es de projeto � entender qual a real motiva��o do padr�o, e quando ele deve ser aplicado.

// - As implementa��es s�o menos importantes, pois elas podem variar. 
// - O importante � resolver o problema de maneira elegante, usando a ideia por tr�s do padr�o como um guia na implementa��o.
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
