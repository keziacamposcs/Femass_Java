public class Veiculo {
    private String modelo;
    private String placa;
    private double valorLocacao;
    private double valorVenda;
    private double valorCaucao;
    private Estado estado;


    public Veiculo(String modelo, String placa, double valorLocacao, double valorVenda, double valorCaucao, Estado estado)
    {
        this.modelo = modelo;
        this.placa = placa;
        this.valorLocacao = valorLocacao;
        this.valorVenda = valorVenda;
        this.valorCaucao = valorCaucao;
        this.Estado = estado;
    }

    public void aplicarTransicaoEstado(Estado novoEstado) {
        this.estado = novoEstado;
    }

}
