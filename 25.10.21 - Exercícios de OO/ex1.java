/*

Crie uma classe que contenha três métodos com o nome ‘média’, utilizando o conceito de sobrecarga.
Os métodos devem calcular a média de dois, três e quatro valores de entrada.
Utilize a classe principal para criar e testar os métodos do seu objeto.

*/

public class ex1 
{
    public static void principal(String[] args)
    {
        num(10);
    }

    public static void media_um (double num) 
    {
        System.out.println("Media de dois:" + (num+num)/2 );    
    } 

    public static void media_dois (double num) 
    {
        System.out.println("Media de tres:" + (num+num+num)/3 );    
    } 

    public static void media_tres (double num) 
    {
        System.out.println("Media de dois:" + (num+num+num+num)/4 );    
    }

}