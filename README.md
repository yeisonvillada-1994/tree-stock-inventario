# 🌳 Tree-Stock: Sistema de Inventario con Árbol Binario de Búsqueda

## 📌 Objetivo

Desarrollar una aplicación de consola en Java que implemente un **Árbol Binario de Búsqueda (BST - Binary Search Tree)** para gestionar un inventario de productos. El sistema permite registrar, buscar y listar productos de forma ordenada, demostrando el funcionamiento de estructuras de datos recursivas y punteros en árboles.

---

## 📋 Descripción del Proyecto

**Tree-Stock** es un sistema de inventario que utiliza un árbol binario de búsqueda como estructura de datos principal. Los productos se organizan por ID, permitiendo búsquedas y recorridos eficientes.

### Características principales:
- ✅ **Inserción recursiva** de productos por ID
- ✅ **Búsqueda** de productos por ID
- ✅ **Recorrido inorden** para listar inventario ordenado
- ✅ **Interfaz de menú interactivo** en consola
- ✅ **Validación de entrada** y manejo de errores

---

## 🏗️ Estructura del Proyecto

### Clases implementadas:

#### 1. **Producto.java** (El Nodo)
Representa cada nodo del árbol binario.
- **Atributos:**
  - `int id`: Identificador único del producto
  - `String nombre`: Nombre del producto
  - `Producto izquierdo`: Puntero al nodo hijo izquierdo
  - `Producto derecho`: Puntero al nodo hijo derecho

#### 2. **ArbolInventario.java** (La Lógica)
Implementa todas las operaciones del árbol binario de búsqueda.
- **Métodos principales:**
  - `insertar(int id, String nombre)`: Inserta un producto de forma recursiva
  - `recorridoInorden()`: Lista todos los productos ordenados por ID
  - `buscar(int id)`: Busca un producto por su ID
  - `estaVacio()`: Verifica si el inventario está vacío

#### 3. **Main.java** (La Interfaz)
Presenta un menú interactivo para el usuario.
- **Opciones del menú:**
  - **1. Registrar Producto**: Solicita ID y nombre del producto
  - **2. Mostrar Inventario**: Ejecuta recorrido inorden
  - **3. Buscar Producto**: Busca un producto por ID
  - **0. Salir**: Cierra la aplicación

---

## 🚀 Cómo ejecutar

### Requisitos:
- Java JDK 8 o superior (recomendado: Eclipse Temurin)
- VS Code o cualquier editor de texto

### Pasos de ejecución:

**Opción 1: Desde VS Code**
1. Abre el proyecto en VS Code
2. Instala la extensión "Extension Pack for Java" (si no está instalada)
3. Navega a la carpeta `src/`
4. Abre el archivo `Main.java`
5. Presiona `Ctrl + F5` o haz clic en "Run" arriba del método `main()`

**Opción 2: Desde terminal (PowerShell/CMD)**
```bash
# Navega a la carpeta del proyecto
cd proyecto_final

# Compila todos los archivos Java
javac src/*.java

# Ejecuta la aplicación
java -cp src Main
```

**Opción 3: Compilar manualmente en VS Code**
```bash
# En la terminal integrada de VS Code
cd src
javac *.java
java Main
```

---

## 📸 Capturas de Pantalla de Ejecución

### Pantalla 1: Menú Principal
```
╔════════════════════════════════════════════════════╗
║    🌳 SISTEMA DE INVENTARIO TREE-STOCK 🌳       ║
║       Árbol Binario de Búsqueda (BST)            ║
╚════════════════════════════════════════════════════╝

┌────────────────────────────────────────────────────┐
│                    📋 MENÚ PRINCIPAL              │
├────────────────────────────────────────────────────┤
│  1. 🆕 Registrar Producto                          │
│  2. 📋 Mostrar Inventario                          │
│  3. 🔍 Buscar Producto                             │
│  0. 🚪 Salir                                       │
└────────────────────────────────────────────────────┘
```

### Pantalla 2: Registrar Productos
```
┌────────────────────────────────────────────────────┐
│        ➕ REGISTRAR NUEVO PRODUCTO                 │
└────────────────────────────────────────────────────┘

Selecciona una opción: 1
Ingresa el ID del producto (número entero): 50
Ingresa el nombre del producto: Laptop
✅ Producto registrado correctamente.

[El usuario continúa registrando más productos...]
```

### Pantalla 3: Mostrar Inventario (Recorrido Inorden)
```
═══════════════════════════════════════════════════
          📦 INVENTARIO ORDENADO (INORDEN)
═══════════════════════════════════════════════════
  ✓ ID: 10 | Nombre: Monitor
  ✓ ID: 25 | Nombre: Teclado
  ✓ ID: 50 | Nombre: Laptop
  ✓ ID: 75 | Nombre: Mouse
  ✓ ID: 100 | Nombre: Webcam
═══════════════════════════════════════════════════
```

### Pantalla 4: Buscar Producto
```
┌────────────────────────────────────────────────────┐
│         🔍 BUSCAR PRODUCTO POR ID                  │
└────────────────────────────────────────────────────┘

Selecciona una opción: 3
Ingresa el ID del producto a buscar: 50

✅ Producto encontrado:
   ID: 50 | Nombre: Laptop
```

---

## 🔑 Conceptos Clave Implementados

### 1. **Árbol Binario de Búsqueda (BST)**
- Estructura jerárquica con raíz, nodos internos y hojas
- Propiedad: `izquierdo.id < padre.id < derecho.id`

### 2. **Recursión**
- **Inserción recursiva**: Recorre el árbol hasta encontrar la posición correcta
- **Búsqueda recursiva**: Navega por el árbol comparando IDs
- **Recorrido inorden recursivo**: Izquierda → Raíz → Derecha

### 3. **Punteros (Referencias en Java)**
- Cada nodo apunta a sus hijos: `Producto izquierdo` y `Producto derecho`
- La raíz es la entrada al árbol: `Producto raiz`
- Cuando un puntero es `null`, significa que no hay hijo en esa dirección

### 4. **Complejidad**
- **Inserción**: O(log n) en promedio, O(n) en peor caso
- **Búsqueda**: O(log n) en promedio, O(n) en peor caso
- **Recorrido inorden**: O(n)

---

## 📊 Ejemplo de Árbol

Si insertamos en este orden: 50, 25, 75, 10, 30, 60, 100

El árbol resultante es:
```
        50
       /  \
      25   75
     / \   / \
    10 30 60 100
```

**Recorrido inorden**: 10, 25, 30, 50, 60, 75, 100 ✅

---

## 🎯 Metodología de Desarrollo

- **Herramientas**: VS Code + JDK de Eclipse Temurin
- **Control de versiones**: Git con commits claros y descriptivos
- **Estructura**: Código limpio y bien comentado
- **Validación**: Manejo de excepciones y entrada del usuario

---

## 📝 Commits Realizados

```
commit 1: Initial project structure and Producto.java class
commit 2: ArbolInventario.java implementation with recursive methods
commit 3: Main.java with interactive menu and complete functionality
```

---

## 📚 Referencias y Recursos

- **Documentación oficial Java**: https://docs.oracle.com/javase/tutorial/
- **Árbol Binario de Búsqueda**: Concepto fundamental de estructuras de datos
- **Recursión en Java**: Pattern clave en operaciones de árboles

---

## 👨‍💻 Sustentación

Para una explicación detallada de cómo funcionan los punteros en el árbol y la lógica recursiva, consulta el video de sustentación adjunto (máximo 3 minutos).

---

## 📄 Autor

**Proyecto Final - Estructuras de Datos**  
Sistema de Inventario Tree-Stock  
Junio 2026

---

**¡Gracias por usar Tree-Stock!** 🌳✨
