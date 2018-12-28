package br.com.guacom.design.patterns.exercise;

public interface Investimento {
	//Depende do problema. Lembre-se que códigos simples são mais fáceis de manter sempre. 
	//Se você só tem uma estratégia, talvez faça mais sentido você não usar o Strategy, 
	//já que você estaria flexibilizando algo sem necessidade.

	double investe();
}
