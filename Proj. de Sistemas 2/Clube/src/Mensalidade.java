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

    public Date getData_mens() {
        return data_mens;
    }

    public void setData_mens(Date data_mens) {
        this.data_mens = data_mens;
    }

    public double getValor_mens() {
        return valor_mens;
    }

    public void setValor_mens(double valor_mens) {
        this.valor_mens = valor_mens;
    }

    public Date getData_pgto_mens() {
        return data_pgto_mens;
    }

    public void setData_pgto_mens(Date data_pgto_mens) {
        this.data_pgto_mens = data_pgto_mens;
    }

    public double getJuros_mens() {
        return juros_mens;
    }

    public void setJuros_mens(double juros_mens) {
        this.juros_mens = juros_mens;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public boolean isQuit_mens() {
        return quit_mens;
    }

    public void setQuit_mens(boolean quit_mens) {
        this.quit_mens = quit_mens;
    }
}
