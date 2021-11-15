package com.mycompany.projeto;

public class Freelancer extends Funcionario
{
    int dias_trabalhados;
    int valor_dia;
    private int dt;
    private int vd;
    
    public Freelancer(int dt, int vd)
    {
        this.dias_trabalhados = dt;
        this.valor_dia = vd;
    }
    

    @Override
    public double calcular_encargos()
    {
        return(this.dias_trabalhados * this.valor_dia);
    }
    
    public void get_Dt()
    {
        this.dias_trabalhados = dt;
    }
    public int set_Dt()
    {
        return dias_trabalhados;
    }
    
    
    public void get_Vd()
    {
        this.valor_dia = vd;
    }
    public int set_Vd()
    {
        return valor_dia;
    }    
}
