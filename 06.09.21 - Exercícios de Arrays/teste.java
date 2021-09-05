import java.util.*;
import java.util.Scanner;

public class teste {
    public static void main(String[] args)
    {
        int i;
        
        Scanner dado = new Scanner(System.in);
        
        //Definição de Array
        ArrayList<Integer> total = new ArrayList<>();
        
        //Recebendo o "n"
        System.out.println("Digite um numero inteiro não negativo: ");
        int n = dado.nextInt();
        
        
        if (n <= 0)
        {
            System.out.println("Número Invalido, tente novamente...");
            System.out.println("Digite um numero inteiro não negativo: ");
            int n = dado.nextInt();
        }
        else
            
            for (i=0; i < n; i++)
            {
                System.out.println("Digite algum número para posição n°" +i +":");
                int numero = dado.nextInt();
                total.add(numero);
            }        
            
            int[] freq = new int[total.length];
            
            for(i = 0; i < total.length; i++)
            {
                int count = 1;
                
                for(int j = i+1; j<total.length; j++)
                {
                    if(total[i] == total[j])
                    {
                        count++;
                        freq[j]=visited;
                     
                    }
                }
                if(freq[i] != visited)
                    freq[i] = count;
            }
            
            for(int i=0; i< freq.length; i++)
            {
                if(freq[i]!= visited)
                    System.out.println(" " +total[i] " | " freq[i]);
            }
    }
    
}