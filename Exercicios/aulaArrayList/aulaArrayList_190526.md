# provas
02/06 - Formativa AV3
09/06 - AV3


# Array List
-> Não tem tamanho definido;

-> Métodos definidos: add(), remove(), size() ...;

ArrayList<Produto> a = new ArrayList<>();



# ex:

public class Carrinho{

    public int idCarrinho;
    public ArrayList<Produto> produtos;

    public Carrinho(){
        this.idCarrinho=0;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    public void listar(){
        for(Produto p:produtos){
            p.mostrar();
        }
    }

}