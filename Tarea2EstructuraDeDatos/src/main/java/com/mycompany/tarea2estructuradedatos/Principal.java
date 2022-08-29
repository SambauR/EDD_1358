package com.mycompany.tarea2estructuradedatos;

public class Principal {

    public static void main(String[] args) {
        ArregloADT numeros = new ArregloADT(5);
        numeros.setElemento(0,"hola");
        numeros.setElemento(1, 2);
        numeros.setElemento(2, 2);
        numeros.setElemento(3, "prueba");
        numeros.setElemento(4, 'a');
//        System.out.print(numeros.getElemento(0) + ", ");
//        System.out.print(numeros.getElemento(1) + ", ");
//        System.out.print(numeros.getElemento(2) + ", ");
//        System.out.print(numeros.getElemento(4));
        System.out.println("\nel tamaño del arreglo es de: "
                + numeros.getTamanio() + " elementos");
        System.out.println("la longitud del arreglo es de: " + numeros.getLongitud());
//        numeros.limpiar();
//        System.out.print(numeros.getElemento(0) + ", ");
//        System.out.print(numeros.getElemento(1) + ", ");
//        System.out.print(numeros.getElemento(2) + ", ");
//        System.out.print(numeros.getElemento(4));
//        numeros.setElemento(0, "\nPrimer elemento después del método limpiar");
//        System.out.println(numeros.getElemento(0) + ", " + numeros.getElemento(1));
//        
        System.out.println("usando toString");
        System.out.println(numeros.toString());
      
    }
    

}
