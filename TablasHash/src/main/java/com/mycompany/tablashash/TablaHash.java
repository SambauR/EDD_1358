package com.mycompany.tablashash;

import java.util.ArrayList;

public class TablaHash<T> {

    ArrayList<ColaADT> TablaHash;
    int tamTabla;

    public TablaHash(int tamanio) {
        this.tamTabla = tamanio;
        TablaHash = new ArrayList<>();
        for (int i = 0; i < tamanio; i++) {
            TablaHash.add(new ColaADT<>());
        }
    }

    public boolean comprobar(int numero) {
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        }
        if (numero == 2) {
            primo = true;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public void agregar(int llave, T valor) {
        int lugar = llave % tamTabla;
        TablaHash.get(lugar).agregar(valor);
    }

    public T valorDe(int llave) {
        int lugar = llave % tamTabla;
        T dato = null;
        ColaADT temp = TablaHash.get(lugar);
        ColaADT temp2 = new ColaADT<>();
        Llave tempLlave = (Llave) temp.quitar();
        temp2.agregar(tempLlave);
        boolean stop = true;

        while (stop) {
            if (tempLlave.getLlave() == llave || temp2.vacia()) {
                stop = false;
                if (!temp2.vacia()) {
                    dato = (T) tempLlave.getElem();
                }
            } else {
                tempLlave = (Llave) temp.quitar();
                temp2.agregar(tempLlave);
            }
        }
        while (!temp2.vacia()) {
            temp.agregar(temp2.quitar());
        }

        return dato;
    }

    public void quitar(int llave) {
        int lugar = llave % tamTabla;
        ColaADT temp = TablaHash.get(lugar);
        ColaADT guardar = new ColaADT<>();
        boolean stop = true;
        Llave actual = null;

        try {
            actual = (Llave) temp.quitar();
            guardar.agregar(actual);

        } catch (ClassCastException e) {
            stop = false;
        }
        while (stop) {
            if (actual.getLlave() == llave || guardar.vacia()) {
                stop = false;
                if (!guardar.vacia()) {
                    guardar.quitar();
                }
            } else {
                actual = (Llave) temp.quitar();
                guardar.agregar(actual);
            }
        }
        while (!guardar.vacia()) {
            temp.quitar();
        }

    }

    public class Llave<T> {

        private int llave;
        private T elem;

        public Llave(int llave, T dato) {
            this.elem = dato;
            this.llave = llave;
        }

        public int getLlave() {
            return llave;
        }

        public void setLlave(int llave) {
            this.llave = llave;
        }

        public T getElem() {
            return elem;
        }

        public void setElem(T elem) {
            this.elem = elem;
        }
    }
}
