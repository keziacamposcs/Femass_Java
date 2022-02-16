package com.mycompany.mavenproject1;

public class Apartamento extends Residencial
{
    int andar;
    boolean solNascente;
    String torre;

    //Andar
    public void setAndar(int andar) 
    {
        this.andar = andar;
    }
    public int getAndar()
    {
        return andar;
    }
    
    //SolNascente    
    public void setSolNascente(boolean solNascente)
    {
        this.solNascente = solNascente;
    }
    public boolean isSolNascente() 
    {
        return solNascente;
    }

    //torre
    public void setTorre(String torre)
    {
        this.torre = torre;
    } 
    public String getTorre()
    {
        return torre;
    }  
}
