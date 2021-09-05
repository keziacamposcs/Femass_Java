import java.util.*;
import java.util.Scanner;

public class Ex8 
{
    public static void main(String[] args)
    {
        Scanner dado = new Scanner(System.in);

        ArrayList<Integer> total = new ArrayList<>();

        //Recebendo o tamanho
        System.out.println("Digite um numero - sem ser negativo - para o tamanho da lista: ");
        int n = dado.nextInt();

        if (n <= 0)
        {
            System.out.println("Invalido...");

            //Recebendo o tamanho
            System.out.println("Digite um numero - sem ser negativo - para o tamanho da lista: ");
            int n = dado.nextInt();
        }
        else
            for(int i = 0; i<n; i++)
            {
                System.out.println("Digite numero ["+i+"]: ");
                int numero = dado.nextInt();
                total.add(numero);
            }

            int[] frequencia = new int[total.length];

            for(i=0; i<total.length; i++)
            {
                int count = 1;
                for(int j=0; j<total.length; j++)
                {
                    if(total[i] == total[j])
                    {
                        count++;
                        frequencia[j] = visited;
                    }
                }

                if(frequencia[i] != visited)
                {
                    frequencia[i] = count;
                }

                for(int i=0; i<frequencia.length; i++)
                {
                    if(frequencia[i] != visited)
                    {
                        System.out.println("Para"+total[i]+" a frequencia foi:"+frequencia[i]);
                    }
                }
            }
    }    
}
