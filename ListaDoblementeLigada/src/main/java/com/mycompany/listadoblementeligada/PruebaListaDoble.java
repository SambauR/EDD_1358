
package com.mycompany.listadoblementeligada;

public class PruebaListaDoble {

    
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        System.out.println("¿La lista esta vacia?");
        System.out.println(lista.estaVacia());
        lista.agregarInicio(1);
        System.out.println("Imprimiendo lista");
        lista.transversal();
        System.out.println("¿La lista esta vacia?");
        System.out.println(lista.estaVacia());
        System.out.println("Tamaño de la lista \n" + lista.getTamanio());
        lista.agregarFinal(2);
        lista.transversal();
        lista.agregarInicio(0);
        lista.transversal();
        lista.agregarDespuesDe(3, 2);
        lista.agregarFinal(5);
        lista.transversal();
//        //eliminar primero
//        lista.eliminarPrimero();
//        lista.transversal();
//        //eliminar final
//        lista.eliminarFinal();
//        lista.transversal();
        //buscar dato
        System.out.println("El dato que estamos buscando esta en la pos: ");
        System.out.println(lista.buscar(3));
        System.out.println("cambiando un dato de valor");
        //act dato
        lista.actualizar(5, 10);
        lista.transversal();
        System.out.println("El tamaño de esta lista es de "+ lista.getTamanio());
    }
    
}
