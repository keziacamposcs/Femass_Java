import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MensalidadeController {

    private ArrayList<Mensalidade> mensalidades;

    public MensalidadeController(){
        mensalidades = new ArrayList<>();
    }

    public void addMensalidade(String data_mens_str, double valor_mens, String data_pgto_mens_str, double juros_mens, double valor_pago, boolean quit_mens) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date data_mens = formatter.parse(data_mens_str);
        Date data_pgto_mens = formatter.parse(data_pgto_mens_str);
        mensalidades.add(new Mensalidade(data_mens, valor_mens, data_pgto_mens, juros_mens, valor_pago, quit_mens));
    }

    public ArrayList<Mensalidade> getAllMensalidade()
    {
        return  mensalidades;
    }
}
