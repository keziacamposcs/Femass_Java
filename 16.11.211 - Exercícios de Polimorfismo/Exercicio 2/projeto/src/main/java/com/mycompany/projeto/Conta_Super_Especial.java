package com.mycompany.projeto;

public class Conta_Super_Especial extends Conta
{
    double limite_se;
    
    public Conta_Super_Especial(double limse)
    {
        this.limite_se = limse;
    }
    
    @Override
    public void sacar(double v)
    {
    }
    
    public void set_limite_SE(double limse)
    {
        this.limite_se = limse; 
    }
    public double get_limite_SE()
    {
        return limite_se;
    }
}