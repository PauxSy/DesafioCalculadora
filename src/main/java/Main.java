import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int opcion;
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	static Calculadora calculadora;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		opcion = menu();
		operar(opcion);
		
		
	}
	
	public static int menu() throws NumberFormatException, IOException {
		do {
			System.out.println("Menu de operacion matematica.\n(Ingrese un numero valido para seleccionar la operacion)\n");
			System.out.println("1) Sumar.");
			System.out.println("2) Restar.");
			System.out.println("3) Multiplicar.");
			System.out.println("4) Dividir.");
			System.out.println("5) Salir.");
			opcion = Integer.parseInt(bufferedReader.readLine());
		}while(opcion >5 || opcion < 0);
		
		return opcion;
		
	}
	
	public static void operar(int opcion) {
		switch(opcion) {
		
			case 1:
				calculadora.sumar();
			case 2:
				calculadora.restar();
			case 3:
				calculadora.dividir();
			case 4:
				calculadora.multiplicar();
			case 5:
				System.out.println("Usted ha salido del programa.");
		}
	}
}
