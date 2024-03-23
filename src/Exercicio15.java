import java.util.Scanner;

public class Exercicio15 {

    public static void PreencherMaior(){

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5]; // Vetor para armazenar os números

        // Lendo o primeiro número e armazenando-o no vetor
        System.out.println("Digite o 1º número:");
        vetor[0] = scanner.nextInt();

        // Lendo os próximos 4 números e aplicando a regra
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite o próximo número:");
            int numero = scanner.nextInt();

            // Verificando se o número lido é maior que o anterior
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Por favor, digite um número maior que o anterior.");
                i--; // Permite que o usuário insira novamente o número atual
            }
        }

        // Imprimindo o vetor preenchido
        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

}
