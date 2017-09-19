package ar.edu.unlam.pb2;

public class Cuenta {

	private Double saldo;
	
	public Cuenta(Double saldoInicial){
		this.saldo=saldoInicial;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
		
	public void depositar(Double montoDeposito){
		this.saldo+=montoDeposito;
	}
	
	
	
}
