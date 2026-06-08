/**
 * Clase Producto
 * Representa cada nodo del árbol de inventario
 */
public class Producto {
    private int id;
    private String nombre;
    private Producto izquierdo;
    private Producto derecho;

    /** Constructor del nodo Producto */
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public Producto getIzquierdo() { return izquierdo; }
    public Producto getDerecho() { return derecho; }

    // Setters
    public void setIzquierdo(Producto izquierdo) { this.izquierdo = izquierdo; }
    public void setDerecho(Producto derecho) { this.derecho = derecho; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre;
    }
}