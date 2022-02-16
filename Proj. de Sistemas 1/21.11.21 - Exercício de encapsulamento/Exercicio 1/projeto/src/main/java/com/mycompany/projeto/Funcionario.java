package com.mycompany.projeto;

public class Funcionario 
{
    protected String nome;
    protected double salario_base;

    public Funcionario(String n, double sb)
    {
        this.nome = n;
        this.salario_base = sb;
    }
    
        public double calcular_encargos()
    {
        //Calculando Imposto de Renda
        if(salario_base <= 500)
        {
            return 0;
        }
        else if(salario_base <= 1000)
        {
            return salario_base * (5/100);
        }
        else
        {
            return salario_base * (7/100);
        }
    }
       
    private void set_salario_base(int sb)
    {
        this.salario_base = sb;
    }
    public double get_salario_base()
    {
        return salario_base;
    }

        
    public void set_nome(String n)
    {
        this.nome = n;
    }
    public String get_nome()
    {
        return nome;
    }
    //Amostrar os resultados
    public void mostra()
    {
            System.out.println("Nome: " + this.nome);
            System.out.println("Salario Base: "+ this.salario_base);
    }
}