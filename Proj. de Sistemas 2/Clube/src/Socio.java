public class Socio {
    private Long cartao_socio;
    private String nome_socio;
    private String end_socio;
    private String tel_socio;
    private String email_socio;

    public Socio(Long cartao_socio, String nome_socio, String end_socio, String tel_socio, String email_socio)
    {
        this.cartao_socio = cartao_socio;
        this.nome_socio = nome_socio;
        this.end_socio = end_socio;
        this.tel_socio = tel_socio;
        this.email_socio = email_socio;
    }
}
