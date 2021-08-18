public class ex3a {
    public static void main(String[] agrs) {

        int inf=Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior: "));
        
        int sup=Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior: "));
        
        int cont, soma;
        cont=inf;
        soma=0;
        
        while (cont<=sup)
        {
            if ( cont % 2 == 0)
            {
                soma = soma + cont;
            }
            cont++;
        }
        
        JOptionPane.showMessageDialog(null, "O total e:" +soma);

    }
    
}
