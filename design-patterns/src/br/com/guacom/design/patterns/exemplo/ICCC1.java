package br.com.guacom.design.patterns.exemplo;
public class ICCC1 implements Imposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}
}
