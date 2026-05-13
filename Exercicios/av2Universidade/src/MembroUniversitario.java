public abstract class MembroUniversitario {

    // atributos

    private String nome;
    private double salarioBase;

    // construtor
    public MembroUniversitario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // getters e setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // metodo

    public abstract double calcularPagamento();

    

}
