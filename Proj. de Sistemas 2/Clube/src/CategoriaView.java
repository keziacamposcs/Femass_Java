import java.util.ArrayList;

public class CategoriaView {
    public void printCategoriaDetails(ArrayList<Categoria> categorias)
    {
        for(Categoria categoria : categorias)
        {
            System.out.println("Descricao Categoria: "+ categoria.getDes_cat());
            System.out.println("-----------------------");
        }
    }

    public void printCategorias(ArrayList<Categoria> categorias) {
    }
}
