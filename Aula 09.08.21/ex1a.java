import javax.swing.JOptionPane;

public class ex1a {
    public static void main(String args[]){
            //Variaveis
            String aux="";
            float altura;
            float base;
            
            aux = JOptionPane.showInputDialog("Indique a base: ");
            base = Float.parseFloat(aux);
            
            aux = JOptionPane.showInputDialog("Indique a area: ");
            altura = Float.parseFloat(aux);
            
            float per = 2*(base)+ 2*(altura);
            float area = altura * base;
            
            JOptionPane.showMessageDialog(null, "O perimetro é: " +per);
            JOptionPane.showMessageDialog(null, "O area é: " +area);

            
}
}