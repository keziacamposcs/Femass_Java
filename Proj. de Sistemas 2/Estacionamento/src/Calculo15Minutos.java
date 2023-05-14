import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculo15Minutos implements  CalculoValor{
    private double valorPeriodo;

    @Override
    public  double calcular(ContaEstacionamento inicio, ContaEstacionamento fim)
    {
        long minutosEstacionamento = ChronoUnit.DAYS.between(inicio.getInicio(), fim.getFim());
        return  minutosEstacionamento * valorPeriodo;
    }

    public void setValorPeriodo(double valorPeriodo)
    {
        this.valorPeriodo = 1;
    }
}
