public class Conta {
/*
Cliente + Conta:** Implementar a classe `Cliente` com CPF e endereço (encapsulamento + método `imprimir()`). 
Implementar a classe `Conta` associada a um cliente, com saldo não negativo (encapsulamento + método `imprimir()`).
Instanciar um objeto `Conta` na classe principal.

Operacao + fazOperacao:** Implementar a classe `Operacao` com tipo (D – depósito ou R – retirada) e valor associado. 
Na classe `Conta`, implementar o método `fazOperacao()` que realiza uma operação e atualiza o saldo. 
Realizar *n* operações sobre uma conta na classe principal.

*/

//atributos
private Cliente cliente;
private double saldo;

//construtor 

public Conta(Cliente cliente, double saldo) {
    this.cliente = cliente;
    if (saldo >=0) {
        this.saldo = saldo;
    } else {
        this.saldo = 0;
    }
    
}

//getters e setters

public Cliente getCliente() {
    return this.cliente;
}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public double getSaldo() {
    return this.saldo;
}
public void setSaldo(double saldo) {
    if (saldo >=0){
        this.saldo = saldo;
    } else {
        this.saldo = 0;
    }
    
}

//metodos

public void imprimir() {
    System.out.println(" Cliente : " + this.cliente.getCpf() + "-" + this.cliente.getEndereco());
    System.out.println("Saldo: " + this.saldo);
}


}
