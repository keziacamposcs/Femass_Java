import javax.swing.JOptionPane;

public class ex3b {
    public static void main(String[] agrs) {
        
        //Variaveis
        String aux ="";
        int[] aluno;
        int media;
        int mediaturma;
        int resultado;


        //JOptionPane
        aux = JOptionPane.showInputDialog(null, "Digite quantidade de alunos da turma: ");
        quant = Integer.parseInt(aux);


        for (int i = 0; i < quant; i++) {
            n1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite N1:"));
            n2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite N2:"));
            n3[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite N3:"));

            media = (n1+n2+n3)/3;

            mediaturma = mediaturma + media;

            JOptionPane.showMessageDialog(null, "Media do aluno e:" +media);


        }

        resultado = mediaturma/quant;

        JOptionPane.showMessageDialog(null, "Media do aluno e:" +resultado);


    }
}
