import java.util.Arrays;
import java.util.Scanner;

public class Exercicio14 {

    public static void MaiorUltimaPosicao(){

        Scanner scanner = new Scanner(System.in);

        int vet[] = new int[5];

        int indice = 0;

        for (int i = 0; i < vet.length; i++) {
            
            System.out.println("Informe o valor do vetor");
            vet[i] = scanner.nextInt();

     
        }


        int IndiceMaior = vet[0];

        for (int i = 0; i < vet.length; i++) {
            
            if(IndiceMaior < vet[i]){

                IndiceMaior = vet[i];
                indice = i;

            }

        }

        System.out.println("Vetor antes: " + Arrays.toString(vet));

        int aux = vet[4];

        vet[4] = IndiceMaior;

        vet[indice] = aux;

        System.out.println("Array depois da troca: " + Arrays.toString(vet));
    
        scanner.close();

    }

}
