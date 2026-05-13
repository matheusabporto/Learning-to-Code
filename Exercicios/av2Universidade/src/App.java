public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor("Joao", 1500);
        Administrativo admin = new Administrativo("Mario", 1000);

        VeiculoCarga veiculo = new VeiculoCarga();

        professor.imprimir();
        admin.imprimir();

        veiculo.validarAcesso();

    }

}
