public class Pessoa {
    /*
    > **Encapsulamento**

Crie uma classe chamada `Pessoa` com os atributos **protegidos**: `cpf`, `nome`, `email` e `senha`, todos do tipo `String`.

- [ ] **a)** Implemente um construtor que receba e inicialize todos os atributos.
- [ ] **b)** Implemente os métodos getters e setters para cada atributo.
- [ ] **c)** Implemente o método `mostrar()` que exiba o nome da pessoa no console.

> 💡 **Dica:** O modificador `protected` garante que subclasses possam acessar os atributos diretamente — pense por que isso é útil para a classe `Usuario`.

 */


//atributos 

protected String cpf;
protected String nome;
protected String email;
protected String senha;

//construtor

public Pessoa(String cpf, String nome, String email, String senha){
    this.cpf = cpf;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
}

//getters e setters

public String getCpf() {
    return cpf;
}
public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public String getEmail(){
    return this.email;
}
public void setEmail(String email){
    this.email = email;
}

public String getSenha(){
    return this.senha;
}
public void setSenha(String senha){
    this.senha = senha;
}

//metodo mostrar

public void mostrar(){
    System.out.println("Nome: " + this.nome);
}

}
