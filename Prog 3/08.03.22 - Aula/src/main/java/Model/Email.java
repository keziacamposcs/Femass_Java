package model;

public class Email {
    String endereco;
    Tipo tipoEmail;

    //construtor
    public Email(String endereco, Tipo tipoEmail)
    {
        this.endereco = endereco;
        this.tipoEmail = tipoEmail;
    }

    public String getEndereco() {
        return endereco;
    }

    public Tipo getTipoEmail() {
        return tipoEmail;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipoEmail(Tipo tipoEmail) {
        this.tipoEmail = tipoEmail;
    }
}
