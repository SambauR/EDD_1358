package com.mycompany.tarea2estructuradedatos;

public class ArregloADT {

    private int tamanio;
    private int longitud;
    private Object[] dato;
    private int elemento;
//    private String cadena;

    public ArregloADT(int tamanio) {
        this.tamanio = tamanio;
        this.longitud = longitud;
        dato = new Object[tamanio];
        this.elemento = elemento;
    }

    public int getLongitud() {
        longitud = tamanio - 1;
        return longitud;
    }
    //metodos

    public void setElemento(int indice, Object elemento) {
        if (indice >= 0 && indice < this.tamanio) {
            dato[indice] = elemento;
        }
    }

    public Object getElemento(int indice) {
        if (indice >= 0 && indice < this.tamanio) {
            return dato[indice];
        }
        return null;
    }

    public Object limpiar() {
        for (int i = 0; i < this.tamanio; i++) {
            dato[i] = dato[elemento];
            dato[elemento] = null;
        }
        return dato[elemento];
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < dato.length; i++) {
            res += dato[i] + " ";
        }
        return res;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Object[] getDato() {
        return dato;
    }

    public void setDato(Object[] dato) {
        this.dato = dato;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

}
