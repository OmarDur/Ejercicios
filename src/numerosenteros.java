import java.util.Scanner;
public class numerosenteros {
    public static void main(String[] args) {
        int[][] bloques = new int[2][10];
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos del primer bloque
        System.out.println("Introduce los 10 números del primer bloque: ");
        for (int i = 0; i < 10; i++) {
            bloques[0][i] = scanner.nextInt();
        }

        // Pedir los datos del segundo bloque
        System.out.println("Introduce los 10 números del segundo bloque:");
        for (int i = 0; i < 10; i++) {
            bloques[1][i] = scanner.nextInt();
        }

        // Encontrar el mayor dato en el primer bloque
        int mayorBloque1 = encontrarMayorDato(bloques[0]);
        System.out.println("El mayor dato del primer bloque es: " + mayorBloque1);

        // Encontrar el mayor dato en el segundo bloque
        int mayorBloque2 = encontrarMayorDato(bloques[1]);
        System.out.println("El mayor dato del segundo bloque es: " + mayorBloque2);
    }

    // Método para encontrar el mayor dato en un array de enteros
    public static int encontrarMayorDato(int[] array) {
        int mayor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }
}
