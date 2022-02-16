package com.mycompany.projeto;

public class Circulo extends Figura
{
    private double raio;

    public Circulo(double raio)
    {
        this.setRaio(raio);
    }

    public double calculaArea()
    {
        return Math.PI * (this.getRaio() * this.getRaio());
    }

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        this.raio = raio;
    }
}
