package projeto;

public class PessoaJuridica extends Pessoa
{
    private String cnpj;
     
    public PessoaJuridica (String nome, String cnpj)
    {
        super(nome);
        this.setcnpj(cnpj);
    }


    public String getcnpj()
    {
        return cnpj;
    }

    public void setcnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
}
