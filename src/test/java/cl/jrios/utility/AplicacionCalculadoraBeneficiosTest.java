package cl.jrios.utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import cl.jrios.utility.impl.CalculadoraSimple;

public class AplicacionCalculadoraBeneficiosTest {
	
	@Test
	public void testAlgoritmoSimple() {
		List<Integer> listaIngreso = new ArrayList<>();
		listaIngreso.add(1000);
		listaIngreso.add(1000);
		listaIngreso.add(2000);
		ICalculadoraBeneficios calculoSimple = new CalculadoraSimple();
		Integer resultadoSimple = calculoSimple.calcula(listaIngreso);

		Integer valorEsperado = 4120;
		Integer valorObtenido = resultadoSimple;
		assertEquals(valorEsperado, valorObtenido);
	}

}
