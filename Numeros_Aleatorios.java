import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        int suma = 0;

        System.out.println("Ingrese 15 números:");

        // Solicitar los números y almacenarlos en el arreglo
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / 15;

        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}

