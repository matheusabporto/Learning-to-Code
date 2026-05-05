public class Loja {

    /*
Implementar a classe `Loja` com conjunto de produtos. 
 Métodos: `vender()` (realiza a venda de uma unidade); `abastecer()` (abastece uma unidade); 
 `valorEstoque()` (computa o valor total do estoque). Instanciar um objeto `Loja` e fazer chamadas.
*/

//atributos
Produto produto;

//construtor

public Loja(Produto produto){
    this.produto = produto;
}

//getters e setters

public Produto getProduto(){
    return this.produto;
}
public void setProduto(Produto produto){
    this.produto = produto;
}

//metodos

public void vender(int quantidade){
    this.produto.setQtdEstoque(this.produto.getQtdEstoque() - quantidade);
    System.out.println("Venda realizada!");
}

public void abastecer(int quantidade){
    this.produto.setQtdEstoque(this.produto.getQtdEstoque() + quantidade);
    System.out.println("Abastecimento realizado!");
}

public double valorEstoque(){
    System.out.println("Valor total do estoque: " + (this.produto.getValor() * this.produto.getQtdEstoque()));
    return (this.produto.getValor() * this.produto.getQtdEstoque());
}

}
