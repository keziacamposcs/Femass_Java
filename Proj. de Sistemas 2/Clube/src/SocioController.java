import java.util.ArrayList;
public class SocioController {
    public class SocioControllet {
        private ArrayList<Socio> socios;

        public SocioControllet()
        {
            socios = new ArrayList<>();
        }

        public void addSocio(Long cartao_socio, String nome_socio, String end_socio, String tel_socio, String email_socio)
        {
            socios.add(new Socio(cartao_socio, nome_socio, end_socio, tel_socio, email_socio));
        }

        public ArrayList<Socio> getAllSocios()
        {
            return socios;
        }
    }
}
