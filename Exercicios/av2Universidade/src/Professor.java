public class Professor extends MembroUniversitario implements Validavel {

    // construtor

    public Professor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // método

    public double calcularPagamento() {
        return (this.getSalarioBase() + 500.00);
    }

    public boolean validarAcesso() {
        if (this.getNome() != "") {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Calculo do pagamento: R$ " + this.calcularPagamento());
    }
}
