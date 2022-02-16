package com.mycompany.projeto;

import java.util.ArrayList;

public class Conta_Especial extends Conta
{
    private double limite_e;
    
    public Conta_Especial(double lime)
    {
        this.limite_e = lime;
    }
    
    @Override
    public void sacar(double valor)
    {
    }
    
    public void set_limite_E(double valor)
    {
        this.saldo = valor; 
    }
    public double get_limite_E()
    {
        return saldo;
    }
}
