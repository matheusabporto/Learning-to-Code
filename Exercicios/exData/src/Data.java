public class Data {
/*
- [ ] **Exercício — Classe Data:** Criar a classe `Data` com os atributos dia, mês e ano. Implementar: gets/sets; 
método toString() formatado como "dd/mm/aaaa"; método que checa se uma data é igual a outra; 
método `vemAntes()` que retorna true se a data da instância vem antes da passada como argumento (datas iguais retornam true). 
Na classe principal, inicializar um objeto e fazer chamadas a todos os métodos.

Obs1* - O método `toString()` não imprime — ele retorna uma String. Para imprimir, você precisa
usar `System.out.println(data1.toString())` ou simplesmente `System.out.println(data1)`,
pois o `println` chama automaticamente o `toString()` do objeto.

*/
//atributos

private int dia;
private int mes;
private int ano;

//gets/sets

public void setDia(int dia){
    this.dia = dia;
}

public int getDia(){
    return this.dia;
}

public void setMes(int mes){
    this.mes = mes;
}

public int getMes(){
    return this.mes;
}

public void setAno(int ano){
    this.ano = ano;
}

public int getAno(){
    return this.ano;
}

//construtor

public Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
}

//metodos
// método toString() formatado como "dd/mm/aaaa"
public String toString(){ //  O retorno é String, não void O toString() não imprime — ele retorna uma String. 
    return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano); /*Os marcadores mais comuns:
                                                %s → String
                                                %d → inteiro
                                            %02d → inteiro com 2 dígitos (coloca zero à esquerda se precisar)*/

}

// método para comparar se uma data é igual a outra

public boolean eIgual(Data data) {
    if(this.dia == data.dia && this.mes == data.mes && this.ano == data.ano) {
        System.out.println("As datas são iguais.");
        return true;
    } else {
        System.out.println("As datas são diferentes.");
        return false;
    }
}

// método para comparar se a data da instância vem antes da data passada como argumento
public boolean vemAntes(Data data){
    if(this.ano < data.ano) {
        System.out.println("A data " + this.toString() + " vem antes da data " + data.toString() + ".");
        return true;
    } else if (this.ano == data.ano && this.mes < data.mes) {
        System.out.println("A data " + this.toString() + " vem antes da data " + data.toString() + ".");
        return true;
    } else if (this.ano == data.ano && this.mes == data.mes && this.dia < data.dia) {
        System.out.println("A data " + this.toString() + " vem antes da data " + data.toString() + ".");
        return true;
    } else {
        System.out.println("A data " + this.toString() + " não vem antes da data " + data.toString() + ".");
        return false;
    }
}
    


}

