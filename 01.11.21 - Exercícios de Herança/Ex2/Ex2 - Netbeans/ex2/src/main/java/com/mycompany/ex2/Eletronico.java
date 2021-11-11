package com.mycompany.ex2;

public class Eletronico
{
    boolean ligado = false;
    
    //ligar()
    public void ligar (boolean ligado)
    {
        ligado = true;
    }
    
    //desligar()
    public void desligar (boolean ligado)
    {
        ligado = false;
    }

    //Get ligado
    public boolean isLigado() {
        return ligado;
    }
    
    
}
