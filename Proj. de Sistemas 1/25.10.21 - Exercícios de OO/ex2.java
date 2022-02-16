/*
Crie uma classe chamada Lâmpada que contenha os 
atributos “código”,“marca”, “volts” e “estado”.
Com isso, você deve instanciar pelo menos dois 
objetos, na classe principal.
Depois disso, crie um método para ligar 
e desligar a lâmpada e outro para observar 
o estado da lâmpada.
*/

import java.util.Scanner;

public class Lampada{
    
    //Atributos
    int codigo;
    String marca;
    int volts;
    boolean estado;
    
    public Lampada()
    {
        estado = false;
    }
    
    //Método para ligar e desligar a lâmpada
    public void ligar()
    {
        estado = true;
    }
    
    public void desligar(){
        estado = false;
    }
    
    //Observar o estado da lâmpada
    public boolean estado_lampada()
    {
        return(estado);
    }
}

public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Lampada lamp1 = new Lampada();
        
        int opcao;
        
        do
        {
            System.out.print("1-Ligar \n 2-Desligar \n 3-Estado");
            System.out.print("Digite uma opcao:");
            opcao = sc.nextInt();
            
            switch(opcao)
            {
                case 1:
                    lamp1.ligar();
                    break;
                   
                case 2:
                    lamp1.desligar();
                    break;
                
                case 3:
                    if(lamp1.estado_lampada())
                        System.out.println("Ligada");
                    else
                        System.out.println("Desligada");
                    break;
                    
            }while(opcao =! 0);
            System.out.println("Fim do programa");
        }
    }    
 }