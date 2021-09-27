/*
Faça um programa que leia do teclado 5 números inteiros e armazene-os numa arraylist denominado BÁSICO. 
Armazene os números múltiplos de dois em um segundo arraylist denominado MULTIPLOS_DE_DOIS e os demais 
em um terceiro arraylist denominado DEMAIS. Ordene os vetores e imprima-os.
*/
import java.util.*;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> basico = new ArrayList<>();
        ArrayList<Integer> MULTIPLOS_DE_DOIS = new ArrayList<>();
        ArrayList<Integer> DEMAIS = new ArrayList<>();

        //Recebendo numeros para processar
        Scanner dado = new Scanner(System.in);


        for (int i=0; i<5 ; i++)
        {
            System.out.println("Digite  numero [" +i + "]:");
            int numero = dado.nextInt();
            basico.add(numero);
            
            if (numero % 2 == 0)
                MULTIPLOS_DE_DOIS.add(numero);
            else
                DEMAIS.add(numero);
        }

        Collections.sort(basico);
        System.out.println("Todos os numeros:\t");
        System.out.println(basico);
        
        //MULTIPLOS_DE_DOIS
        Collections.sort(MULTIPLOS_DE_DOIS);
        System.out.println("Multiplos de dois: \t");
        System.out.println(MULTIPLOS_DE_DOIS);
        
        
        //Impar
        Collections.sort(DEMAIS);
        System.out.println("Demais: \t");
        System.out.println(DEMAIS);     

    }
}
