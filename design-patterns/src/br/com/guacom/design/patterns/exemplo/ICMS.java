package br.com.guacom.design.patterns.exemplo;

public class ICMS implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50.0;
	}
}
