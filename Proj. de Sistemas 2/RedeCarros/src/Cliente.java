import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private List<Telefone> telefone;
    private List<Endereco> endereco;

    // construtor
    public Cliente(String nome)
    {
        this.nome = nome;
        this.telefone = new ArrayList<>();
        this.endereco = new ArrayList<>();
    }

    // getters e setters
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    // Telefone
    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public void addTelefone(Telefone telefone)
    {
        this.telefone.add(telefone);
    }
    // Fim - Telefone

    // Endereço
    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public void addEndereco(Endereco endereco) {
        this.endereco.add(endereco);
    }
    //Fim - Endereço
}
