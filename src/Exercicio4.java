import java.util.Scanner;

public class Exercicio4 {

    public static void MaiorQueN(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o numero de elementos no array: \n");
        int Array[] = new int[scanner.nextInt()];

        System.out.println("\nInforme o valor de n:  \n");
        int n = scanner.nextInt();

        

        
        for (int i = 0; i < Array.length; i++) {
            
            System.out.println("\nInforme o numero: \n");
            Array[i] = scanner.nextInt();
        }

        for (int i = 0; i < Array.length; i++) {
            
            if(Array[i] < n){System.out.printf("\nValor: %d No indice: %d menor que n: %d \n",Array[i],i,n);}

        }
        scanner.close();

    } 


}
