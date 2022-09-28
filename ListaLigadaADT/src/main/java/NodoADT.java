
public class NodoADT<T> {

    private T dato;
    private NodoADT<T> siguiente;

    //constructores
    public NodoADT() {

    }

    public NodoADT(T valor) {
        this.dato = valor;
    }

    public NodoADT(T valor, NodoADT<T> siguiente) {
        this.dato = valor;
        this.siguiente = siguiente;
    }
    //metodos

    public NodoADT<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoADT<T> siguiente) {
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
