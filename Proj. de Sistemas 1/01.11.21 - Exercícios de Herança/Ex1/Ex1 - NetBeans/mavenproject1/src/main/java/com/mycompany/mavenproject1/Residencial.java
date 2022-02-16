package com.mycompany.mavenproject1;

public class Residencial extends Imovel
{
    int qtdVagasGaragem;
    int qtdQuartos;
    int qtdSuites; 
    
    //qtdVagasGaragem
    public void setQtdVagasGaragem(int qtdVagasGaragem)
    {
        this.qtdVagasGaragem = qtdVagasGaragem;
    }
    public int getQtdVagasGaragem()
    {
        return qtdVagasGaragem;
    }
    
    //qtdQuartos
    public void setQtdQuartos(int qtdQuartos)
    {
        this.qtdQuartos = qtdQuartos;
    }
    public int getQtdQuartos()
    {
        return qtdQuartos;
    }
    
    //qtdSuites
    public void setQtdSuites(int qtdSuites)
    {
        this.qtdSuites = qtdSuites;
    }
    public int getQtdSuites()
    {
        return qtdSuites;
    }
    
    
    /*Set Residencial
    public void setResidencial(String tt, double v, String b, double mt)
    {
        super(tt, v, b, mt);
        this.qtdVagasGaragem = qtvg;
        this.qtdQuartos = qtq;
        this.qtdSuites = qts;
    }
    */
}
