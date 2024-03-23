import java.util.Scanner;

public class Exercicio1 {

    public static void ArrayCincoNumeros(){

        int array[] = new int[5];

        Scanner scanner = new Scanner(System.in);
            
        for (int i = 0; i < 5; i++) {
            
            System.out.printf("Informe o numero: ");
            array[i] = scanner.nextInt();
        }

        int media = 0;

        for(int a : array){

            media += a;

        }

        media = media / 5;

        for( int value : array){

            if(value < media){System.out.printf("\nValor: %d menor que a media: %d \n",value,media);}
            else if(value == media){System.out.printf("Valor: %d igual a media: %d \n",value,media);}
            else{System.out.printf("\nValor: %d maior que a media: %d \n",value,media);}

        }

        scanner.close();

    }

}
