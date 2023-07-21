import java.util.Random;
public class Enteros_Aleatorios {

    public static void main(String[] args) {
        int[] arregloOriginal = new int[10];
        int[] arregloCopia = new int[10];

        // Llenar el arreglo original con números enteros aleatorios entre 50 y 100
        Random random = new Random();
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = random.nextInt(51) + 50;
        }

        // Copiar los números del arreglo original al arreglo copia
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }

        // Imprimir los arreglos original y copia
        System.out.println("Arreglo original:");
        imprimirArreglo(arregloOriginal);

        System.out.println("Arreglo copia:");
        imprimirArreglo(arregloCopia);
    }

    // Método para imprimir los elementos de un arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
