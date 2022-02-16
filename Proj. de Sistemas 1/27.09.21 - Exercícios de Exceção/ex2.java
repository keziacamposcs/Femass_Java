import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {

        boolean done = false;

        while(!done)
            try 
            {
                int nr1 = Integer.parseInt((JOptionPane.showInputDialog("Numero 1: ")));
                int nr2 = Integer.parseInt((JOptionPane.showInputDialog("Numero 2: ")));
                float resultado;
                resultado = nr1 / nr2;

                JOptionPane.showMessageDialog(null, resultado);

                done = true;
            }

            catch (NumberFormatException erro)
            {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros inteiros." + " O texto do erro e: " + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            catch (ArithmeticException erro)
            {
                JOptionPane.showMessageDialog(null, "O denomidador nao pode ser 0!" + " O texto do erro e: " + erro.toString());
            }
        

    }
}
