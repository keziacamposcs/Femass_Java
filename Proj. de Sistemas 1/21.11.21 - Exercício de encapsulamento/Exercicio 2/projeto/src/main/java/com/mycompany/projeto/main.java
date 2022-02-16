package com.mycompany.projeto;
import java.util.ArrayList;
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
        ArrayList<Conta> contstring = new ArrayList();
        int deposito;
        
        Scanner in = new Scanner(System.in);

    }

    
    String aux;
    int opcao;
    double valor;
    
    Conta c1;
    
    do
    {
        System.out.print("");
        System.out.print("--Menu--");
        System.out.print("1) Criar conta");
        System.out.print("2) Dados bancários");
        System.out.print("3) Saque");
        System.out.print("4) Depositar");

        System.out.print("Digite uma das opcoes:");
        opcao = in.nextInt();
        
        switch(opcao)
        {
            case 1:
                System.out.print("Criar conta:");
                aux.in.nextLine();
                c1 = new Conta(aux);
                contstring.add(c1);
                break;
                             
            case 2:
                System.out.print("Dados bancários:");
                numero_conta = int.nextInt();
                c1.contstring.get(numero_conta);
                break;
                
            case 3:
                System.out.print("Digite o valor do saque:");
                valor = in.nextDouble();
                c1.saque(valor);
                break;
                
            case 4:
                System.out.print("Digite o valor do deposito:");
                valor = in.nextDouble();
                c1.deposita(valor);
                break;

            
                break;
        }
    }
    
            
    
}
