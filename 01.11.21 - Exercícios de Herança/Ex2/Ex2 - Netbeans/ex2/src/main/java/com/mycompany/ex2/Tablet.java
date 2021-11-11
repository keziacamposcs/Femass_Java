package com.mycompany.ex2;

public class Tablet extends Eletronico
{
    int volume=0;
    
    //Aumentar e reduzir o volume de um em um (de 0 a 100)
    public void aumentar_volume()
    {
        if(ligado)
            if(volume < 100)
                volume =+ 1;
    }
    
    public void diminuir_volume()
    {
        if(ligado)
            if(volume > 0)
                volume =- 1;
    }

    public int getVolume() {
        return volume;
    } 
}