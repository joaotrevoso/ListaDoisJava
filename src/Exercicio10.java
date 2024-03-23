import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

    public static void InverterArray(){

        int a [] = new int[5];

        int b[] = new int[5];

        Scanner scanner = new Scanner(System.in);

        int j = 4;

        for (int i = 0; i < b.length; i++) {
            
            System.out.printf("\ninforme o valor no array:");
            a[i] = scanner.nextInt();

            b[j] = a[i];

            j--;

        }

        System.out.println(Arrays.toString(b));

    }

}
