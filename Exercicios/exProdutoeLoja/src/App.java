public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("1", "Camiseta", 50.0, 10);
        Loja loja1 = new Loja(produto1);

        loja1.valorEstoque(); // Valor total do estoque: 500.0
        loja1.vender(2); // Venda realizada!
        loja1.valorEstoque(); // Valor total do estoque: 400.0
        loja1.abastecer(5); // Abastecimento realizado!
        loja1.valorEstoque(); // Valor total do estoque: 650.0
    }
}
