import java.time.temporal.ChronoUnit;

public class CalculoCarga implements CalculoValor {

    @Override
    public double calcular(ContaEstacionamento inicio, ContaEstacionamento fim)
    {
        long carga = ChronoUnit.DAYS.between(inicio.getInicio(), fim.getFim());
        return carga * 20;
    }
}
