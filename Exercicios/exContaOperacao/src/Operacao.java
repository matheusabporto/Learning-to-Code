public class Operacao {
/*
Cliente + Conta:** Implementar a classe `Cliente` com CPF e endereço (encapsulamento + método `imprimir()`). 
Implementar a classe `Conta` associada a um cliente, com saldo não negativo (encapsulamento + método `imprimir()`).
Instanciar um objeto `Conta` na classe principal.

Operacao + fazOperacao:** Implementar a classe `Operacao` com tipo (D – depósito ou R – retirada) e valor associado. 
Na classe `Conta`, implementar o método `fazOperacao()` que realiza uma operação e atualiza o saldo. 
Realizar *n* operações sobre uma conta na classe principal.

*/

//atributos

String tipo;
double valor;

//construtor
public Operacao(String tipo, double valor) {
    this.tipo = tipo;
    this.valor = valor;
}

//getters e setters
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}

public double getValor() {
    return valor;
}
public void setValor(double valor) {
    this.valor = valor;
}

//metodos

public void imprimir() {
    Syste.out.println("Tipo: " + tipo);
    System.out.println("Valor: " + valor);
}


}
