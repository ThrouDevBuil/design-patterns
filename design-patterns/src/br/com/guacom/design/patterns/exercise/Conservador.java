package br.com.guacom.design.patterns.exercise;

public class Conservador implements Investimento {

	@Override
	public double investe() {
		return 0.008;
	}
}
