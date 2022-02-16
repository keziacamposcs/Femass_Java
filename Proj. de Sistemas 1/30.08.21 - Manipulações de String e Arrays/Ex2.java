import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {

        float ajuste;

        float preco =Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));

        ajuste = Math.round(preco + (preco*0.12));

        JOptionPane.showMessageDialog(null,"O ajuste fica: "+ajuste);

    }
}
