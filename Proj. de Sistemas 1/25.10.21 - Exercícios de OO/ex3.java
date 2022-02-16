/*

Crie uma classe chamada TV contendo os seguintes atributos:
“ligado”, “canal” e “volume”.

Defina dois métodos construtores 
(o default e outro para ligar a TV 
num canal qualquer e com volume 25.
Depois disso, elabore métodos para as seguintes ações:

+ Ligar e desligar uma instância;
+ Aumentar e reduzir o volume de um em um (de 0 a 100);
+ Trocar o canal de 0 a 999;
+ Mostrar todos os atributos de uma instância.

*/

public class tv {
    
    //Atributos
    boolean ligado;
    int canal;
    int volume;
    
    //Metodo construtivo tipo Default
    public tv(){
        ligado = false;
        canal = 0;
        volume = 0;
    }
    
    //Metodo construtivo tipo Construtor 1
    public tv(boolean ligado, int canal, int volume){
        this.ligado = true;
        this.canal = 10;
        this.volume = 25;
    }
    
    //Aumentar e reduzir o volume de um em um (de 0 a 100)
    public void aumentaVolume()
    {
        if(ligado)
            if(volume < 100)
                volume =+ 1;
    }
    public void reduzirVolume()
    {
        if(ligado)
            if(volume > 0)
                volume =- 1;
    }
    
    //Trocar o canal de 0 a 999
    public void subirCanal()
    {
        if(ligado)
            if(canal < 999)
                canal =+ 1;
    }
    public void descerCanal()
    {
        if(ligado)
            if(canal > 1)
                canal =- 1;   
    }
    
    //Mostrar todos os atributos de uma instância
    public void ligar()
    {
        ligado=true;
    }
    public void desligar()
    {
        ligado=false;
    }
    public boolean ligado()
    {
        return ligado;
    }
    
    
    
    //Mostrar todos os atributos de uma instância
    public void mostrar()
    {
        if(ligado)
            System.out.println("Canal: "+canal+", Volume: "+volume+" e a TV esta ligado.");
        else
            System.out.println("A TV esta desligada.");
    }
}
