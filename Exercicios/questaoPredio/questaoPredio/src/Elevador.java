public class Elevador {
/*
Criar uma classe denominada Elevador para armazenar as informacoes de um elevador 
dentro de um predio. A classe deve armazenar o andar atual (terreo = 0), 
total de andares no predio, capacidade do elevador (numero maximo de pessoas) 
e quantas pessoas estao presentes nele. Alem de metodos gets e sets, 
a classe deve disponibilizar os seguintes componentes:

•   construtor: que deve receber como parametros a capacidade do elevador
    e o total de andares no predio (os elevadores sempre comecam no terreo
    e vazio);
•   entra: para acrescentar uma pessoa no elevador (so deve acrescentar se
    ainda houver espaco);
•   sai: para remover uma pessoa do elevador (so deve remover se houver
    alguem dentro dele);
•   sobe: para subir um andar (nao deve subir se ja estiver no ultimo
    andar);
•   desce: para descer um andar (nao deve descer se ja estiver no terreo).
*/

//atributos

private int andarAtual;
private int totalAndares;
private int capacidade;
private int pessoasPresentes;


//construtor
public Elevador(int capacidade, int totalAndares){
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
    this.andarAtual = 0;
    this.pessoasPresentes = 0;
}

//encapsulamento
public int getAndarAtual(){
    return this.andarAtual;
}

public void setAndarAtual(int andarAtual){
    this.andarAtual= andarAtual;
}

public int getTotalAndares(){
    return this.totalAndares;
}

public void setTotalAndares(int totalAndares){
    this.totalAndares = totalAndares;
}

public int getCapacidade(){
    return this.capacidade;
}

public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
}

public int getPessoasPresentes(){
    return this.pessoasPresentes;
}

public void setPessoasPresentes(int pessoasPresentes){
    this.pessoasPresentes = pessoasPresentes;
}

//metodos

//entra
public void entra(){
    if(this.pessoasPresentes < this.capacidade){
        this.pessoasPresentes++;
    } else {
        System.out.println("O elevador esta cheio. Não é possível entrar mais pessoas.");
    }
}

//sai
public void sai(){
    if(this.pessoasPresentes > 0){
        this.pessoasPresentes--;
    } else {
        System.out.println("O elevador está vazio. Não há pessoas para sair.");
    }
}

//sobe
public void sobe(){
    if(this.andarAtual < this.totalAndares -1){ // o ultimo andar é totalAndares -1, pois o andar inicial é 0.}
        this.andarAtual++;
    } else {
        System.out.println("O elevador já está no último andar. Não é possível subir mais.");
    }
}

//desce
public void desce(){
    if(this.andarAtual>0){ // o andar mínimo é 0, pois o elevador começa no térreo.
        this.andarAtual--;
    } else {
        System.out.println("O elevador já está no térreo. Não é possível descer mais.");
    }
}

public void statusElevador(){
    if(andarAtual == 0){
    System.out.println("O elevador está no térreo.");
    } else if(andarAtual == totalAndares -1){
    System.out.println("O elevador está no último andar.");
    } else {
    System.out.println("O elevador está no andar " + andarAtual + " .");
    }
}

}