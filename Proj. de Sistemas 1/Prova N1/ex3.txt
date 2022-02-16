/*
Faça um programa que receba três matrizes de mesmo tamanho (5 x 5)
e retorne a soma das duas primeiras menos a terceira. 
Ou seja, Matriz1 + Matriz2 – Matriz3 (considere para isso operações termo a termo).
Os números das matrizes devem ser sorteados entre 10 e 50.
*/

import java.util.ArrayList;

public class ex3 
{
    public static void main(String[] args) 
    {  
        ArrayList<ArrayList<Integer>> matriz1 = new ArrayList();
        ArrayList<Integer> matrizlinha1 = new ArrayList<>();

        ArrayList<ArrayList<Integer>> matriz2 = new ArrayList();
        ArrayList<Integer> matrizlinha2 = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> matriz3 = new ArrayList();
        ArrayList<Integer> matrizlinha3 = new ArrayList<>();
      
        
        //Soma
        ArrayList<ArrayList<Integer>> soma = new ArrayList();
        ArrayList<Integer> somalinha = new ArrayList<>();
        //Fim soma
        
        
        //Resultado
        ArrayList<ArrayList<Integer>> resultado = new ArrayList();
        ArrayList<Integer> resultadolinha = new ArrayList<>();
        //Fim do Resultado

        matriz1.add(matrizlinha1);
        matriz2.add(matrizlinha2);
        matriz3.add(matrizlinha3);
        
        soma.add(somalinha);
        resultado.add(resultadolinha);

        //Matriz
        for(int linha=0; linha<5; linha++)
        {
            for(int coluna=0; coluna<5; coluna++)
            {
                matrizlinha1.add(((int)(Math.random()*5))+11);
            }
        }
        
        //Matriz 2
        for(int linha=0; linha<5; linha++)
        {
            for(int coluna=0; coluna<5; coluna++)
            {
                matrizlinha2.add(((int)(Math.random()*5))+11);
            }
        }
        
        //Matriz 3
        for(int linha=0; linha<5; linha++)
        {
            for(int coluna=0; coluna<5; coluna++)
            {
                matrizlinha3.add(((int)(Math.random()*5))+11);
            }
        }
        //Fim Matriz
        
        //Resultado da soma
        for(int linha=0; linha<matrizlinha2.length; linha++)
        {
            for(int coluna=0; coluna<matrizlinha1.length; coluna++)
            {                
                somalinha.add(matrizlinha1[linha][coluna] + matrizlinha2[linha][coluna]);
            }
        }
        //Fim soma

         //Resultado da subtracao
        for(int linha=0; linha<somalinha.length; linha++)
        {
            for(int coluna=0; coluna<matrizlinha3.length; coluna++)
            {                
                resultadolinha.add(matrizlinha3[linha][coluna] + somalinha[linha][coluna]);
            }
        }
        //Fim soma
        
        
        
        for (ArrayList<Integer> resultadolinha : resultado)
        {
            System.out.print("\n");
            for (int item: resultadolinha)
            {
                System.out.print(item + "\t");
            }
        }
    }
    
}