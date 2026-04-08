public class App {

    public static void main(String[] args) throws Exception {
        Veiculo carro = new Carro("carro", 4);
        Bicicleta bicicleta = new Bicicleta("bicicleta",2);

        bicicleta.mover();
        carro.mover();

    }
}
