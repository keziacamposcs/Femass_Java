/*
Use os métodos getMessage() e printStackTrace() para fazer o tratamento
adequado para o programa abaixo:
x = 10;
int n = 5 + “5”;
int [] nr = new int[2];
nr[2] = 10;
float r = 10 / 0;
*/

public class ex1 {
    public static void main(String[] args) {  
        try 
        {
            int x = 10;
        }

        catch(Exception erro)
        {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }

        try 
        {
            String n;
            n = 5 + "5";
        }

        catch(Exception erro)
        {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }

        try 
        {
            int [] nr = new int[2];
            nr[2] = 10;
        }

        catch(Exception erro)
        {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }

        try 
        {
            float r = 10 / 0;
        }

        catch(Exception erro)
        {
            System.out.println(erro.getMessage());
            erro.printStackTrace();
        }
    }
}
