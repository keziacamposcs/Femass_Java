package com.mycompany.projeto;
import javax.swing.JOptionPane;

public class gps 
{    
    boolean ligado;
    String idioma;
    String rota;

    String aux ="";

            
    //Metodo construtivo tipo Default
    public gps()
    {
        ligado = false;
        idioma = ("");
        rota = ("");
    }
    
    public gps (boolean ligado, String idioma, String rota){
        this.ligado = true;
        this.idioma = ("Portugues");
        this.rota = ("25");
    }
    
    public void DefinirIdioma()
    {
        if(ligado)
        {
            aux = JOptionPane.showInputDialog(null, "Qual idioma?\n1. Portugues\n2.Ingles ");
            idioma = String.parseString(aux);
        }       
    }
    
    public void DefinirRota()
    {
        if(ligado)
        {
            aux = JOptionPane.showInputDialog(null, "Qual rota? Digite as coordenadas... ");
            rota = String.parseString(aux);
        }       
    }
    public void mostrar()
    {
        if(ligado)
            System.out.println("Idioma: "+idioma+", Rota: "+rota);
        else
            System.out.println("O gps esta desligado.");
    }
}
