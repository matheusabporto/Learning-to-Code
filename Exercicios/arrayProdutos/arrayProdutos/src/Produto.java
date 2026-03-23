public class Produto {
/*
Exercício. Criar a classe Produto, que possui um codigo (String), um peso
e um valor (em reais). Implementar um metodo para mostrar as informacoes
de um produto. Criar um vetor que armazena n produtos. Implementar
algoritmos para:
• contar quantos produtos tem peso maior que 10 e valor menor que
R$ 50,00;
• calcular a media dos pesos;
• capturar o produto mais leve e mostrar as informacoes dele chamando
o metodo implementado;
• capturar o produto de maior valor e mostrar as informacoes dele chamando
o metodo implementado;
• calcular a media dos valores cujo peso do produto é maior que 10.
*/

//atributos

private String codigo;
private double peso;
private double valor;

//construtor

public Produto(String codigo, double peso, double valor){
this.codigo = codigo;
this.peso = peso;
this.valor = valor;
}

// encapsuladores

public void setCodigo(String codigo){
    this.codigo = codigo;
}

public String getCodigo(){
    return this.codigo;
}

public void setPeso(double peso){
    this.peso = peso;
}

public double getPeso(){
    return this.peso;
}

public void setValor(double valor){
    this.valor = valor;
}

public double getValor(){
    return this.valor;
}

// metodo

public void mostra(){
    System.out.println("Código: " + this.codigo);
    System.out.println("Peso: " + this.peso);
    System.out.println("Valor: R$ " + this.valor);
}

}
