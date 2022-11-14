package com.mycompany.colasprioridad;

public class BarcoEjemplo {

    public static void main(String[] args) {
ColaPrioridad barco = new ColaPrioridad<>(6);
		
		barco.Agregar(4, "Maestre");
		barco.Agregar(2, "Niños");
		barco.Agregar(4, "Mecánico");
		barco.Agregar(3, "Hombres");
		barco.Agregar(4, "Vigia");
		barco.Agregar(5, "Capitán");
		barco.Agregar(4, "Timonel");
		barco.Agregar(3, "Mujeres");
		barco.Agregar(2, "3ra Edad");
		barco.Agregar(1, "Niñas");
		
		System.out.println(barco);
    }

}
