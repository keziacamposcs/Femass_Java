package com.mycompany.projeto;

public class Quadrado extends Figura
{
    private double lado;
    
    public Quadrado(double lado)
    {
        this.setLado(lado);
    }

    public double calculaArea()
    {
        return this.getLado() * this.getLado();
    }

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }
}
