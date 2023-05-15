import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class MensalidadeView {
    public void printMensalidade(ArrayList<Mensalidade> mensalidades)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for(Mensalidade mensalidade: mensalidades)
        {
            System.out.println("Data da Mensalidade: " + dateFormat.format(mensalidade.getData_mens()));
            System.out.println("Valor da Mensalidade: "+ mensalidade.getValor_mens());
            System.out.println("Data do Pagamento: "+ dateFormat.format(mensalidade.getData_pgto_mens()));
            System.out.println("Juros da Mensalidade: "+ mensalidade.getJuros_mens());
            System.out.println("Valor Pago: "+ mensalidade.getValor_pago());
            System.out.println("Quitado: "+ (mensalidade.isQuit_mens() ? "Sim" : "Não"));
            System.out.println("-----------------------");
        }
    }
}
