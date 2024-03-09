package com.ces2.clase3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ces2.clase3.model.AcoplamientoAjustado;
import com.ces2.clase3.model.BajoAcoplamiento;
import com.ces2.clase3.model.Doctor;
import com.ces2.clase3.model.Ingeniero;

@SpringBootApplication
public class Clase4PrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(Clase4PrepApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init() {
		return args -> {
			AcoplamientoAjustado acoplamientoAjustado;
			acoplamientoAjustado = new AcoplamientoAjustado(new Doctor(), new Ingeniero());
			acoplamientoAjustado.mostrarProfesiones();
			
			BajoAcoplamiento bajoAcoplamiento;
			bajoAcoplamiento = new BajoAcoplamiento(new Doctor());
			bajoAcoplamiento.mostrarProfesiones();
			
			bajoAcoplamiento = new BajoAcoplamiento(new Ingeniero());
			
			
			bajoAcoplamiento.mostrarProfesiones();
			
		};
	}

}
