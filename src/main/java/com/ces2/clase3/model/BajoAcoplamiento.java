package com.ces2.clase3.model;

public class BajoAcoplamiento {
	
	Profesion profesion;

	public BajoAcoplamiento(Profesion profesion) {
		super();
		this.profesion = profesion;
	}
	
	
	public void mostrarProfesiones() {
		this.profesion.mostrarProfesion();
	}
}
