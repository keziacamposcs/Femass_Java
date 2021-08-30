import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {

        int total=0;
        int num=0;

        int jogada =Integer.parseInt(JOptionPane.showInputDialog("Digite o número de jogadas para o dado: "));

        for (int lado=1; lado<=jogada; lado++)
        {
            num = 1 + (int)(Math.random()*6);
            total = total + num;

            JOptionPane.showMessageDialog(null,"Lado: " +num);
        }
        
        JOptionPane.showMessageDialog(null,"Total dos numeros sorteados: " +total);
        
    }      
    
}
