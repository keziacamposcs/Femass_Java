package model;

public class Telefone {
    String ddd;
    String numero;
    Tipo tipoTelefone;

    public Telefone(String ddd, String numero, Tipo tipoTelefone) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipoTelefone = tipoTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Tipo getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(Tipo tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
}
