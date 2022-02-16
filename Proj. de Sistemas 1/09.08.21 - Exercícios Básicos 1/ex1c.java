import javax.swing.JOptionPane;

public class ex1c {
    public static void main(String[] args) {
        //Variaveis
        String aux ="";
        float peso;
        float altura;
        float imc;

        aux = JOptionPane.showInputDialog(null, "Peso: ");
        peso = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Altura: ");
        altura = Float.parseFloat(aux);

        imc = peso / (altura*altura);

        if (imc<18.5){
            JOptionPane.showMessageDialog(null, "Abaixo do normal\nIMC: "+imc);        
        }
        else if(imc>=18.5 && imc<=24.4){
            JOptionPane.showMessageDialog(null, "Ideal\nIMC: "+imc);        
        }
        else if(imc>=18.5 && imc<=24.4){
            JOptionPane.showMessageDialog(null, "Pré-obesidade\nIMC: "+imc);        
        }
        else if(imc>=30 && imc<=34.9){
            JOptionPane.showMessageDialog(null, "Obesidade classe I\nIMC: "+imc);        
        }
        else if(imc>=35 && imc<=39.9){
            JOptionPane.showMessageDialog(null, "Obesidade classe II\nIMC: "+imc);        
        }
        else{
            JOptionPane.showMessageDialog(null, "Obesidade classe III\nIMC: "+imc);        
        }
    }
}
