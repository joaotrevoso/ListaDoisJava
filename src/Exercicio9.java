import java.util.Arrays;
import java.util.Scanner;


public class Exercicio9 {

    public static void GerarVetorC(){

        Scanner scanner = new Scanner(System.in);

        int a[] = new int[5];

        int b[] = new int[5];

        int c[] = new int[5];

        for (int i = 0; i < c.length; i++) {
            

            System.out.printf("\nInforme o valor no primeiro Arary: ");
            a[i] = scanner.nextInt();


            System.out.printf("\nInforme o valor no Segundo Arary: ");
            b[i] = scanner.nextInt();

            if(i % 2 == 0){

                c[i] = a[i];

            }else{

                c[i] = b[i];

            }

        }


        System.out.println(Arrays.toString(c));

        scanner.close();

    }

}
