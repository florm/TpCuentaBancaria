package ar.edu.unlam.pb2;

public class CajaDeAhorro extends CuentaSueldo {

	private Integer contadorExtraccion;
	private Double comision=6.0;
	
	public CajaDeAhorro(Double saldoInicial){
		super(saldoInicial);
		contadorExtraccion=0;
	}
	
	
	
	public Integer getContadorExtraccion() {
		return contadorExtraccion;
	}



	public void setContadorExtraccion(Integer contadorExtraccion) {
		this.contadorExtraccion = contadorExtraccion;
	}



	public Double getComision() {
		return comision;
	}



	public void setComision(Double comision) {
		this.comision = comision;
	}



	public void extraerCajaAhorro(Double montoExtraccion){
		if(this.contadorExtraccion<5){
			extraer(montoExtraccion);
			contadorExtraccion++;
		}
		else{
			extraer(montoExtraccion+comision);
			contadorExtraccion++;
		}
	}
}
