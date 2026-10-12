package estructura;

import modelo.Paquete;

public class Nodo {
    private final Paquete dato;
    private Nodo siguiente;

    public Nodo(Paquete dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Paquete getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
