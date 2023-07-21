// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //Haz un arreglo con los números pares comprendidos entre 10 y 50
         int[] pares = new int[21];
            int j = 0;
            for (int i = 10; i <= 50; i++) {
                if (i % 2 == 0) {
                    pares[j] = i;
                    j++;
                }
            }

    }
}