package com.mycompany.projeto;

public class Vendedor extends Funcionario
{
    double comissao;
    
    public Vendedor(double com)
    {
        this.comissao = com;
    }
    
    @Override
    public double calcular_encargos()
    {
        return(this.comissao);
    }
}
