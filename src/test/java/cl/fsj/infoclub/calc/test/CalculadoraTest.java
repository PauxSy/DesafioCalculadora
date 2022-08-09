package cl.fsj.infoclub.calc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import cl.fsj.infoclub.calc.Calculadora;

public class CalculadoraTest {
	private static Logger log = Logger.getLogger("cl.fsj.infoclub.calc.test.calculadoratest");
	private final Calculadora calcu = new Calculadora();
	
	@Test
	public void testSumar(){
		log.info("info test sumar");
		double respSumar = calcu.sumar(10.0,5.3);
		assertEquals(15.3,respSumar);		
	}
	
	@Test
	public void testRestar(){
		log.info("info test restar");
		double respRestar = calcu.restar(10.0,5.3);
		assertEquals(4.7,respRestar);		
	}
	
	@Test
	public void testMulplicar(){
		log.info("info test multiplicar");
		double respMultiplicar = calcu.multiplicar(10.0,5.3);
		assertEquals(53.0,respMultiplicar);		
	}
	
	@Test
	public void testDivision(){
		log.info("info test division");
		double respDivision = calcu.dividir(10.0,5.0);
		assertEquals(2.0,respDivision);		
	}	
	
}
