public class Produto {
/*
- [ ] **Exercício — Produto + Loja:** Implementar a classe `Produto` 
com código (letras e números), nome, valor e quantidade em estoque;
 construtor, gets/sets e método `imprimir()`. 
 Implementar a classe `Loja` com conjunto de produtos. 
 Métodos: `vender()` (realiza a venda de uma unidade); `abastecer()` (abastece uma unidade); 
 `valorEstoque()` (computa o valor total do estoque). Instanciar um objeto `Loja` e fazer chamadas.
*/

//atributos
private String codigo;
private String nome;
private double valor;
private int qtdEstoque;

//construtor

public Produto(String codigo, String nome, double valor, int qtdEstoque){
this.codigo = codigo;
this.nome = nome;
this.valor = valor;
this.qtdEstoque = qtdEstoque;
}

//getters e setters

public String getCodigo(){
    return this.codigo;
}
public void setCodigo(String codigo){
    this.codigo = codigo;
}
public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public double getValor(){
    return this.valor;
}
public void setValor(double valor){
    this.valor = valor;
}
public int getQtdEstoque(){
    return this.qtdEstoque;
}
public void setQtdEstoque(int qtdEstoque){
    this.qtdEstoque = qtdEstoque;
}

//métodos

public void imprimir(){
    System.out.println("Código: " + this.codigo);
    System.out.println("Nome: " + this.nome);
    System.out.println("Valor: R$ " + this.valor);
    System.out.println("Quantidade no estoque: " this.qtdEstoque + " unidade(s)");
}

}
