package br.com.banco;

public class ContaBancaria {
	protected String  numconta;
	protected String  cliente;
	protected double saldo;
	
	
	public String getNumconta() {
		return numconta;
	}


	public void setNumconta(String numconta) {
		this.numconta = numconta;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	void contaBancaria(String numconta,String cliente, double saldo) {
		  this.numconta	= numconta;
		  this.cliente = cliente;
		  this.saldo = saldo;
		
		
	}
	public void depositar(double valor) {
		this.saldo =+ valor;
		
	}
	public void sacar(double valor) {
		this.saldo =- valor;
		
	}
	public static void main(String[] args) {
		
		
		// TODO Kill my self 

	}

}
