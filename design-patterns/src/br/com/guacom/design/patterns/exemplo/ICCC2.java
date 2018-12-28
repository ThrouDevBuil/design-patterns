package br.com.guacom.design.patterns.exemplo;

public class ICCC2 implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.08) + 30.0;
	}
}
