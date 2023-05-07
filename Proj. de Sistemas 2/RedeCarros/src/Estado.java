public interface Estado {
    void agendarLocacao(Veiculo veiculo);
    void iniciarLocacao(Veiculo veiculo);
    void concluirLocacao(Veiculo veiculo, boolean comAcidente);
    void venderVeiculo(Veiculo veiculo);
    void enviarManutencao(Veiculo veiculo);
}