public class App {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente("joao",2000.50);
        Funcionario estagiario = new Estagiario("francisco",1000.00);

        gerente.mostrar();
        gerente.calcularBonus();
        gerente.mostrar();

        estagiario.mostrar();
        estagiario.calcularBonus();
        estagiario.mostrar();
    }
}
