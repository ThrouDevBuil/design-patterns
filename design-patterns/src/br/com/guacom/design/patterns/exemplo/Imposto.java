package br.com.guacom.design.patterns.exemplo;
//			Pattern Strategy:
//	O padrão Strategy serve para "definir uma família de algoritmos (algoritmos similares), encapsular cada uma delas e torná-las intercambiáveis. 
//	Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam" (como definido no livro do GoF).
//	Strategy nos permite configurar uma classe com um de vários comportamentos, utilizando o conceito de OO chamado de composição.
//	O Strategy nos oferece uma maneira flexível para escrever diversos 
//	algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles.


//Intercambiáveis - Duas coisas diferentes podem ser usadas alternadamente com o mesmo propósito sem que o resultado seja prejudicado.
public interface Imposto {
	
	//As interfaces são utilizadas para que o padrão strategy possa ser aplicado.
	
	//Imagine que, em uma aplicação de vendas, um Pedido possua duas formas diferentes (estratégias) de se calcular 
	//a taxa de entrega do mesmo: Padrão e Expresso. Neste caso, o Pedido (Context) seria configurado por um cliente (classe que o utiliza) 
	//com a estratégia desejada. A implementação da classe Pedido poderia ser algo como (por simplicidade inclui apenas a estratégia):
	double calculaImposto(Orcamento orcamento);
						//Context

	//Strategy: É a interface comum a todos os algoritmos suportados. Através desta interface, 
	//o Context pode chamar o algoritmo criado pela ConcreteStrategy.
}
