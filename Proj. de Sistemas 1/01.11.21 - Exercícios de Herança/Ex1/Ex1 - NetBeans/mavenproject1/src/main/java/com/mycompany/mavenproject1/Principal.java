package com.mycompany.mavenproject1;

public class Principal
{
    public static void main(String[] args)
    {
       /*Para Residencia:*/
       Imovel residencia = new Imovel();

       //Titulo
       residencia.setTitulo("Casa com jardim");
       System.out.println(residencia.getTitulo());
       
       //Valor
       residencia.setValor("1000");
       System.out.println(residencia.getValor());

       //Bairro:
       residencia.setBairro("Riviera");
       System.out.println(residencia.getBairro());
       
       //Metragem:
       residencia.setMetragem("100");
       System.out.println(residencia.getMetragem());        
    }
}
