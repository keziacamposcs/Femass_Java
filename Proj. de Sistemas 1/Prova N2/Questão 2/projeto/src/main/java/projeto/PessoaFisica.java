package projeto;

public class PessoaFisica extends Pessoa
{
    private String rg;
     
    public PessoaFisica (String nome, String rg)
    {
        super(nome);
        this.setrg(rg);
    }

    public String getrg()
    {
        return rg;
    }

    public void setrg(String rg)
    {
        this.rg = rg;
    }
}
