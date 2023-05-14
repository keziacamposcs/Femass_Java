import java.util.Date;

public class Mensalidade {
    private Date data_mens;
    private double valor_mens;
    private Date data_pgto_mens;
    private double juros_mens;
    private double valor_pago;
    private boolean quit_mens;

    public Mensalidade(Date data_mens, double valor_mens, Date data_pgto_mens, double juros_mens, double valor_pago, boolean quit_mens)
    {
        this.data_mens = data_mens;
        this.valor_mens = valor_mens;
        this.data_pgto_mens = data_pgto_mens;
        this.juros_mens = juros_mens;
        this.valor_pago = valor_pago;
        this.quit_mens = quit_mens;
    }
}
