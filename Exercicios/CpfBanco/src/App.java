public class App {
    public static void main(String[] args) throws Exception {
    Conta joao = new  Conta("2423452",23567,434.87,true);
    Conta maria = new Conta("872334", 726253, 234.50, false);
    joao.mostra();
    maria.mostra();
    joao.saque(435);
    joao.deposito(2.12);
    joao.transferencia(maria, 200.50);
    joao.saque(100);
    maria.mostra();
    maria.saque(435);
    joao.mostra();
    maria.mostra();
    }
}
