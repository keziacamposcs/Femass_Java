import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Ex7 {
    public static void main(String[] args)
    {
        ArrayList<Integer> todos = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        //Recebendo numeros para processar
        Scanner dado = new Scanner(System.in);


        for (int i=0; i<=20 ; i++)
        {
            System.out.println("Digite  numero [" +i + "]:");
            int numero = dado.nextInt();
            todos.add(numero);
            
            if (numero % 2 == 0)
                par.add(numero);
            else
                impar.add(numero);
        }

        Collections.sort(todos);
        System.out.println("Todos os numeros:\t");
        System.out.println(todos);
        
        //Par
        Collections.sort(par);
        System.out.println("Par:\t");
        System.out.println(par);
        
        
        //Impar
        Collections.sort(impar);
        System.out.println("Impar:\t");
        System.out.println(impar);     
    } 
}
