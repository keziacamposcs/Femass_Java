public class ex1c {
    public static void main(String[] args) {
        //Variaveis
        String aux ="";
        float peso;
        float altura;

        aux = JOptionPane.showInputDialog(null, "Peso: ");
        peso = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog(null, "Altura: ");
        altura = Float.parseFloat(aux);

        float imc = peso / (altura*altura);

        if (imc<18.5){
            JOptionPane.showMessageDialog(null, "\nIMC: "+imc);        
        }
        else if(imc>=18.5){
            
        }
    }
}
