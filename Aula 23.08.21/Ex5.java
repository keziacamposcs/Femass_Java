import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {

        String frase ="";

        frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");

        if(frase.contains("sexo") || frase.contains("sexual"))
        {
            JOptionPane.showMessageDialog(null, "Conteudo improprio");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Conteudo liberado");
        }
    }
}
