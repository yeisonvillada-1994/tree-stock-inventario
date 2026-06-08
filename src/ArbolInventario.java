/**
 * Clase ArbolInventario
 * Implementa las operaciones principales: Insertar, Buscar y Recorrido Inorden
 */
public class ArbolInventario {
    private Producto raiz;

    /** Constructor del árbol de inventario */
    public ArbolInventario() {
        this.raiz = null;
    }

    /** Método público para insertar un producto */
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    /** Método privado para insertar un producto en el árbol */
    private Producto insertarRecursivo(Producto nodo, int id, String nombre) {
        if (nodo == null) {
            return new Producto(id, nombre);
        }
        if (id < nodo.getId()) {
            nodo.setIzquierdo(insertarRecursivo(nodo.getIzquierdo(), id, nombre));
        } else if (id > nodo.getId()) {
            nodo.setDerecho(insertarRecursivo(nodo.getDerecho(), id, nombre));
        } else {
            System.out.println("⚠️  Error: El ID " + id + " ya existe en el inventario.");
        }
        return nodo;
    }

    /** Método público para buscar un producto por ID */
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    /** Método privado para buscar un producto */
    private Producto buscarRecursivo(Producto nodo, int id) {
        if (nodo == null) {
            return null;
        }
        if (id == nodo.getId()) {
            return nodo;
        } else if (id < nodo.getId()) {
            return buscarRecursivo(nodo.getIzquierdo(), id);
        } else {
            return buscarRecursivo(nodo.getDerecho(), id);
        }
    }

    /** Método público para realizar recorrido inorden del árbol */
    public void recorridoInorden() {
        if (raiz == null) {
            System.out.println("⚠️  El inventario está vacío.");
            return;
        }
        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("          📦 INVENTARIO ORDENADO (INORDEN)");
        System.out.println("═══════════════════════════════════════════════════");
        recorridoInordenRecursivo(raiz);
        System.out.println("═══════════════════════════════════════════════════\n");
    }

    /** Método privado para recorrido inorden (Izquierda-Raíz-Derecha) */
    private void recorridoInordenRecursivo(Producto nodo) {
        if (nodo != null) {
            recorridoInordenRecursivo(nodo.getIzquierdo());
            System.out.println("  ✓ " + nodo);
            recorridoInordenRecursivo(nodo.getDerecho());
        }
    }

    /** Método para verificar si el árbol está vacío */
    public boolean estaVacio() {
        return raiz == null;
    }
}