public class BuscaVetor {
    public static void main(String[] args) {
        int[] vetor = new int[10000000];
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] == 10000000) {
                System.out.println(10000000 + " está na lista");
                encontrado = true;
            }

        if (!encontrado)
            System.out.println(10000000 + " não está na lista");
   }
}