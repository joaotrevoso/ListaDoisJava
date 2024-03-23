import java.util.Scanner;

public class Exercicio13 {

    public static void FibonacciTermos(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de n para obter os primeiros n termos da sequência de Fibonacci:");
        int n = scanner.nextInt();

        // Inicializando o vetor para armazenar os termos da sequência de Fibonacci
        int[] fibonacci = new int[n];

        // Definindo os dois primeiros termos da sequência de Fibonacci
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        // Calculando os próximos termos da sequência de Fibonacci
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimindo o vetor com os n primeiros termos da sequência de Fibonacci
        System.out.print("Os primeiros " + n + " termos da sequência de Fibonacci são: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }

}
