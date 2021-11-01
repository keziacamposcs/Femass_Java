package com.mycompany.ex1;

public class Imovel
{
    String titulo;
    double valor;
    String bairro;
    double metragem;

    //titulo
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    public String getTitulo() 
    {
        return titulo;
    }

    //valor
    public void setValor(double valor)
    {
        this.valor = valor;
    }
    public double getValor()
    {
        return valor;
    }

    //bairro
    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }
    public String getBairro() 
    {
        return bairro;
    }
    
    //metragem
    public void setMetragem(double metragem)
    {
        this.metragem = metragem;
    }    
    public double getMetragem()
    {
        return metragem;
    }
}
