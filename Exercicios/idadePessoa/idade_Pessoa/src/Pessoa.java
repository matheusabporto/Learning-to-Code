public class Pessoa {
    /*
    Criar uma classe para representar uma pessoa, com os atributos
    privados de nome, CPF, ano de nascimento e altura. Crie os metodos
    publicos necessarios para gets e sets e tambem um metodo para mostrar todos
    dados de uma pessoa. Crie um metodo para calcular a idade da pessoa.
    */

    //Atributos
    private String nome;
    private String cpf;
    private int anoNascimento;
    private double altura;


    //Construtor
    public Pessoa(String nome, String cpf, int anoNascimento, double altura){
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }



    //Encapsuladores

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    //Métodos

    public int calcularIdade(){
        return 2026 - this.anoNascimento;
    }

    public void mostra(){
    System.out.println("Nome: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("Ano de Nascimento: " + this.anoNascimento);
    System.out.println("Idade: " + this.calcularIdade());
    System.out.println("Altura: " + this.altura);

    }

}
