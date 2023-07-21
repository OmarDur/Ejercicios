public class numerospares_entre_10_50 {
    public static void main(String[] args) {
        int[] numerosPares = new int[21];
        int indice = 0;


        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                numerosPares[indice] = i;
                indice++;
            }
        }


        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println(numerosPares[i]);
        }
    }
}

