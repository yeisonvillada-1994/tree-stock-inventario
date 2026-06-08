# 🌳 Tree-Stock: Sistema de Inventario con Árbol Binario de Búsqueda

## 📌 Objetivo

Desarrollar una aplicación de consola en Java que implemente un **Árbol Binario de Búsqueda** para gestionar un inventario de productos. El sistema permite registrar, buscar y listar productos de manera ordenada, aplicando conceptos de **estructuras de datos, recursividad y manejo de referencias en árboles binarios**.

---

## 📋 Descripción del Proyecto

**Tree-Stock** es un sistema de inventario desarrollado en Java que utiliza un **Árbol Binario de Búsqueda (BST)** como estructura principal para almacenar productos organizados por ID.

El programa permite:

- ✅ Registrar productos  
- ✅ Buscar productos por ID  
- ✅ Mostrar el inventario ordenado mediante recorrido inorden  
- ✅ Interactuar mediante un menú en consola  
- ✅ Validar entradas del usuario  

---

## 🏗️ Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

### 📦 Producto.java
Representa cada nodo del árbol binario.

**Atributos principales:**
- `id`: identificador único del producto  
- `nombre`: nombre del producto  
- `izquierdo`: referencia al hijo izquierdo  
- `derecho`: referencia al hijo derecho  

---

### 🌲 ArbolInventario.java
Contiene la lógica del árbol binario de búsqueda.

**Funciones principales:**
- Insertar productos  
- Buscar productos por ID  
- Mostrar productos ordenados (recorrido inorden)  
- Verificar si el inventario está vacío  

---

### 🖥️ Main.java
Contiene el menú interactivo del sistema.

**Opciones disponibles:**
1. Registrar producto  
2. Mostrar inventario  
3. Buscar producto  
0. Salir  

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

## 👨‍💻 Sustentación

Para una explicación detallada de cómo funcionan los punteros en el árbol y la lógica recursiva, consulta el video de sustentación adjunto (máximo 3 minutos).

---

## 📄 Autor

**Proyecto Final - Estructuras de Datos**  
Sistema de Inventario Tree-Stock  


---

**¡Gracias por usar Tree-Stock!** 🌳✨
