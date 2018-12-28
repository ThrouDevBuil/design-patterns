package br.com.guacom.design.patterns.exemplo;
//			Pattern Strategy:
//	O padr�o Strategy serve para "definir uma fam�lia de algoritmos (algoritmos similares), encapsular cada uma delas e torn�-las intercambi�veis. 
//	Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam" (como definido no livro do GoF).
//	Strategy nos permite configurar uma classe com um de v�rios comportamentos, utilizando o conceito de OO chamado de composi��o.
//	O Strategy nos oferece uma maneira flex�vel para escrever diversos 
//	algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles.


//Intercambi�veis - Duas coisas diferentes podem ser usadas alternadamente com o mesmo prop�sito sem que o resultado seja prejudicado.
public interface Imposto {
	
	//As interfaces s�o utilizadas para que o padr�o strategy possa ser aplicado.
	
	//Imagine que, em uma aplica��o de vendas, um Pedido possua duas formas diferentes (estrat�gias) de se calcular 
	//a taxa de entrega do mesmo: Padr�o e Expresso. Neste caso, o Pedido (Context) seria configurado por um cliente (classe que o utiliza) 
	//com a estrat�gia desejada. A implementa��o da classe Pedido poderia ser algo como (por simplicidade inclui apenas a estrat�gia):
	double calculaImposto(Orcamento orcamento);
						//Context

	//Strategy: � a interface comum a todos os algoritmos suportados. Atrav�s desta interface, 
	//o Context pode chamar o algoritmo criado pela ConcreteStrategy.
}
