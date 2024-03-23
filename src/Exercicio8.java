import java.util.Scanner;

public class Exercicio8 {

    public static void ConcatArray(){

        Scanner scanner = new Scanner(System.in);

        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[10];

        int j = 0;

        for (int i = 0; i < A.length; i++) {
            

            System.out.printf("\nInforme o valor no primeiro Arary: ");
            A[i] = scanner.nextInt();

            C[i] = A[i];


            System.out.printf("\nInforme o valor no Segundo Arary: ");
            B[i] = scanner.nextInt();
            C[i + 1] = B[i];

        }
   


    }

}
