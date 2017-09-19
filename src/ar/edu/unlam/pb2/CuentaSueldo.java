package ar.edu.unlam.pb2;

public class CuentaSueldo extends Cuenta {
	
	public CuentaSueldo(Double saldoInicial){
		super(saldoInicial);
	}
	
	public void extraer(Double montoExtraccion){
	if(this.getSaldo()>=montoExtraccion){
		setSaldo(getSaldo()-montoExtraccion);
	}
	else{
		System.out.println("no posee saldo suficiente");
	}
		
	
}
}
