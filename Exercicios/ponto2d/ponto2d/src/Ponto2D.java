public class Ponto2D {

/*
Escrever a classe Ponto2D que representa um ponto no plano
cartesiano. Alem dos atributos por voce identificados, a classe deve oferecer
as seguintes caracterısticas: (i) atributos privados do ponto; (ii) metodos gets
e sets; (iii) metodo que compara se um ponto e igual a outro; (iv) metodo
que calcula a distancia euclidiana de um ponto ate outro.
*/

//atributos
private int x;
private int y;

//Construtor

public Ponto2D(int x, int y){
    this.x = x;
    this.y = y;
}

//Encapsuladores

public void setX(int x){
    this.x = x;
}

public int getX(){
    return this.x;
}

public void setY(int y){
    this.y = y;
}

public int getY(){
    return this.y;
}

//metodos

public void compara(Ponto2D outroPonto){
    if(this.x == outroPonto.x && this.y == outroPonto.y){
         System.out.println("Os pontos possuem os mesmos valores atibuidos");
        } else {
            System.out.println("Os pontos são diferentes");
        }
}


public double distancia(Ponto2D outroPonto){ //distancia euclidiana = raiz quadrada da soma dos quadrados das diferenças entre suas coordenadas.
    return Math.sqrt( Math.pow(outroPonto.x - this.x,2) + Math.pow(outroPonto.y-this.y,2) );
}


}