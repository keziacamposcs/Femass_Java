package com.mycompany.projeto;
import java.util.ArrayList;

public class Conta 
{
    protected int nr_conta;
    private double saldo;
    private ArrayList<String> transacao;
    
    public Conta(String nr_conta, ArrayList transacao)
    {
        this.nr_conta = nr_conta;
        this.saldo = saldo;
        this.transacao = transacao;
    } 
    
    //Depositar
    public void depositar(double valor)
    {
        System.out.print("Deposito....");
        System.out.print("Saldo Anterior:" +this.saldo);
        
        this.saldo += valor;
        
        System.out.print("Saldo atual:"+this.saldo);
    }
    
    //Sacar
    public void sacar (double valor)
    {
        System.out.print("Saque....");
        System.out.print("Saldo Anterior:" +this.saldo);
        
        this.saldo -= valor;
        
        System.out.print("Saldo atual:"+this.saldo);
    }
   
    public void set_nr_conta(int nr_conta)
    {
        this.nr_conta = nr_conta;
    }
    private int get_nr_conta()
    {
        return nr_conta;
    }
    
    //Transacao
    private void movimento_total(ArrayList<String> transacao)
    {
        transacao.add(nr_conta);
        transacao.add(saldo);    
        System.out.println("Numero da conta:" + transacao.get(nr_conta));
        System.out.println("Saldo da conta:" + transacao.get((int) saldo));

    }
}
