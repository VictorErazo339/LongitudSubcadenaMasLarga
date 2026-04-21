# La subcadena más larga sin repetir caracteres

Este proyecto entrega una solución eficiente al problema clásico de encontrar la **longitud de la subcadena más larga sin caracteres repetidos** en una cadena de texto dada. Es una excelente demostración de un algoritmo conocido como **Ventana Deslizante (Sliding Window)**.

## 🚀 Características

* **Entrada dinámica:** Permite al usuario ingresar cualquier cadena de texto desde la consola.
* **Algoritmo optimizado:** Utiliza una estructura de datos `HashSet` para lograr una complejidad de tiempo lineal.
* **Validación:** Maneja casos básicos como cadenas nulas o vacías.

## 🛠️ Tecnologías Utilizadas

* **Estructuras de datos:** `HashSet` (para verificar a que no se repitan caracteres).
* **Entrada/Salida:** `java.util.Scanner`.

## 📖 Explicación del Código por Secciones

Este código se divide en tres secciones logicas principales:

### 1. Interfaz de Usuario (Método `main`)
Se encarga de la comunicación con el usuario. Utiliza la clase `Scanner` para capturar la entrada del teclado, invoca la función de cálculo y muestra el resultado final en la consola de forma legible.

### 2. Estructura de Datos (El Set)
Se utiliza un `HashSet<Character>` llamado `ventana`. Su función es actuar como una "marco de corto plazo" que almacena los caracteres únicos de la subcadena actual. Si un carácter ya existe en el Set, el programa sabe que debe ajustar la búsqueda.

### 3. Lógica del Algoritmo (Ventana Deslizante)
El corazon del codigo consiste en la función de dos punteros (`izquierda` y `derecha`):
* El puntero **derecha** expande la ventana reccoriendo caracter por caracter.
* Si se encuentra un carácter repetido, el puntero **izquierda** se desplaza hacia adelante, eliminando caracteres del Set hasta que la repetición desaparece.
* En cada iteración, se calcula la distancia entre ambos punteros y se actualiza el valor `maximo` si la longitud actual es superior al récord anterior.

## 💻 Instalación y Ejecución

Para ejecutar este proyecto en tu máquina local, sigue estos pasos:

### Pasos
1. **Clonar o descargar el archivo:**
   ```bash
   git clone https://github.com/VictorErazo339/LongitudSubcadenaMasLarga.git   
  Asegúrate de tener el archivo guardado como `Longitud.java`.

2. **Compilar el código:**
   Abre tu terminal en la carpeta donde esté el archivo (`cd LongitudSubcadenaMasLarga`) y ejecuta:
   ```bash
   javac Longitud.java
   
3. **Ejecutar el programa:**
   Una vez compilado, inicia el programa con:
   ```bash
   java Longitud

4. **Probar su uso:**
   Introduce una frase cuando el programa lo solicite. Ejemplo:
* Entrada: `abcabcbb`
* Resultado: 3 (La subcadena es `"abc"`)

## 📝 Ejemplo de Funcionamiento

1. Si ingresas la palabra `pwwkew`:
2. La ventana empieza en `p`. (Longitud 1)
3. Se expande a `pw`. (Longitud 2)
4. Al llegar a la segunda `w`, la ventana se encoge desde la izquierda hasta que la primera `w` sale.
5. Continúa hasta encontrar `kew`, que es la subcadena más larga sin repetir.
6. El resultado final será `3`.

💡 Este codigo puede ser usado para ingresar secuencias de cualquier tipo de caracteres: letras, numeros y simbolos.

Este proyecto está diseñado para que cualquier desarrollador o estudiante pueda entender no solo **qué** hace el código, sino **cómo** lo logra técnicamente.

## 👤 Integrantes
* Javiera Godoy
* Javiera Gallegos
* Víctor Erazo
* Diego Contreras
* Alexander Hass

*Homies © 2026. Todos los derechos reservados.*
