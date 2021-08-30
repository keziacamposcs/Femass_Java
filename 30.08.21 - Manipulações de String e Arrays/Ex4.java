import javax.swing.JOptionPane;

public class Ex4 {
    public static void main(String[] args) 
    {
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");

        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        JOptionPane.showMessageDialog(null, fraseInvertida);
    }   
}
