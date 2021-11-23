package projeto;

import javax.swing.JOptionPane;

public class main 
{
    public static void main(String[] args)
    {
        Pessoa p1;
        p1 = new Pessoa("Joao");
        PessoaFisica p2 = new PessoaFisica("123456789");
        PessoaJuridica p3 = new PessoaJuridica("987654321");
        Funcionario f1 = new Funcionario("123");
        
        String pessoa1 = "Nome: "+p1.Pessoa()+"\n";
        String pessoa2 = "RG: "+p2.Pessoa()+"\n";
        String pessoa3 = "CNPJ: "+p3.Pessoa()+"\n";
        String fun1 = "Cartao: "+f1.Pessoa()+"\n";

        JOptionPane.showMessageDialog(null, p1,"Nome:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, p2,"RG:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, p3,"CNPJ:",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, f1,"Cartao:",JOptionPane.INFORMATION_MESSAGE);

    }
}
