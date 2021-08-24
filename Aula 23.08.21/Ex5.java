import javax.swing.JOptionPane;

/*
Elabore uma classe que receba uma frase e verifique se essa frase
possui palavras impróprias. As palavras impróprias são: sexo e sexual.
Caso encontre uma dessas palavras, emita em tela a mensagem
“conteúdo impróprio”, caso contrário “conteúdo liberado”
*/

public class Ex5 {
    public static void main(String[] args) {

        String frase ="";

        frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");

        if(frase.indexOf("sexo")==1)
        {
            JOptionPane.showMessageDialog(null, "Conteudo improprio");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Conteudo liberado");
        }
    }
}
