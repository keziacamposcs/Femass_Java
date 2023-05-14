import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime inicio = LocalDateTime.of(2023, 5, 13, 9, 0);
        LocalDateTime fim = LocalDateTime.of(2023, 5, 15, 12, 0);

        /*
        ContaEstacionamento contaEstacionamento = new ContaEstacionamento("carro", inicio, fim);
        CalculoDiaria calculo = new CalculoDiaria();
        calculo.setValorDiaria(10);
        double valorTotal = calculo.calcular(contaEstacionamento, contaEstacionamento);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
        */

        /*
        ContaEstacionamento contaEstacionamento = new ContaEstacionamento("caminhão", inicio, fim);
        CalculoCarga calculo = new CalculoCarga();
        double valorTotal = calculo.calcular(contaEstacionamento, contaEstacionamento);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);
        */

        ContaEstacionamento contaEstacionamento = new ContaEstacionamento("moto", inicio, fim);
        Calculo15Minutos calculo = new Calculo15Minutos();
        calculo.setValorPeriodo(1);
        double valorTotal = calculo.calcular(contaEstacionamento, contaEstacionamento);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

    }
}
