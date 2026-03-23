public class Empregado {

/*
Exercicio. A fim de representar empregados em uma firma, crie uma classe
chamada Empregado que inclui as tres informacoes a seguir como atributos:
nome, sobrenome e salario mensal. Sua classe deve ter um construtor que
inicializa os tres atributos. Forneca um metodo set e get para cada atributo.
Se o salario mensal nao for positivo, configure-o como 0. Na classe principal,
crie dois objetos do tipo Empregado e exiba o salario anual de cada um. Na
classe Empregado, implemente o metodo forneceAumento, que aumenta em
10% o salario de um empregado. Faca testes na classe principal.
*/

//atributos
private String nome;
private String sobrenome;
private double salarioMensal;

//construtor

public Empregado(String nome, String sobrenome, double salarioMensal){
    this.nome = nome;
    this.sobrenome = sobrenome;
    if(salarioMensal<=0){
        this.salarioMensal = 0.0;
    }else this.salarioMensal = salarioMensal;
}

//Encapsuladores

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
}

public String getSobrenome(){
    return this.sobrenome;
}

public void setSalarioMensal(double salarioMensal){
    if(salarioMensal<=0){
        this.salarioMensal = 0.0;
    } else {
        this.salarioMensal = salarioMensal;
    }    
}

public double getSalarioMensal(){
    return this.salarioMensal;
}


//métodos

public double forneceAumento(){
    this.salarioMensal = (salarioMensal*1.1);
    System.out.println("O salário de " + this.nome + " passou a ser de R$ " + this.salarioMensal);
    return this.salarioMensal; // eu estava errando aqui porque o return deve ser usado no final, ele encerra o método na hora.
}

public void mostra(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Sobrenome: " + this.sobrenome);
    System.out.println("Salário anual: " + (this.salarioMensal*12));
    
}


}
