public class ex1b {
    public static void main(String[] args) {
        //Variaveis
        String aux;
        int n1;
        int n2;

        aux = JOptionPane.showInputDialog("Indique o n°1: ");
        n1 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Indique o n°2: ");
        n2 = Integer.parseInt(aux);

        int soma = n1 + n2;

        JOptionPane.showMessageDialog(null, "A soma dos números é: "+soma);
    }
}
