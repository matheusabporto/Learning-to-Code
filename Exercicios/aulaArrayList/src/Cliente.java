public class Cliente {

/*
*- [ ] **Exercício — Cliente + Academia:
* Criar a classe `Cliente` com atributos: * id (inteiro), nome, ano de nascimento, telefone. 
* Criar a classe `Academia` com nome e lista de clientes. 
* Métodos da `Academia`: cadastrar novo cliente; remover cliente por id; retornar o número de clientes cadastrados; 
* retornar clientes nascidos após 2000; remover clientes nascidos antes de 1990. 
* Instanciar um objeto `Academia` (começa sem clientes), cadastrar, remover e mostrar a quantidade de clientes.
*/


//atributos

private int id;
private String nome;
private int anoNascimento;
private String telefone;

// construtor

public Cliente(int id, String nome, int anoNascimento, String telefone){
    this.id = id;
    this.nome = nome;
    this.anoNascimento = anoNascimento;
    this.telefone = telefone;
}

//getters e setters

public int getId(){
    return this.id;
}
public void setId(int id){
    this.id = id;
}

public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}

public int getAnoNascimento(){
    return this.anoNascimento;
}
public void setAnoNascimento(int anoNascimento){
    this.anoNascimento = anoNascimento;

public 
}





}
