public class Animal {
/*
**Exercício — Animal + Cachorro + Preguica:** Criar a classe `Animal` com nome e idade (encapsulamento). 
Criar a classe `Cachorro` (herda de `Animal`) com indicador se corre ou não, 
e a classe `Preguica` (herda de `Animal`) com indicador se escala ou não. 
Em cada classe, implementar método que mostra o som emitido. 
Na classe principal: instanciar um `Cachorro` e uma `Preguica` e chamar o método de som. 
Declarar um objeto do tipo `Animal` e instanciar de forma polimórfica; chamar o método.
*/


protected String nome;
protected int idade;

public Animal(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return this.nome;
}

public void setIdade(int idade){
    this.idade = idade;
}

public int getIdade(){
    return this.idade;
}

public void emitirSom(){
    System.out.println("Som emitido!");
}

public void emitirSom(String texto){
    System.out.println(texto);
}

}
