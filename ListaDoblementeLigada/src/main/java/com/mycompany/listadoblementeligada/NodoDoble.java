
package com.mycompany.listadoblementeligada;

public class NodoDoble <T> {
   private T dato;
   private NodoDoble <T> siguiente;
   private NodoDoble <T> anterior;
   
   public NodoDoble (){
       
   }
   
   public NodoDoble(T dato){
       this.dato = dato;
   }
   
   public NodoDoble(T dato, NodoDoble <T> siguiente){
       this.dato = dato;
       this.siguiente = siguiente;
   }
   public NodoDoble(T dato, NodoDoble <T> siguiente, NodoDoble<T> anterior){
       this.dato = dato;
       this.siguiente = siguiente;
       this.anterior = anterior;
   }
   
   //metodos
   
   public void setDato (T dato){
       this.dato = dato;
   }
   
   public T getDato(){
       return this.dato;
   }
   
   public void setSiguiente(NodoDoble <T> siguiente){
       this.siguiente = siguiente;
   }
   
   public NodoDoble <T> getSiguiente(){
       return this.siguiente;
   }
   
   public void setAnterior(NodoDoble <T> anterior){
       this.anterior = anterior;
   }
   
   public NodoDoble <T> getAnterior(){
       return this.anterior;
   }
   
   @Override
   public String toString(){
        return "|" + dato + "| -->";
   }
   
}
