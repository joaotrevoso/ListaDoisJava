import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio12 {

    public static void ProdutoPositivos(){

        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        int produto = 1;

        for(int a : array){

            if(a % 2 == 0){

                produto = a * produto;

            }

        }

        System.out.println("Array: " + Arrays.toString(array));

        System.out.println();

        System.out.println("Produto: " + produto);

    }

}
