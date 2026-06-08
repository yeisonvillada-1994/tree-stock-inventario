import java.util.Scanner;

/**
 * Clase Main (Interfaz del Usuario)
 * Presenta un menú interactivo para gestionar el inventario
 */
public class Main {
    private static ArbolInventario inventario;
    private static Scanner scanner;

    public static void main(String[] args) {
        inventario = new ArbolInventario();
        scanner = new Scanner(System.in);

        int opcion;
        boolean salir = false;

        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║    🌳 SISTEMA DE INVENTARIO TREE-STOCK 🌳       ║");
        System.out.println("║       Árbol Binario de Búsqueda (BST)            ║");
        System.out.println("╚════════════════════════════════════════════════════╝\n");

        while (!salir) {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        registrarProducto();
                        break;
                    case 2:
                        mostrarInventario();
                        break;
                    case 3:
                        buscarProducto();
                        break;
                    case 0:
                        salir = true;
                        System.out.println("\n✅ ¡Hasta luego! Gracias por usar Tree-Stock.\n");
                        break;
                    default:
                        System.out.println("\n❌ Opción inválida. Por favor, selecciona una opción válida.\n");
                }
            } catch (Exception e) {
                System.out.println("\n❌ Error: Entrada inválida. Por favor, ingresa un número.\n");
                scanner.nextLine(); // Limpiar buffer en caso de error
            }
        }

        scanner.close();
    }

    /**
     * Muestra el menú principal
     */
    private static void mostrarMenu() {
        System.out.println("┌────────────────────────────────────────────────────┐");
        System.out.println("│                    📋 MENÚ PRINCIPAL              │");
        System.out.println("├────────────────────────────────────────────────────┤");
        System.out.println("│  1. 🆕 Registrar Producto                          │");
        System.out.println("│  2. 📋 Mostrar Inventario                          │");
        System.out.println("│  3. 🔍 Buscar Producto                             │");
        System.out.println("│  0. 🚪 Salir                                       │");
        System.out.println("└────────────────────────────────────────────────────┘");
    }

    /**
     * Opción 1: Registrar un nuevo producto
     */
    private static void registrarProducto() {
        System.out.println("\n┌────────────────────────────────────────────────────┐");
        System.out.println("│        ➕ REGISTRAR NUEVO PRODUCTO                 │");
        System.out.println("└────────────────────────────────────────────────────┘");

        try {
            System.out.print("Ingresa el ID del producto (número entero): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            System.out.print("Ingresa el nombre del producto: ");
            String nombre = scanner.nextLine();

            if (nombre.trim().isEmpty()) {
                System.out.println("❌ Error: El nombre del producto no puede estar vacío.\n");
                return;
            }

            inventario.insertar(id, nombre);
            System.out.println("✅ Producto registrado correctamente.\n");

        } catch (Exception e) {
            System.out.println("❌ Error: Entrada inválida. Por favor, verifica los datos.\n");
            scanner.nextLine(); // Limpiar buffer
        }
    }

    /**
     * Opción 2: Mostrar inventario ordenado
     */
    private static void mostrarInventario() {
        inventario.recorridoInorden();
    }

    /**
     * Opción 3: Buscar un producto por ID
     */
    private static void buscarProducto() {
        System.out.println("\n┌────────────────────────────────────────────────────┐");
        System.out.println("│         🔍 BUSCAR PRODUCTO POR ID                  │");
        System.out.println("└────────────────────────────────────────────────────┘");

        try {
            System.out.print("Ingresa el ID del producto a buscar: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            Producto producto = inventario.buscar(id);

            if (producto != null) {
                System.out.println("\n✅ Producto encontrado:");
                System.out.println("   " + producto);
                System.out.println();
            } else {
                System.out.println("\n❌ Producto no encontrado. No existe un producto con ID " + id + ".\n");
            }

        } catch (Exception e) {
            System.out.println("❌ Error: Entrada inválida. Por favor, ingresa un número válido.\n");
            scanner.nextLine(); // Limpiar buffer
        }
    }
}
