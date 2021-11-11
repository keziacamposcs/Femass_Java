package com.mycompany.ex2;

public class Principal
{
    public static void main(String[] args)
    {
        System.out.print("\nEletronico\n");
        Eletronico el = new Eletronico();
        System.out.print(el.ligado);

        System.out.print("\Radio\n");
        Radio ra = new Radio();
        System.out.print(ra.tocando_musica);

        System.out.print("\Tablet\n");
        Tablet tab = new Tablet();
        System.out.print(tab.volume);

    }        
}
