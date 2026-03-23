public class App {
    public static void main(String[] args) throws Exception {
        
        int n = 5;
        Produto[] lista = new Produto[n];

        lista[0] = new Produto("12345", 12.5, 5.50);
        lista[1] = new Produto("12346", 6.5, 25.50);
        lista[2] = new Produto("12347", 22.5, 241.20);
        lista[3] = new Produto("12348", 4.5, 445.50);
        lista[4] = new Produto("12349", 13.5, 6445.50);

       // variaveis para calculos

       int contFiltro = 0; // contagem de produtos peso>10 e valor< 50.0
       double somaPesos = 0.0; // contagem da media dos pesos
       Produto maisLeve = lista[0]; // Começamos assumindo que o primeiro produto é o mais leve
       Produto maiorValor = lista[0]; // Começamos assumindo que o primeiro produto é o de maior valor
       double somaValores = 0.0; // soma dos valores dos produtos com peso maior que 10
       int contPesoMaior10 = 0; // contagem do numero de produtos com peso maior que 10

       // laço de repetição

       for (int i=0 ; i < lista.length ; i++){

            // Algoritmo A:  Contar peso > 10 e valor < 50
            if(lista[i].getPeso() > 10 && lista[i].getValor() < 50){
                contFiltro++;
            }

            //Algoritmo B: Somar pesos para a média
            somaPesos += lista[i].getPeso();

            //Algoritmo C: Encontrar o mais leve (Comparação)
            if (lista[i].getPeso() < maisLeve.getPeso()){
                maisLeve = lista[i];    
            }

            //Algoritmo D: Encontrar o maior valor
            if(lista[i].getValor()> maiorValor.getValor()){
                maiorValor = lista[i];
            }

            //Algoritmo E: Média de valores apenas para produtos com peso > 10
            if(lista[i].getPeso() > 10){
                contPesoMaior10++;
                somaValores += lista[i].getValor();
            }
       
        }

        //a)contar quantos produtos tem peso maior que 10 e valor menor que R$ 50,00
        System.out.println("A quantidade de produtos que possuem peso maior que 10 e valor menor que R$ 50 é: " + contFiltro);
        //b)calcular a media dos pesos
        System.out.println("A média de pesos é: " + (somaPesos/lista.length));
        //c)capturar o produto mais leve e mostrar as informacoes dele chamando o metodo implementado
        maisLeve.mostra();
        //d)capturar o produto de maior valor e mostrar as informacoes dele chamando o metodo implementado
        maiorValor.mostra();
        //e)calcular a media dos valores cujo peso do produto é maior que 10
        if(contPesoMaior10>0){
            System.out.println("a media dos valores cujo peso do produto é maior que 10kg é: " + (somaValores/contPesoMaior10));
        } else{
            System.out.println("Não existem produtos com peso maior que 10");
        }
    }
}
