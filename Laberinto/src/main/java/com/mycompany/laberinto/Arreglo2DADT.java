package com.mycompany.laberinto;

public class Arreglo2DADT<T> {

    private ArregloADT filas;
    private ArregloADT columnas;
    private int renglonesTamanio, columnasTamanio;

    public Arreglo2DADT(int ren, int col) {

        filas = new ArregloADT(ren);
        columnas = new ArregloADT(col);
        this.renglonesTamanio = ren;
        this.columnasTamanio = col;

        for (int i = 0; i < renglonesTamanio; i++) {
            ArregloADT listaLlenado = new ArregloADT(columnasTamanio);
            for (int contador = 0; contador < columnasTamanio; contador++) {
                listaLlenado.setElemento(i, contador);
            }
            filas.setElemento(listaLlenado, i);
        }
    }

    public void limpiar(T dato) {
        for (int i = 0; i < renglonesTamanio; i++) {
            for (int j = 0; j < columnasTamanio; j++) {
                columnas.setElemento(dato, j);
            }
            filas.setElemento(columnas, i);
        }
    }

    public int getFilas() {
        return this.renglonesTamanio;
    }

    public int getColumnas() {
        return this.columnasTamanio;
    }

    public void setElemento(int ren, int col, T dato) {

        if (comprobarLimite(ren, col)) {
            ArregloADT cambioVariable = (ArregloADT) filas.getElemento(ren);
            cambioVariable.setElemento(dato, col);
            filas.setElemento(cambioVariable, ren);

        }
    }

    public T getElemento(int r, int c) {
        if (comprobarLimite(r, c)) {
            ArregloADT cambioVariable = (ArregloADT) filas.getElemento(r);
            return (T) cambioVariable.getElemento(c);
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
        return filas.toString();
    }

    private boolean comprobarLimite(int r, int c) {
        return (r < this.renglonesTamanio && c < columnasTamanio);
    }
}
