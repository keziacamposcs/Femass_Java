import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        
        int[][] num = new int[50][20];
        

        //Matriz
        for(int linha=0; linha<50; linha++)
        {
            for(int coluna=0; coluna<20; coluna++)
            {
                num[linha][coluna] = ((int)(Math.random()*1050))+51;
            }
        }
        //Fim Matriz

        //Recebe numero
        Scanner recebe = new Scanner(System.in);
        System.out.println("Informe o número de interesse: ");
        int n = recebe.nextInt();
        

        for(int[] linha: num)
        {
            System.out.println();
            for(int item: linha)
                System.out.print(item + "\t");
        }

        //Procura numero
        boolean encontrado = false;
        for(int linha=0; linha<50; linha++)
        {
            for(int coluna=0; coluna<20; coluna++)
            {
                if(n == num[linha][coluna])
                {
                    encontrado = true;
                    System.out.println("\nO número " + n + 
                            " foi encontrado na linha " + linha + " e coluna " + coluna);
                }
            }
        }

        if (encontrado == false)
        {
            System.out.println("\nO número " + n + " não existe na matriz!");
        } 
    }
    
}
