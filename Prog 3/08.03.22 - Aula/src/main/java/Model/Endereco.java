package model;

public class Endereco {
    private String logr;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    Tipo tipoEndereço;
    UF enderecoUf;

    public Endereco(String logr, int numero, String complemento, String bairro, String cidade, Tipo tipoEndereço, UF enderecoUf) {
        this.logr = logr;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.tipoEndereço = tipoEndereço;
        this.enderecoUf = enderecoUf;
    }

    public String getLogr() {
        return logr;
    }

    public void setLogr(String logr) {
        this.logr = logr;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Tipo getTipoEndereço() {
        return tipoEndereço;
    }

    public void setTipoEndereço(Tipo tipoEndereço) {
        this.tipoEndereço = tipoEndereço;
    }

    public UF getEnderecoUf() {
        return enderecoUf;
    }

    public void setEnderecoUf(UF enderecoUf) {
        this.enderecoUf = enderecoUf;
    }
}
