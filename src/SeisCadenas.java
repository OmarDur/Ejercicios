import java.util.Scanner;
public class SeisCadenas {
    public static void main(String[] args) {
        // Pedir al usuario los dos bloques de 6 cadenas de texto
        String[] bloque1 = pedirCadenas("Bloque 1");
        String[] bloque2 = pedirCadenas("Bloque 2");

        // Pedir al usuario una nueva cadena
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una nueva cadena: ");
        String nuevaCadena = scanner.nextLine();

        // Comprobar si la nueva cadena aparece en alguno de los bloques anteriores
        boolean encontrado = buscarCadenaEnBloques(nuevaCadena, bloque1, bloque2);

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("La cadena aparece en alguno de los bloques anteriores.");
        } else {
            System.out.println("La cadena NO aparece en ninguno de los bloques anteriores.");
        }
    }

    // Método para pedir al usuario un bloque de 6 cadenas de texto
    private static String[] pedirCadenas(String bloque) {
        Scanner scanner = new Scanner(System.in);
        String[] cadenas = new String[6];

        System.out.println("Ingresa las cadenas para " + bloque + ":");
        for (int i = 0; i < 6; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            cadenas[i] = scanner.nextLine();
        }

        return cadenas;
    }

    // Método para comprobar si una cadena aparece en alguno de los bloques
    private static boolean buscarCadenaEnBloques(String cadena, String[] bloque1, String[] bloque2) {
        for (String texto : bloque1) {
            if (texto.contains(cadena)) {
                return true;
            }
        }

        for (String texto : bloque2) {
            if (texto.contains(cadena)) {
                return true;
            }
        }

        return false;
    }
}
