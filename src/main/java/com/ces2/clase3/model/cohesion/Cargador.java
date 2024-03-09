package com.ces2.clase3.model.cohesion;

public class Cargador {
	
//	void descarDeInternet() {}	
//	
//	void traducirDatos() {}
//	
//	void guardEnBaseDatos() {}
	
	DescargasInternet descargas;
	Traductor traductor;
	DataBase dataBase;
	
	
	public Cargador(DescargasInternet descargas, Traductor traductor, DataBase dataBase) {
		super();
		this.descargas = descargas;
		this.traductor = traductor;
		this.dataBase = dataBase;
	}


	void ejecutarTareas() {
		this.descargas.descarDeInternet();
		this.traductor.traducirDatos();
		this.dataBase.guardEnBaseDatos();
	}
	
//	void ejecutarTareas() {
//		descarDeInternet();
//		traducirDatos();
//		guardEnBaseDatos();
//	}
}
