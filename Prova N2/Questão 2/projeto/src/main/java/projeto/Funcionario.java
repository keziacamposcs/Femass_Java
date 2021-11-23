package projeto;

public final class Funcionario extends PessoaFisica
{
    private String cartao;
     
    public Funcionario (String nome, String rg, String cartao)
    {       
        super(nome, rg);
        this.setcartao(cartao);
    }

    public String getcartao()
    {
        return cartao;
    }

    public void setcartao(String cartao)
    {
        this.cartao = cartao;
    }
}
