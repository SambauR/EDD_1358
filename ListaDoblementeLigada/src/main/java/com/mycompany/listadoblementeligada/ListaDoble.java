package com.mycompany.listadoblementeligada;

public class ListaDoble<T> {
    
    private NodoDoble<T> head;
    private int tam;
    
    public ListaDoble() {
        this.head = null;
        this.tam = 0;
    }
    
    public boolean estaVacia() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getTamanio() {
        return this.tam;
    }
    
    public void agregarInicio(T valor) {
        NodoDoble temp = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = temp;
        } else {
            temp.setSiguiente(this.head);
            head.setAnterior(temp);
            this.head = temp;
        }
        tam +=1;
    }
    
    public void agregarFinal(T valor) {
        NodoDoble<T> temp2 = new NodoDoble(valor);
        if (this.estaVacia()) {
            this.head = temp2;
        } else {
            NodoDoble<T> aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            temp2.setAnterior(aux);
            aux.setSiguiente(temp2);
            aux = null;            
        }
        tam+=1;
    }
    
    public void agregarDespuesDe(T dato, int pos) {
        NodoDoble nuevo = new NodoDoble(dato);
        NodoDoble aux = head;
        for (int contador = 1; contador <= pos-1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setAnterior(aux.getSiguiente());
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo); 
        tam+=1;        
    }
    
    public void eliminarPrimero() {
        if (this.estaVacia()) {
            System.out.println("La lista está vacía no hay nada que eliminar");
        } else {
            head = head.getSiguiente();
            head.setAnterior(null);
        }
        tam = tam-1;
    }

    public void eliminarFinal() {
        if(this.estaVacia()){
            System.out.println("La lista está vacía no hay nada que eliminar");
        }else{
            NodoDoble<T> aux = this.head;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
        tam = tam-1;
    }

//    public void eliminar(int pos) {
//        NodoDoble aux = head;
//        NodoDoble aux2 = null;
//        for (int contador = 1; contador <= pos; contador++) {
//            aux = aux.getSiguiente();
//        }
//    }

    public int buscar(T dato) {
        int posicion = 1;
            NodoDoble aux = this.head;
            while(aux.getSiguiente()!= null && aux.getDato()!=dato){
                aux=aux.getSiguiente();
                posicion++;
            }           
        return posicion;
    }

    public void actualizar(T dato, T datoNuevo) {
        NodoDoble aux = head;
        while (aux.getDato() != dato) {
            aux = aux.getSiguiente();
        }
        aux.setDato(datoNuevo);
    }

    public void transversal() {
        NodoDoble currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println("");
    }
}
