package cl.fsj.infoclub.calc;

public class Calculadora {
	private double n1, n2;
	
	public double restar(double n1, double n2) {
		double resta = n1 - n2;
		
		return resta;		
	}

	public double sumar(double n1, double n2) {
		double sumar = n1 + n2;
		
		return sumar;
	}
	
	public double multiplicar(double n1, double n2) {
		double multiplicar = n1 * n2;
		
		return multiplicar;		
	}
	
	public double dividir (double n1, double n2) {
		
		double division = n1 / n2;
			
			return division;
		
	}

	public Calculadora() {
		super();
	}

	public Calculadora(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "Calculadora [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}
