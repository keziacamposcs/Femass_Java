import java.util.ArrayList;
import javax.swing.*;

public class Ex10 {
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<Integer> diagonal = new ArrayList<>();

        //Matriz
        for(int linha=0; linha<4; linha++)
        {
               String values = JOptionPane.showInputDialog("Digite 4 valores da linha " + (linha+1) + " (separados por ;):");
               values = values.replaceAll("","");

               String[] splitValues;
               ArrayList<Integer>coluna = new ArrayList<>();
               valuesMatrix.add(coluna);

               for(int coluna=0; coluna<4; coluna++)
               {
                   coluna.add(Integer.parseInt(splitValues[coluna]));

                   if(linha==coluna)
                   {
                       diagonalValues.add(Integer.parseInt(splitValues[coluna]));
                   }
               }

               for(ArrayList<Integer> coluna: valuesMatrix)
               {
                   for(int value : coluna)
                   {
                       System.out.print(value + " ");
                   }
                   System.out.println();
               }
               System.out.println();
        }

        for(int linha=0; linha<4; linha++)
        {
            for(int coluna=0; coluna<4; coluna++)
            {
                if(linha==coluna)
                {
                    System.out.print(diagonalValues.get(coluna) + "");
                }
                else
                {
                    System.out.print("");;
                }
            }
            System.out.println();
        }
    }
}

