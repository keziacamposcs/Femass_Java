import javax.swing.JOptionPane;

public class ex2b {
    public static void main(String[] args){
        int[] idade = new int[4];
        int maior = 0;
        int menor = 0; 
        String idades = "";
       

        for (int i = 0; i < 4; i++) {
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            idades += idade[i] + " ";
        }

        maior = idade[0];
        menor = idade[0];
       
        for (int i = 0; i < 4; i++) {
            if (maior < idade[i]){
                maior = idade[i];
            }
            if (menor > idade[i]){
                menor = idade[i];
            }
        }
       
        JOptionPane.showMessageDialog(null, "As idades informadas foram:"
                + "\n" + idades
                + "\nA maior idade é: " + maior
                + "\nA menor idade é: " + menor);
    }
}
