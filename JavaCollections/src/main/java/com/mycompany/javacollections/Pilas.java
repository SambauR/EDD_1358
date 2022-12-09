
package com.mycompany.javacollections;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
       Stack<Integer> numeros = new Stack<> ();
       
       numeros.push(100);
       numeros.push(90);
       numeros.push(50);
       numeros.push(10);
       
        System.out.println("La pila"+ numeros.toString());
        System.out.println("cima: "+numeros.peek());
        //sacar un elemento
        numeros.pop();
        System.out.println("Nueva pila: "+numeros.toString());
        System.out.println("Nueva cima: "+numeros.peek());
        
       //agregar más elementos
       numeros.push(2);
       numeros.push(300);
       numeros.push(400);
       numeros.push(21);
       //mostrar nueva pila
        System.out.println("Nueva pila: "+numeros.toString());
        //pop
        numeros.pop();
        System.out.println(numeros.toString());
    }
    
}
