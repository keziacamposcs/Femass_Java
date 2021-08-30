public class exemplo1
{
    public static void main(String[] args)
    {
        //Definindo array unidimensional
        int [] idades = new int[10];
        Object [] array_heterogeneo = new Object[20];

        //Popular array unidimensional
        for(int i=0; i<idades.length; i++)
        {
            idades[i] = (int)(Math.random()*51);
            System.out.print(idades[i] + "\t");
        }
    }
}