package com.mycompany.tarea7y8;

public class Cola<T> {

    private NodoCola<T> primero;
    private NodoCola<T> ultimo;
    private int tamanio;

    public Cola() {
        this.primero = primero;
        this.ultimo = ultimo;
        this.tamanio = tamanio;
    }

    public boolean EstaVacia() {
        return this.primero == null;
    }

    public void Agregar(T elemento) {
        NodoCola nuevo = new NodoCola(elemento);
        if (EstaVacia()) {
            this.primero = nuevo;
        } else {
            this.ultimo.setSiguiente(nuevo);
        }
        ultimo = nuevo;
        tamanio++;
    }

    public T Quitar() {
        T aux = primero.getDato();
        primero = primero.getSiguiente();
        tamanio--;
        return aux;
    }
    public int Tamanio() {
        return tamanio;
    }
}
