package com.mycompany.colasprioridad;

import java.util.ArrayList;

public class ColaADT<T> {

    private ArrayList<T> cola;

    public ColaADT() {
        this.cola = new ArrayList<>();
    }

    public boolean vacia() {
        return cola.isEmpty();
    }

    public int tamanio() {
        return cola.size();
    }

    public void agregar(T nuevo) {
        cola.add(nuevo);
    }

    public T quitar() {
        T elem;
        if (this.vacia()) {
            elem = null;
        } else {
            elem = cola.get(0);
            cola.remove(0);
        }
        return elem;
    }
    public String toString() {
        return "- Queue: " + this.cola + " -";
    }
}
