package br.com.guacom.design.patterns.exercise;

public class Moderado implements Investimento {

	@Override
	public double investe() {
		
		if(new java.util.Random(02).nextInt(2) == 1)
			return 0.025;
		return 0.007;
	}
}
