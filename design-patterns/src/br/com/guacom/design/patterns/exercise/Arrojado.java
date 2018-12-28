package br.com.guacom.design.patterns.exercise;

public class Arrojado implements Investimento {

	@Override
	public double investe() {
		int chute = new java.util.Random().nextInt(10);
		if(chute >= 0 && chute <= 1)
			return 0.05;
		else if(chute >= 2 && chute <= 4)
			return 0.03;
		
		return 0.06;
	}
	
	
}
