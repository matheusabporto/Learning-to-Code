public class App {
    public static void main(String[] args) throws Exception {
        Empregado a = new Empregado("Joao", "Silva", 2500.0);
        Empregado b = new Empregado("Maria", "Pontes", 5000.00);

        a.mostra();
        b.mostra();
        a.forneceAumento();
        a.mostra();
        b.mostra();
        b.forneceAumento();
        b.mostra();
    }


}
