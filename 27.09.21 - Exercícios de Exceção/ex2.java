import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {  
        try 
        {
            int nr1 = Integer.parseInt((JOptionPane.showInputDialog("Numero 1: "))]);
            int nr2 = Integer.parseInt((JOptionPane.showInputDialog("Numero 1: "))]);

            float resultado = nr1 / nr2;

            JOptionPane.showMessageDialog(null, resultado);
        }

    }
}
