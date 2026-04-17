public class Preguica extends Animal{
/*
**Exercício — Animal + Cachorro + Preguica:** Criar a classe `Animal` com nome e idade (encapsulamento). 
Criar a classe `Cachorro` (herda de `Animal`) com indicador se corre ou não, 
e a classe `Preguica` (herda de `Animal`) com indicador se escala ou não. 
Em cada classe, implementar método que mostra o som emitido. 
Na classe principal: instanciar um `Cachorro` e uma `Preguica` e chamar o método de som. 
Declarar um objeto do tipo `Animal` e instanciar de forma polimórfica; chamar o método.
*/

protected boolean escala;

public Preguica(String nome,int idade, boolean escala){
    super(nome,idade);
    this.escala = escala;
}

public void setEscala(boolean escala){
    this.escala = escala;
}

public boolean getEscala(){
    return this.escala;
}

public void emitirSom(){
    System.out.println("barulho de bicho preguiça");
}


}


