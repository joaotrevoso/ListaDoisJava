import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {

    public static void ProdutoEscalar(){

        Scanner scanner = new Scanner(System.in);

        int vet1[] = {1,2,3,4,5};

        int vet2[] = {5,4,3,2,1};

        System.out.println("Array 1: "+ Arrays.toString(vet1));

        System.out.println();

        System.out.println("Array 2 : " + Arrays.toString(vet2));

        int escalar = 0;

        for (int i = 0; i < vet2.length; i++) {
            
            escalar += vet1[i] * vet2[i];

        }

        System.out.println("Valor do Produto Escalar : " +  escalar);
    
        
        
    }

}
