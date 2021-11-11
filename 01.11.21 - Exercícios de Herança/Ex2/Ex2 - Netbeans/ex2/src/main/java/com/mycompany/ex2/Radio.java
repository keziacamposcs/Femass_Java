package com.mycompany.ex2;

public class Radio extends Eletronico
{
    boolean tocando_musica=false;
    
    //Aumentar e reduzir o volume de um em um (de 0 a 100)
    public void tocar_musica()
    {
        if(ligado)
            tocando_musica=true;
    }
    
    public void parar_musica()
    {
        if(ligado)
            tocando_musica = false;
    }

    public boolean get_tocando_musica() {
        return tocando_musica;
    } 
}