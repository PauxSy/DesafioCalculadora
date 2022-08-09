package cl.fsj.infoclub.calc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int opcion;
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	static Calculadora calculadora = new Calculadora();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		do {
			opcion = menu();
			operar(opcion);
		}while(opcion!=5);
	}
	
	public static int menu() throws NumberFormatException, IOException {
		do {
			System.out.println("\nMenu de operacion matematica.\n(Ingrese un numero valido para seleccionar la operacion)\n");
			System.out.println("1) Sumar.");
			System.out.println("2) Restar.");
			System.out.println("3) Multiplicar.");
			System.out.println("4) Dividir.");
			System.out.println("5) Salir.");
			opcion = Integer.parseInt(bufferedReader.readLine());
		}while(opcion >5 || opcion < 0);
		
		return opcion;
		
	}
	
	public static void operar(int opcion) throws NumberFormatException, IOException {
		double a,b,resultado = 0;
		switch(opcion) {
		
			case 1:
				System.out.println("Ingrese el primer digito a sumar. ");
				a = Double.parseDouble(bufferedReader.readLine());
				
				System.out.println("Ingrese el segundo digito a sumar. ");
				b = Double.parseDouble(bufferedReader.readLine());
				resultado= calculadora.sumar(a,b);
				break;
				
			case 2:
				System.out.println("Ingrese el minuendo. ");
				a = Double.parseDouble(bufferedReader.readLine());
				
				System.out.println("Ingrese el sustraendo. ");
				b = Double.parseDouble(bufferedReader.readLine());
				resultado=calculadora.restar(a,b);
				break;
				
			case 3:
				System.out.println("Ingrese el dividendo. ");
				a = Double.parseDouble(bufferedReader.readLine());
				
				System.out.println("Ingrese el divisor. ");
				do{
					b = Double.parseDouble(bufferedReader.readLine());
					if(b==0) {
						System.out.println("Ingrese un divisor distinto de 0.");
					}
				}while(b==0);
				resultado=calculadora.dividir(a,b);
				break;
				
			case 4:
				System.out.println("Ingrese el primer factor. ");
				a = Double.parseDouble(bufferedReader.readLine());
				
				System.out.println("Ingrese el segundo factor. ");
				b = Double.parseDouble(bufferedReader.readLine());
				resultado=calculadora.multiplicar(a,b);
				break;
				
			case 5:
				System.out.println("Usted ha salido del programa.");
				break;
				
		}
		if(opcion!=5)System.out.println("\nEl resultado es: "+resultado);
	}
}
