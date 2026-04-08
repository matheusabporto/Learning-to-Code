public abstract class Veiculo {
/* Criar classe Abstrata com veículo e um método abstrato mover(). 
Crie subclasses Carro e Bicicleta, que sobrevescrevem mover(); */

private String nome;
private int rodas;

public Veiculo(String nome, int rodas){
    this.nome = nome;
    this.rodas = rodas;
}

public abstract void mover();



}
