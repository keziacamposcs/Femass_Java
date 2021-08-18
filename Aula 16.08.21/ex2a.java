import javax.swing.JOptionPane;

public class ex2a{

    public static void main(String[] args) {
        //Variaveis
        String aux ="";
        float valor;
        String codigo;
        float desconto;


        //JOptionPane
        aux = JOptionPane.showInputDialog(null, "Digite o valor do produto: ");
        valor = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Digite o código do desconto: ");
        codigo = String.parseString(aux);

        switch (codigo) {
            case 1:
                // 5%
                desconto = valor - (valor * 0.05)
                JOptionPane.showMessageDialog(null, "Valor do produto com desconto: " +desconto);
                break;

            case 2:
                // 10%
                desconto = valor - (valor * 0.1)
                JOptionPane.showMessageDialog(null, "Valor do produto com desconto: " +desconto);
                break;
            
            case 3:
                // 20%
                desconto = valor - (valor * 0.2)
                JOptionPane.showMessageDialog(null, "Valor do produto com desconto: " +desconto);
                break;

            case 4:
                // 50%
                desconto = valor - (valor * 0.5)
                JOptionPane.showMessageDialog(null, "Valor do produto com desconto: " +desconto);
                break;    
        
            default:
                JOptionPane.showMessageDialog(null, "Esse código não válido");
                break;
        }
        
    }
}