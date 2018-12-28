package br.com.guacom.design.patterns.exercise;

public class Conta {
	
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		if(valor <= 0)
			throw new IllegalStateException("Valor inválido!");
		saldo += valor;
	}
}
