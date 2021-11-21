package com.mycompany.projeto;

import java.util.ArrayList;

public class Conta 
{
    protected int nr_conta;
    private double saldo;
    private ArrayList<String> transacao = new ArrayList<String> ();
    
    public Conta(String n, double v, ArrayList tr)
    {
        this.nr_conta = n;
        this.saldo = v;
        this.transacao = tr;
    } 
    
    void deposita(double v)
    {
        this.saldo = saldo + v;
    }
    void sacar (double v)
    {
        this.saldo = saldo - v;
    }
    
    public void set_nr_conta(int n)
    {
        this.nr_conta = n;
    }
    private int get_nr_conta()
    {
        return nr_conta;
    }
    
    private double movimento_total()
    {
        return transacao;
    }
}
