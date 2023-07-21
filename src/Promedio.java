import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        int cantidadNumeros = 15;
        int[] numeros = new int[cantidadNumeros];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese " + cantidadNumeros + " números:");

        // Leer los números y almacenarlos en el arreglo
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        int suma = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            suma += numeros[i];
        }


        double promedio = (double) suma / cantidadNumeros;

        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
