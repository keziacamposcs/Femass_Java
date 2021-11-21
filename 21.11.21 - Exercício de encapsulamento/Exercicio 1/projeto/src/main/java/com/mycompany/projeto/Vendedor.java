package com.mycompany.projeto;

public class Vendedor extends Funcionario
{
    private double comissao;
    
    public Vendedor(double com)
    {
        this.comissao = com;
    }
    
    @Override
    public double calcular_encargos()
    {
        return(this.comissao);
    }
    
    public double get_comissao()
    {
        return comissao;
    }
   
    protected void set_comissao (double com)
    {
        this.comissao = com;
    }
}
