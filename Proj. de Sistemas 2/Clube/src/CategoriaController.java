import java.util.ArrayList;

public class CategoriaController {
    private ArrayList<Categoria> categorias;

    public CategoriaController()
    {
        categorias = new ArrayList<>();
    }

    public void addCategoria(String des_cat){
        categorias.add(new Categoria(des_cat));
    }

    public ArrayList<Categoria> getCategorias(){
        return  categorias;
    }
}
