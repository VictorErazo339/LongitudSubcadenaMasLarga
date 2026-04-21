import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Longitud {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String texto = scanner.nextLine();

        int resultado = longitudSubcadenaMasLarga(texto);

        System.out.println("La Longitud de la subcadena sin repetir caracteres es: " + resultado);

        scanner.close();
    }

    public static int longitudSubcadenaMasLarga(String s) {

        // Validación básica
        if (s == null) {
            return 0;
        }

        Set<Character> ventana = new HashSet<>();
        int izquierda = 0;
        int maximo = 0;

        for (int derecha = 0; derecha < s.length(); derecha++) {

            char actual = s.charAt(derecha);

            // Si el carácter ya existe, reducimos la ventana
            while (ventana.contains(actual)) {
                ventana.remove(s.charAt(izquierda));
                izquierda++;
            }

            // Agregamos el carácter actual
            ventana.add(actual);

            // Calculamos el tamaño de la ventana
            int longitudActual = derecha - izquierda + 1;

            // Actualizamos el máximo
            if (longitudActual > maximo) {
                maximo = longitudActual;
            }
        }

        return maximo;
    }
}