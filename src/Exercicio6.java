import java.util.Scanner;

public class Exercicio6 {

    public static void MediaPonderada(){

            float notas[] = new float[5];

            float pesos[] = new float[5];

            Scanner scanner = new Scanner(System.in);

            float NotaTotal = 0;

            float PesoTotal = 0;


        for (int i = 0; i < pesos.length; i++) {

            
            System.out.printf("\nInforme a nota: ");
            notas[i] = scanner.nextFloat();


            System.out.println();

            System.out.printf("\nInforme o peso: ");
            pesos[i] = scanner.nextFloat();
            

            NotaTotal += notas[i] * pesos[i];

            PesoTotal += pesos[i];

        }

        NotaTotal = NotaTotal / PesoTotal;

        System.out.println("Nota final: " + NotaTotal);

        scanner.close();

    }

}
