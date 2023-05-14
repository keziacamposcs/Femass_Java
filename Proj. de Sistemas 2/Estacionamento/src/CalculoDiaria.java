import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDiaria implements CalculoValor {
    private double valorDiaria;

    @Override
    public double calcular(ContaEstacionamento inicio, ContaEstacionamento fim) {
        long diasEstadia = ChronoUnit.DAYS.between(inicio.getInicio(), fim.getFim());
        return diasEstadia * valorDiaria;
    }

    public void setValorDiaria(double valorDiaria)
    {
        this.valorDiaria = valorDiaria;
    }
}
