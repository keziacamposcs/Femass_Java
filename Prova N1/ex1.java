/*
Escreva um programa que leia um número inteiro não negativo n, em seguida leia
os tais n números. Aplique o tratamento de exceção necessário e não permita que
o programa seja concluído até o que o usuário informe os números na quantidade
correta.
*/

import java.util.*;
import javax.swing.JOptionPane;

public class ex1 
{
    public static void main(String[] args) 
    {  
        boolean done = false;

        while(!done)
            try 
            {
                ArrayList<Integer> total = new ArrayList<>();

                //Recebendo o tamanho
                int n = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero - sem ser negativo - para o tamanho da lista: ")));
                if (n <= 0) 
                {
                     throw new IllegalArgumentException();
                }
                else
                     for(int i = 0; i<n; i++)
                    {
                        int numero = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero ["+i+"]: ")));
                        total.add(numero);
                    }
                done = true;
            }
            
            catch (IllegalArgumentException erro)
            {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros inteiros positivos." + " O texto do erro e: " + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
    }
}
