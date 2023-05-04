public class ContaBancaria {
    private double saldo;
    private SituacaoConta situacao;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        if (saldoInicial >= 0) {
            this.situacao = SituacaoConta.POSITIVA;
        } else {
            this.situacao = SituacaoConta.NEGATIVA;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public SituacaoConta getSituacao() {
        return situacao;
    }

    public void depositar(double valor) {
        saldo += valor;
        atualizarSituacao();
        System.out.println("Depósito realizado. Nova situação da conta: " + situacao);
    }

    public void sacar(double valor) {
        if (situacao == SituacaoConta.POSITIVA && saldo - valor >= -100) {
            saldo -= valor;
            atualizarSituacao();
            System.out.println("Saque realizado. Nova situação da conta: " + situacao);
        } else if (situacao == SituacaoConta.NEGATIVA && saldo - valor >= -100) {
            saldo -= valor;
            atualizarSituacao();
            System.out.println("Saque realizado. Nova situação da conta: " + situacao);
        } else if (situacao == SituacaoConta.NEGATIVA && saldo - valor < -100) {
            situacao = SituacaoConta.BLOQUEADA;
            System.out.println("Conta bloqueada. Saldo insuficiente para saque.");
        } else if (situacao == SituacaoConta.BLOQUEADA) {
            System.out.println("Conta bloqueada. Não é possível realizar saques.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    private void atualizarSituacao() {
        if (saldo > 0) {
            situacao = SituacaoConta.POSITIVA;
        } else if (saldo >= -100) {
            situacao = SituacaoConta.NEGATIVA;
        } else {
            situacao = SituacaoConta.BLOQUEADA;
        }
    }
}

public enum SituacaoConta {
    POSITIVA, NEGATIVA, BLOQUEADA
}
