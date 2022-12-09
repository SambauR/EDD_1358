package com.mycompany.javacollections;

import java.util.LinkedList;

public class ListaLigada {

    public static void main(String[] args) {
        LinkedList ejemplo1 = new LinkedList();
        
        //le metemos valores a la lista 
        ejemplo1.add(1);
        ejemplo1.add(2);
        ejemplo1.add(3);
        ejemplo1.add(4);
        ejemplo1.add(5);
        ejemplo1.add(6);
        
        //imprimimos esos valores
        System.out.println(ejemplo1);
        //imprimir tamaño
        System.out.println(ejemplo1.size());
        System.out.println("Nueva lista: ");
        //Valores en un indice en específico
        ejemplo1.add(0, 100);
        ejemplo1.add(1, 200);
        System.out.println(ejemplo1);
        System.out.println(ejemplo1.size());
        //eliminar valores
        ejemplo1.remove(1);
        System.out.println("Lista después de eliminar: "+ejemplo1);
        //buscar si hay un elemento      
        System.out.println("El número aparece en la serie?: "
                +ejemplo1.contains(200));
    }

}
