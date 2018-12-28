package br.com.guacom.design.patterns.exercise;

public class RealizadorDeInvestimentos {
	
	public double realizaInvestimento(Conta c, Investimento in) {
		c.deposita( (c.getSaldo() * in.investe()) * 0.75);
		return c.getSaldo();
	}
}
