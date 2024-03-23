import java.util.Scanner;

public class Exercicio3 {

    public static void DobroSegundoVetor(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o numero de elementos no array: \n");
        int Array[] = new int[scanner.nextInt()];

        int SegundoArray[] = new int[Array.length];

        for (int i = 0; i < Array.length; i++) {
            
            System.out.println("\nInforme o numero: \n");
            Array[i] = scanner.nextInt();

            SegundoArray[i] = Array[i] * 2;

        }

        for (int i = 0; i < Array.length; i++) {
            
            System.out.printf("\n Valor do primeiro Array: %d Segundo Array: %d \n",Array[i],SegundoArray[i]);

        }

        scanner.close();

    }

}
