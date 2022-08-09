package cl.fsj.infoclub.calc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import cl.fsj.infoclub.calc.Calculadora;
import cl.infoclub.fsj.modelo.Persona;

public class CalculadoraTest {
	private static Logger log = Logger.getLogger("cl.fsj.infoclub.calc.test.calculadoratest");
	private final Calculadora calcu = new Calculadora();
	
	@Test
	public void testSumar(){
		log.info("info test sumar");
		Calculadora suma = new Calculadora(10d,5d);
		String respServicio = sp.crearPersona(paulette);
		assertEquals("Persona creada",respServicio);
		
	}
	
	
	

}
