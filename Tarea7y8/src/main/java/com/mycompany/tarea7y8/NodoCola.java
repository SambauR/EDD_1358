
package com.mycompany.tarea7y8;

public class NodoCola<T> {
    
    private T dato;
    private NodoCola<T> siguiente;

    //constructores
    public NodoCola() {

    }

    public NodoCola(T valor) {
        this.dato = valor;
    }

    public NodoCola(T valor, NodoCola<T> siguiente) {
        this.dato = valor;
        this.siguiente = siguiente;
    }
    //metodos

    public NodoCola<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola<T> siguiente) {
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

