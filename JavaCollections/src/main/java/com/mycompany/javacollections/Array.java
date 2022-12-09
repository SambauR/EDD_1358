
package com.mycompany.javacollections;
import java.util.ArrayList;
public class Array {

    public static void main(String[] args) {
        ArrayList prueba1= new ArrayList();
        
        //ahora vamos a mostrar el tamaño del arraylist
        System.out.println("El tamaño de la lista es: " + prueba1.size());
        //le agregamos elementos a nuestra lista
        prueba1.add("A");
        prueba1.add("B");
        prueba1.add("C");
        prueba1.add("D");
        prueba1.add("E");
        prueba1.add("F");
        //volvemos a imprimir después de agregar valores al array
        System.out.println("El tamaño ahora es de: "+ prueba1.size());
        //ahora podemos mostrar todos los elementos del arraylist
        System.out.println("Mostrando la lista" + prueba1);
        //podemos eliminar elementos de esta lista por índice
        prueba1.remove(2);
        System.out.println("Lista después de eliminar lo que estuviera en"
                + "la posicion 2: "+prueba1);
        System.out.println("Tamaño ahora: "+prueba1.size());
        //o dando el elemento que queremos eliminar
        prueba1.remove("A");
        System.out.println("Lista después de eliminar la letra A: "+prueba1);
        System.out.println("Tamaño: "+prueba1.size());
        //verificar si existe algun elemento en especifico LA LETRA H por ejemplo
        System.out.println("El arraylist tiene la letra H: "
                +prueba1.contains("H"));
    }
    
}
