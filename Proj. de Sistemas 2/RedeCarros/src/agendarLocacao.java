public class agendarLocacao implements Estado{
    @Override
    public void agendarLocacao(Veiculo veiculo) {
        veiculo.aplicarTransicaoEstado(new EstadoAgendado());
    }
}
