import java.util.Random;

public class arreglodel100al50 {
    public static void main(String[] args) {
        // Crear el primer arreglo
        int[] arregloOriginal = new int[10];


        Random random = new Random();
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = random.nextInt(51) + 50;
        }


        int[] arregloCopia = new int[10];


        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }


        System.out.println("Arreglo original:");
        for (int numero : arregloOriginal) {
            System.out.print(numero + " ");
        }
        System.out.println();

        System.out.println("Arreglo copia:");
        for (int numero : arregloCopia) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}

