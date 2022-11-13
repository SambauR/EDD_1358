
package com.mycompany.tarea7y8;

public class PruebaCola {

    public static void main(String[] args) {
        Cola cola1 = new Cola();
        
        
        cola1.Agregar(1);
        cola1.Agregar(2);
        cola1.Agregar(3);
        System.out.println(cola1.EstaVacia());
        
        System.out.println(cola1.Tamanio());
        cola1.Quitar();
        System.out.println(cola1.Tamanio());
    }
    
}
