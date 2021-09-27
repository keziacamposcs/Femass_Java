package com.mycompany.diagonalmatriz;
import java.util.*;

/**
 *
 * @Isac
 */
public class ex10corrigido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        ArrayList<Integer> diagonal = new ArrayList();
        ArrayList<ArrayList<Integer>> matriz = new ArrayList();
        
        System.out.println("A matriz deve ser quadrada, informe a dimensão com "
                + "um único número:");
        Scanner sc = new Scanner(System.in);
        int dimensao = sc.nextInt();
        
        int nr_linhas = 0;
        
        while (true){

            System.out.println("Informe a linha corrente ou digite 0: ");
            sc = new Scanner(System.in);
            String linha = sc.next();
            if ("0".equals(linha)){
                if (matriz.size() != dimensao){
                    System.out.println("O número de linhas da matriz está fora "
                            + "da dimensão, informe novas linhas, a partir da "
                            + "primeira!");
                    matriz = new ArrayList();
                }
                else{
                    //Quando zero foi digitado e a matriz tem a dimensão correta
                    break;
                }
            }
            else{
                String[] linha_array_str = linha.split(";");
                ArrayList<Integer> linha_array_int = new ArrayList();
                if (linha_array_str.length != dimensao){
                    System.out.println("A linha não tem o número correto de "
                            + "elementos que é: " + dimensao + "!");
                }
                else{
                    for (int i=0; i<linha_array_str.length; i++){
                        linha_array_int.add(Integer.parseInt(linha_array_str[i]));
                    }
                    matriz.add(linha_array_int);
                }
            }
       }
        

        int posicao_diagonal = 0;

        for (ArrayList<Integer> linha_matriz : matriz){
            System.out.println();
            for(int i=0; i<linha_matriz.size(); i++){
                if (i == posicao_diagonal){
                    diagonal.add(linha_matriz.get(posicao_diagonal));
                }
                System.out.print(linha_matriz.get(i) + "\t");
            }
            posicao_diagonal += 1;
        }
        System.out.println("\nA diagonal da matriz é: " + diagonal);
    }
    
}