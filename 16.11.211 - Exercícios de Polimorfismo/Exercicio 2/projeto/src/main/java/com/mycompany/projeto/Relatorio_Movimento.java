package com.mycompany.projeto;

public class Relatorio_Movimento extends Conta
{
    
    void double emitir (Conta conta)
    {
        System.out.println(conta.nr_conta);
        System.out.println(conta.saldo);
    }
}
