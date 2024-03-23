import java.util.Scanner;

public class Exercicio7 {

    public static void VetoresIguais(){

        Scanner scanner = new Scanner(System.in);

        int vet1[] = new int[5];

        int vet2[] = new int[5];

        int controller = 0;

        for (int i = 0; i < vet2.length; i++) {
            
            System.out.printf("\nInforme o valor no primeiro Arary: ");
            vet1[i] = scanner.nextInt();


            System.out.printf("\nInforme o valor no Segundo Arary: ");
            vet2[i] = scanner.nextInt();

            if(vet1[i] == vet2[i]){

                controller++;

            }
            

        }

        if(controller == 5){

            System.out.println("Vetores sao iguas");

        }
        else{

            System.out.println("Vetores sao diferentes");

        }

    }

}
