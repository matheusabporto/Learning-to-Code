public class Cliente {
/*
Cliente + Conta:** Implementar a classe `Cliente` com CPF e endereço (encapsulamento + método `imprimir()`). 
Implementar a classe `Conta` associada a um cliente, com saldo não negativo (encapsulamento + método `imprimir()`).
Instanciar um objeto `Conta` na classe principal.

Operacao + fazOperacao:** Implementar a classe `Operacao` com tipo (D – depósito ou R – retirada) e valor associado. 
Na classe `Conta`, implementar o método `fazOperacao()` que realiza uma operação e atualiza o saldo. 
Realizar *n* operações sobre uma conta na classe principal.

*/


//atributos

private String cpf;
private String endereco;

//construtor

public Cliente(String cpf, String endereco) {
    this.cpf = cpf;
    this.endereco = endereco;
}

//getters e setters

public String getCpf() {
    return this.cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getEndereco() {
    return this.endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}

// metodos

public void imprimir() {
    System.out.println("CPF: " + this.cpf);
    System.out.println("Endereço: " + this.endereco);
}


}
