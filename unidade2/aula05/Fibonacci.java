public class Fibonacci {
    
    public static int fibRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
    }

    public static int fibIterativo(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] valores = {10, 20, 50, 100, 1000}; //valores 10 e 20 são rápidos, 50 é lento, 100 é inacreditavelmente lento, 1000 é perca de tempo. consumindo 6GB ram em '100' 

        for (int n : valores) {
            System.out.println("Para n = " + n);
            System.out.println("Recursivo: " + fibRecursivo(n));
            System.out.println("Iterativo: " + fibIterativo(n));
            System.out.println("-------------------------");
        }
    }
}