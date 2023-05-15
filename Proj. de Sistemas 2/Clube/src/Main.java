import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Socio> socios = new ArrayList<>();
        ArrayList<Dependente> dependentes = new ArrayList<>();
        ArrayList<Mensalidade> mensalidades = new ArrayList<>();
        ArrayList<Categoria> categorias = new ArrayList<>();

        // Criando objetos da classe Categoria
        Categoria categoria1 = new Categoria("Categoria A");
        Categoria categoria2 = new Categoria("Categoria B");
        categorias.add(categoria1);
        categorias.add(categoria2);

        // Criando objetos da classe Socio
        Socio socio1 = new Socio(1L, "Fulano", "Rua 1, nº 1", "1111-1111", "fulano@teste.com");
        Socio socio2 = new Socio(2L, "Ciclano", "Rua 2, nº 2", "2222-2222", "ciclano@teste.com");
        socios.add(socio1);
        socios.add(socio2);

        // Criando objetos da classe Dependente
        Dependente dep1 = new Dependente(1L, "Dependente 1", "Filho", "dep1@teste.com");
        Dependente dep2 = new Dependente(2L, "Dependente 2", "Filho", "dep2@teste.com");
        dependentes.add(dep1);
        dependentes.add(dep2);

        // cria objetos Date para as datas
        Date dataMens1 = new Date(2021-1900, 0, 1); // 1 de janeiro de 2021
        Date dataPgto1 = new Date(2021-1900, 0, 5); // 5 de janeiro de 2021
        Date dataMens2 = new Date(2021-1900, 1, 1); // 1 de fevereiro de 2021
        Date dataPgto2 = new Date(2021-1900, 1, 5); // 5 de fevereiro de 2021


        // Criando objetos da classe Mensalidade
        Mensalidade mensalidade1 = new Mensalidade(dataMens1, 100.0, dataPgto1, 0.0, 100.0, true);
        Mensalidade mensalidade2 = new Mensalidade(dataMens2, 100.0, dataPgto2, 10.0, 110.0, true);
        mensalidades.add(mensalidade1);
        mensalidades.add(mensalidade2);

        // Imprimindo os objetos criados
        SocioView socioView = new SocioView();
        socioView.printSocios(socios);

        DependenteView dependenteView = new DependenteView();
        dependenteView.printDependentes(dependentes);

        MensalidadeView mensalidadeView = new MensalidadeView();
        mensalidadeView.printMensalidade(mensalidades);

        CategoriaView categoriaView = new CategoriaView();
        categoriaView.printCategorias(categorias);
    }
}
