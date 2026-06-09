import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Pedido implements Registravel {
    
    /*
    ## 🛒 Questão 5 — Classe `Pedido`
> **Composição, ArrayList e Interface**

Crie uma classe `Pedido` que **implemente a interface `Registravel`**, com os atributos: `id` (`int`), 
`usuario` (`Usuario`), `produtos` (`ArrayList<Produto>`) e `valorPedido` (`Double`).

- [ ] **a)** Implemente o construtor recebendo um `Usuario`, um `id` e um valor inicial, inicializando o `ArrayList` vazio.
- [ ] **b)** Implemente `adicionarProduto(Produto p)`: adiciona o produto à lista e soma seu preço ao valor total.
- [ ] **c)** Implemente `removerProduto(Produto p)`: remove o produto da lista e subtrai seu preço do valor total.
- [ ] **d)** Implemente `listarProdutos()`: percorre a lista e chama `mostrar()` em cada produto.
- [ ] **e)** Implemente `consultarProduto(int id)`: busca e retorna um produto pelo seu `id`, retornando `null` caso não encontrado.
- [ ] **f)** *(Sobrecarga)* Implemente uma segunda versão de `removerProduto` que receba um `int id` e utilize `consultarProduto()` internamente. **Qual conceito de POO é aplicado aqui?**
- [ ] **g)** Implemente `registrar()` (da interface): grave os dados em `pedido.txt` usando `FileWriter` e `BufferedWriter` em **modo append**. Formato: `id_pedido;cpf_usuario;id_produto;preco_produto`. Trate exceções com `try/catch`.
- [ ] **h)** Implemente `gerarResumo()` (da interface): retorne uma `String` com id do pedido, nome do usuário e valor total. Exemplo: `"Pedido #1 | Cliente: toim | Total: R$ 5.0"`

> 💡 **Dica:** A assinatura da classe ficará: `public class Pedido implements Registravel { ... }`
> Se você não implementar todos os métodos da interface, o compilador Java acusará erro.

*/

//atributos

protected int id;
protected Usuario usuario;
protected ArrayList<Produto> produtos;
protected double valorPedido;

//construtor

public Pedido(Usuario usuario, int id, double valorInicial){
    this.usuario = usuario;
    this.id = id;
    this.valorPedido = valorInicial;
    this.produtos = new ArrayList<Produto>();
}


//metodos

public void adicionarProduto(Produto p){
    this.produtos.add(p);
    this.valorPedido += p.preco;
}

public void removerProduto(Produto p){
    if(this.produtos.remove(p)){
        this.valorPedido -= p.preco;
    }
}

public void listarProdutos(){
    for (Produto p: this.produtos){
        p.mostrar();
    }
}

public Produto consultarProduto(int id){
    for (Produto p: this.produtos){
        if (p.id == id){
            return p;    
        }
    }
    return null;
}

public void removerProduto(int id){
    Produto p = consultarProduto(id);
    if (p != null){
        removerProduto(p);
    }
}


public void registrar(){
    try{
        FileWriter fw = new FileWriter("pedido.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Produto p: this.produtos){
            String linha = this.id + ";" + this.usuario.getCpf() + ";" + p.id + ";" + p.preco;
            bw.write(linha);
            bw.newLine();
        }
        bw.close();
    }
    catch (Exception e){
        System.out.println("Erro ao registrar pedido: " + e.getMessage());
    }
}

public String gerarResumo(){
    return "Pedido #" + this.id + " Cliente: " + this.usuario.getNome() + " Total: R$ " + this.valorPedido;
}


}

