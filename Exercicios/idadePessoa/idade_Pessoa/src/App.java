public class App {
    public static void main(String[] args) throws Exception {
        Pessoa joao = new Pessoa("joao", "1231241414", 1992, 1.81);

        joao.calcularIdade();
        joao.mostra();
    }
}
