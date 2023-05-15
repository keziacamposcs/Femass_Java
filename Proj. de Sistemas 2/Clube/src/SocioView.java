import java.util.ArrayList;

public class SocioView {
    public void printSocios(ArrayList<Socio> socios)
    {
        for(Socio socio : socios)
        {
            System.out.println("Cartão do Sócio: " + socio.getCartao_socio());
            System.out.println("Nome do Sócio: " + socio.getNome_socio());
            System.out.println("Endereço do Sócio: " + socio.getEnd_socio());
            System.out.println("Telefone do Sócio: " + socio.getTel_socio());
            System.out.println("Email do Sócio: " + socio.getEmail_socio());
            System.out.println("-----------------------------");
        }
    }
}
