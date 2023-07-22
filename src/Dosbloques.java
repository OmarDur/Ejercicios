import java.util.Scanner;
public class Dosbloques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el tamaño de los bloques
        System.out.print("Ingrese el tamaño del primer bloque de números enteros: ");
        int tamBloque1 = sc.nextInt();

        System.out.print("Ingrese el tamaño del segundo bloque de números enteros: ");
        int tamBloque2 = sc.nextInt();

        // Crear los arrays para los bloques de números
        int[] bloque1 = new int[tamBloque1];
        int[] bloque2 = new int[tamBloque2];

        // Pedir los datos para el primer bloque
        System.out.println("Ingrese los datos para el primer bloque:");
        for (int i = 0; i < tamBloque1; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            bloque1[i] = sc.nextInt();
        }

        // Pedir los datos para el segundo bloque
        System.out.println("Ingrese los datos para el segundo bloque:");
        for (int i = 0; i < tamBloque2; i++) {
            System.out.print("Dato " + (i + 1) + ": ");
            bloque2[i] = sc.nextInt();
        }

        // Encontrar el mayor dato en cada bloque
        int mayorBloque1 = encontrarMayor(bloque1);
        int mayorBloque2 = encontrarMayor(bloque2);

        // Mostrar los resultados
        System.out.println("El mayor dato en el primer bloque es: " + mayorBloque1);
        System.out.println("El mayor dato en el segundo bloque es: " + mayorBloque2);

        sc.close();
    }

    // Método para encontrar el mayor dato en un bloque de números
    public static int encontrarMayor(int[] bloque) {
        int mayor = bloque[0];
        for (int i = 1; i < bloque.length; i++) {
            if (bloque[i] > mayor) {
                mayor = bloque[i];
            }
        }
        return mayor;
    }
}
