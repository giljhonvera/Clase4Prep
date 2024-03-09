package com.ces2.clase3.model;

public class AcoplamientoAjustado {
	
	Doctor doctor;
	Ingeniero ingeniero;
	
	public AcoplamientoAjustado(Doctor doctor, Ingeniero ingeniero) {
		super();
		this.doctor = doctor;
		this.ingeniero = ingeniero;
	}
	
	
	
	public void mostrarProfesiones() {
		doctor.mostrarProfesion();
		ingeniero.mostrarProfesion();
	}
	
}
