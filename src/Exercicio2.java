import java.util.Scanner;

public class Exercicio2 {

    public static void VetorPosicoesValor(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero de elementos no array: ");
        int Array[] = new int[scanner.nextInt()];

        for (int i = 0; i < Array.length; i++) {
            
            System.out.println("Informe o numero: ");
            Array[i] = scanner.nextInt();

        }

        for(int a : Array){


            if(a > 0){System.out.printf("\nValor : %d maior que zero \n",a);}
            else if(a == 0){System.out.printf("\nValor: %d igual a zero \n",a);}
            else{System.out.printf("Valor: %d menor que zero \n",a);}

        }

        scanner.close();

    }

}
