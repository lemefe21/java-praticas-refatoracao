package br.alura.refatoracao.cap4;

public abstract class ContaBancaria {

	//abstract - classe nunca instanciada

	protected double saldo;
	protected String titular;

	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

}
