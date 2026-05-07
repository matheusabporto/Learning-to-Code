public class App {
    public static void main(String[] args) throws Exception {
        /*
Cliente + Conta:** Implementar a classe `Cliente` com CPF e endereço (encapsulamento + método `imprimir()`). 
Implementar a classe `Conta` associada a um cliente, com saldo não negativo (encapsulamento + método `imprimir()`).
Instanciar um objeto `Conta` na classe principal.

Operacao + fazOperacao:** Implementar a classe `Operacao` com tipo (D – depósito ou R – retirada) e valor associado. 
Na classe `Conta`, implementar o método `fazOperacao()` que realiza uma operação e atualiza o saldo. 
Realizar *n* operações sobre uma conta na classe principal.

*/


        Cliente cliente1 = new Cliente("12345", "Rua A, 123");
        Conta conta1 = new Conta(cliente1, 1000);
        conta1.imprimir();
        
        Operacao deposito = new Operacao("D", 500);
        conta1.fazOperacao(deposito);
        conta1.imprimir();
        Operacao retirada = new Operacao("R",1400);
        conta1.fazOperacao(retirada);
        conta1.imprimir();
    }
}
