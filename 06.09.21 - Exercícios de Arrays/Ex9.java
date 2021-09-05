import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> matriz_todo = new ArrayList<>();
        ArrayList<Integer> matriz = new ArrayList<>();

        matriz_todo.add(matriz);

        //Matriz
        for(int linha=0; linha<50; linha++)
        {
            for(int coluna=0; coluna<20; coluna++)
            {
                matriz.add(((int)(Math.random()*100))+51);
            }
        }
        //Fim Matriz

        //Recebe numero
        Scanner recebe = new Scanner(System.in);
        System.out.println("Informe o número de interesse: ");
        int n = recebe.nextInt();
        

        for (ArrayList<Integer> matriz : matriz_todo)
        {
            System.out.print("\n");
            for (int item: matriz)
            {
                System.out.print(item + "\t");
            }
        }
    }
    
}