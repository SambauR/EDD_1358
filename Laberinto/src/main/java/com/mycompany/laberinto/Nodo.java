//reutilicé el codigo de la clase nodo para las pilas en este ejercicio

package com.mycompany.laberinto;
public class Nodo<T> {
   

    private T dato;
    private Nodo<T> siguiente;

    //constructores
    public Nodo() {

    }

    public Nodo(T valor) {
        this.dato = valor;
    }

    public Nodo(T valor, Nodo<T> siguiente) {
        this.dato = valor;
        this.siguiente = siguiente;
    }
    //metodos

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "|" + dato + "| -->";
    }
}

   
