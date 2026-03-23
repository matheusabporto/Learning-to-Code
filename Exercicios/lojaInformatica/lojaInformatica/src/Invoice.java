public class Invoice {
/*
Criar uma classe chamada Invoice que possa ser utilizada por
uma loja de informatica para representar uma fatura de um item vendido.
Uma fatura deve incluir as seguintes informacoes: o identificador (String) do
item faturado, a quantidade comprada do item e o preco unitario do item.
Ao utilizar um construtor, inicialize um objeto do tipo Invoice. Se a quantidade
nao for positiva, ela deve ser configurada como 0. Se o preco do item
nao for positivo ele deve ser configurado como 0.0. Alem disso, forneca um
metodo que calcula o valor da fatura, alem de gets e sets.
*/

// atributos
private String identificador;
private int quantidade;
private double precoUnitario;

//Contrutor
public Invoice(String identificador, int quantidade, double precoUnitario){
    this.identificador = identificador;
    if(quantidade<=0){
        this.quantidade=0;
    }else {
        this.quantidade = quantidade;   
    }
    if(precoUnitario<=0){
        this.precoUnitario = 0.0;
    }else{
        this.precoUnitario = precoUnitario;
    }
    
}

//Encapsuladores

public void setIdentificador(String identificador){
    this.identificador = identificador;
}

public String getIdentificador(){
    return this.identificador;
}

public void setQuantidade(int quantidade){
    if(quantidade<=0){
        this.quantidade = 0;
    }else {
        this.quantidade = quantidade;
    }
}

public int getQuantidade(){
    return this.quantidade;
}

public void setPrecoUnitario(double precoUnitario){
    if(precoUnitario<=0){
        this.precoUnitario = 0.0;
    }else {
        this.precoUnitario = precoUnitario;
    }
}

public double getPrecoUnitario(){
    return this.precoUnitario;
}

//metodos

public double calcularFatura(){
return this.quantidade*this.precoUnitario;
}

}
