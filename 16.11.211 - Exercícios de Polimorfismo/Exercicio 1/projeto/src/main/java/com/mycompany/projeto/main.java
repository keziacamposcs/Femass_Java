package com.mycompany.projeto;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        //auxiliar
        Scanner aux = new Scanner(System.in);

        
        Funcionario f1 = new Funcionario("Joao, 1400");
        f1.calcular_encargos();
        
        Vendedor v1 = new Vendedor(300);
        v1.comissao();
        
        Freelancer fr1 = new Freelancer (22, 10);
        fr1.dias_trabalhados();
        fr1.valor_dia();
        
    }
}