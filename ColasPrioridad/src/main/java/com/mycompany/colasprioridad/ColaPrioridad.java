package com.mycompany.colasprioridad;

public class ColaPrioridad<T> {

    private ColaADT[] cola;
    private int tamanio;
    private int cantidadNiveles;

    public ColaPrioridad(int nivelPrioridad) {
        this.tamanio = 0;
        this.cantidadNiveles = nivelPrioridad;
        this.cola = new ColaADT[nivelPrioridad];   
        for (int i = 0; i < nivelPrioridad; i++) {
            cola[i] = new ColaADT<>();
        }
    }
    
    public boolean Vacia() {
        return tamanio == 0;
    }

    public int Tamanio() {
        return tamanio;
    }

    public T Agregar(int prioridad, T nuevo) {
        if (prioridad < cantidadNiveles) {
            cola[prioridad].agregar(nuevo);
            tamanio++;
        } else {
            System.out.println("No existe esa cantidad de niveles");
        }
        return nuevo;
    }

    public T Quitar() {
        T aux = null;
        for (int i = 0; tamanio == cantidadNiveles; i++) {
            if (!cola[i].vacia()) {
                aux = (T) cola[i].quitar();
            }
        }
        tamanio--;
        return aux;
    }
}
