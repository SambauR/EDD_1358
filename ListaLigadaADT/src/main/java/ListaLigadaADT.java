public class ListaLigadaADT<T>{
    private NodoADT <T> head;
    private int tamanio;
    
    public ListaLigadaADT(){
        this.tamanio = 0;
        this.head = null;                
    }
    
     public boolean estaVacia() {
        return this.head == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(T valor) {
        NodoADT nuevo = new NodoADT(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            NodoADT aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void agregarAlInicio(T valor) {
        NodoADT nuevo = new NodoADT(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NodoADT nuevo = new NodoADT(valor);
        NodoADT aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
    }

    public void eliminar(int posicion){
        
        NodoADT aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
    }
    
    public void transversal() {
        NodoADT currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println("");
    }
public static void main(String[] args) {
   ListaLigadaADT L1 = new ListaLigadaADT();
   L1.agregarAlInicio(20);
   L1.agregarAlFinal(21);
   L1.agregarAlFinal(30);
   L1.agregarDespuesDe(1, 2);
   L1.transversal();
}
}
        