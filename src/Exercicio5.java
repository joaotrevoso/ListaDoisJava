import java.util.Scanner;

public class Exercicio5 {

    public static void NumeroNVezesNoArray(){


        int array[] = new int[5];

        Scanner scanner = new Scanner(System.in);
        
         
        System.out.println("\nInforme o valor de n:  \n");
        int n = scanner.nextInt();
   

        for (int i = 0; i < 5; i++) {
            
            System.out.printf("\nInforme o numero: ");
            array[i] = scanner.nextInt();
        }

        int vezesNoArray = 0;

        for(int a : array){


            if(a == n){vezesNoArray++;}
        }

        System.out.printf("\nValor de N: %d Aparece: %d vezes no Array \n",n,vezesNoArray);

        scanner.close();

    }


}
