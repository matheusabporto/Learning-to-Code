public class Administrativo extends MembroUniversitario {

    // construtor

    public Administrativo(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // método

    public double calcularPagamento() {
        return (this.getSalarioBase() * 1.1);
    }

    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Calculo do pagamento: R$ " + this.calcularPagamento());
    }
}
