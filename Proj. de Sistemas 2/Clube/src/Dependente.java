public class Dependente {
    private Long cartao_dep;
    private Long nom_dep;
    private String parentesco;
    private String email_dep;

    public Long getCartao_dep() {
        return cartao_dep;
    }

    public void setCartao_dep(Long cartao_dep) {
        this.cartao_dep = cartao_dep;
    }

    public Long getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(Long nom_dep) {
        this.nom_dep = nom_dep;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getEmail_dep() {
        return email_dep;
    }

    public void setEmail_dep(String email_dep) {
        this.email_dep = email_dep;
    }

    public Dependente(Long cartao_dep, Long nom_dep, String parentesco, String email_dep)
    {
        this.cartao_dep = cartao_dep;
        this.nom_dep = nom_dep;
        this.parentesco = parentesco;
        this.email_dep = email_dep;
    }
}
