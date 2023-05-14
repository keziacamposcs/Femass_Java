import java.time.LocalDateTime;

public class ContaEstacionamento {
    protected String veiculo;
    protected LocalDateTime inicio;
    protected LocalDateTime fim;

    public ContaEstacionamento(String veiculo, LocalDateTime inicio, LocalDateTime fim) {
        this.veiculo = veiculo;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
}
