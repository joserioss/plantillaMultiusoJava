package cl.jrios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.jrios.utility.AplicacionCalculadoraBeneficios;

@SpringBootApplication
public class ProyectoPlantillaJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPlantillaJspApplication.class, args);
		
		AplicacionCalculadoraBeneficios.aplicacionCB();

	}

}
