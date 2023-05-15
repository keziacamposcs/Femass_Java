import java.util.ArrayList;

public class DependenteController {
    private ArrayList<Dependente> dependentes;

    public DependenteController(){
        dependentes = new ArrayList<>();
    }

    public void addDependente(Long cartao_dep, String nom_dep, String parentesco, String email_dep)
    {
        dependentes.add(new Dependente(cartao_dep, nom_dep,parentesco, email_dep));
    }

    public ArrayList<Dependente> getAllDependente(){
        return  dependentes;
    }
}
