package com.mycompany.laberinto;

public class PilasADT<T> {

    private Nodo<T> top;
    private int tam;

    public PilasADT() {
        this.top = null;
        this.tam = 0;
    }

    public int getLongitud() {
        return tam;
    }

    public boolean estaVacia() {
        return top == null;
    }

    public void push(T valor) {
        Nodo nuevo = new Nodo<T>(valor, top);
        this.top = nuevo;
        this.tam++;
    }

    public T pop() {
        T aux;
        if (this.estaVacia()) {
            return null;
        } else {
            aux = top.getDato();
            top = top.getSiguiente();
            this.tam--;
            return aux;
        }
    }

    public T peek() {
        if (this.estaVacia()) {
            return null;
        } else {
            return top.getDato();
        }
    }

    public void transversal() {
        Nodo currNode = this.top;
        while (currNode != null) {
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        PilasADT Pila1 = new PilasADT();
        Pila1.push(1);
        Pila1.push(2);
        Pila1.push(3);
        Pila1.push(4);
        Pila1.transversal();
    }
}
