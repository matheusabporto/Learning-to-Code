public class Cachorro extends Animal{
/*
**Exercício — Animal + Cachorro + Preguica:** Criar a classe `Animal` com nome e idade (encapsulamento). 
Criar a classe `Cachorro` (herda de `Animal`) com indicador se corre ou não, 
e a classe `Preguica` (herda de `Animal`) com indicador se escala ou não. 
Em cada classe, implementar método que mostra o som emitido. 
Na classe principal: instanciar um `Cachorro` e uma `Preguica` e chamar o método de som. 
Declarar um objeto do tipo `Animal` e instanciar de forma polimórfica; chamar o método.
*/

protected boolean corre;

public Cachorro(String nome, int idade, boolean corre){
    super(nome,idade);
    this.corre = corre;
}

public void setCorre(boolean corre){
    this.corre = corre;
}

public boolean getCorre(){
    return this.corre;
}

public void emitirSom(){
    System.out.println("auau");
}




}
