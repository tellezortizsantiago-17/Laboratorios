# Mi Billetera Java 2.0 (Laboratorio 4)

Aplicación de consola orientada a objetos para el registro y gestión de ingresos y gastos financieros, implementando colecciones y manejo seguro de excepciones.

## Propósito de las clases
* **Movimiento.java:** Representa un registro único e inmutable de una transacción. Lanza excepciones si se intenta instanciar con datos inválidos.
* **Billetera.java:** Contiene la lógica de negocio, validaciones de saldo y gestiona el estado de las colecciones.
* **Main.java:** Gestiona la interfaz del menú por consola e implementa `try-catch` para evitar que el programa se cierre ante entradas inválidas.

## Colecciones Utilizadas
* **`ArrayList<Movimiento>`:** Para conservar el historial completo manteniendo el orden de inserción de cada transacción.
* **`HashSet<String>`:** Para almacenar e imprimir las categorías utilizadas asegurando que no existan duplicados.
* **`HashMap<String, Double>`:** Para agrupar y acumular la suma de todos los gastos organizados por nombre de categoría (clave-valor).

## Compilar y Ejecutar
Abre la terminal en la carpeta `MiBilleteraJava` y ejecuta:
```bash
javac Movimiento.java Billetera.java Main.java
java Main