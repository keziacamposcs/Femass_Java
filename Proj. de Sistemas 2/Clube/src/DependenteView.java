import java.util.ArrayList;

public class DependenteView {
    public void printDependente(ArrayList<Dependente> dependentes)
    {
        for(Dependente dependente : dependentes)
        {
            System.out.println("Cartão Dep: "+ dependente.getCartao_dep());
            System.out.println("Nome Dep: "+ dependente.getNom_dep());
            System.out.println("Parentesco Dep: "+ dependente.getParentesco());
            System.out.println("Email Dep: " + dependente.getEmail_dep());
            System.out.println("-----------------------");
        }
    }

    public void printDependentes(ArrayList<Dependente> dependentes) {
    }
}
