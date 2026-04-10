public abstract class Funcionario implements Bonificavel {


protected String nome;
protected double salario;

public Funcionario(String nome, double salario){
    this.nome = nome;
    this.salario = salario;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void setSalario(double salario){
    this.salario = salario;
}

public double getSalario(){
    return this.salario;
}

public abstract void baterPonto();

public void mostrar(){
        System.out.println(nome);
        System.out.println(salario);
    }
}
