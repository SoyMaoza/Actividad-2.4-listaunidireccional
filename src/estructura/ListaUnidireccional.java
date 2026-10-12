package estructura;

import modelo.Paquete;

public class ListaUnidireccional {
    private Nodo primero;
    private int tamanio;

    public ListaUnidireccional() {
        primero = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void vaciar() {
        primero = null;
        tamanio = 0;
    }

    public void insertarAlPrincipio(Paquete paquete) {
        Nodo nuevo = new Nodo(paquete);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        tamanio++;
    }

    public void insertarAlFinal(Paquete paquete) {
        if (estaVacia()) {
            insertarAlPrincipio(paquete);
            return;
        }
        Nodo actual = primero;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(new Nodo(paquete));
        tamanio++;
    }

    public void insertarEnPosicion(int posicion, Paquete paquete) {
        if (posicion < 0 || posicion > tamanio) {
            throw new IndexOutOfBoundsException(
                    "Posicion " + posicion + " invalida. Rango permitido: 0 a " + tamanio + ".");
        }
        if (posicion == 0) {
            insertarAlPrincipio(paquete);
            return;
        }
        Nodo anterior = nodoEn(posicion - 1);
        Nodo nuevo = new Nodo(paquete);
        nuevo.setSiguiente(anterior.getSiguiente());
        anterior.setSiguiente(nuevo);
        tamanio++;
    }

    public Paquete removerAlPrincipio() {
        validarNoVacia("remover");
        Paquete dato = primero.getDato();
        primero = primero.getSiguiente();
        tamanio--;
        return dato;
    }

    public Paquete removerAlFinal() {
        validarNoVacia("remover");
        if (primero.getSiguiente() == null) {
            return removerAlPrincipio();
        }
        Nodo penultimo = primero;
        while (penultimo.getSiguiente().getSiguiente() != null) {
            penultimo = penultimo.getSiguiente();
        }
        Paquete dato = penultimo.getSiguiente().getDato();
        penultimo.setSiguiente(null);
        tamanio--;
        return dato;
    }

    public Paquete removerEnPosicion(int posicion) {
        validarNoVacia("remover");
        validarPosicionExistente(posicion);
        if (posicion == 0) {
            return removerAlPrincipio();
        }
        Nodo anterior = nodoEn(posicion - 1);
        Nodo eliminado = anterior.getSiguiente();
        anterior.setSiguiente(eliminado.getSiguiente());
        eliminado.setSiguiente(null);
        tamanio--;
        return eliminado.getDato();
    }

    public Paquete mostrarAlPrincipio() {
        validarNoVacia("mostrar");
        return primero.getDato();
    }

    public Paquete mostrarAlFinal() {
        validarNoVacia("mostrar");
        Nodo actual = primero;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }

    public Paquete mostrarEnPosicion(int posicion) {
        validarNoVacia("mostrar");
        validarPosicionExistente(posicion);
        return nodoEn(posicion).getDato();
    }

    public int buscarPorGuia(String guia) {
        validarNoVacia("buscar");
        String clave = guia.trim().toUpperCase();
        Nodo actual = primero;
        int posicion = 0;
        while (actual != null) {
            if (actual.getDato().guia().equals(clave)) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("primero -> ");
        Nodo actual = primero;
        while (actual != null) {
            sb.append("[").append(actual.getDato().guia()).append("] -> ");
            actual = actual.getSiguiente();
        }
        return sb.append("null").toString();
    }

    private Nodo nodoEn(int posicion) {
        Nodo actual = primero;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    private void validarNoVacia(String operacion) {
        if (estaVacia()) {
            throw new IllegalStateException("No se puede " + operacion + ": la lista esta vacia.");
        }
    }

    private void validarPosicionExistente(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            throw new IndexOutOfBoundsException(
                    "Posicion " + posicion + " invalida. Rango permitido: 0 a " + (tamanio - 1) + ".");
        }
    }
}
