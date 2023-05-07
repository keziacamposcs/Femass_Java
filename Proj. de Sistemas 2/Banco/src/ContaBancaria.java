public class ContaBancaria {
    private int num_conta;
    private double saldo;
    private Estado estado;

    public ContaBancaria(int num_conta, double saldo, Estado estado)
    {
        this.num_conta = num_conta;
        this.saldo = saldo;
        this.estado = estado;
    }

    public void saque(double valor)
    {
        estado.saque(this, valor);
    }

    public void deposito(double valor)
    {
        estado.deposito(this,valor);
        System.out.println("Conta: " + num_conta + " Saldo atual: " + saldo);
    }

    public void creditar(double valor)
    {
        saldo = saldo + valor;
    }

    public void debitar(double valor)
    {
        saldo = saldo - valor;
    }

    public void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    public int getNum_conta()
    {
        return num_conta;
    }

    public double getSaldo()
    {
        return saldo;
    }
}
