package br.com.guacom.design.patterns.exemplo;

public class ISS implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
