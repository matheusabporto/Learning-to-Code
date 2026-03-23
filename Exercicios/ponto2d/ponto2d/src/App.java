public class App {
    public static void main(String[] args) throws Exception {
        Ponto2D ponto1 = new Ponto2D(12,34);
        Ponto2D ponto2 = new Ponto2D(12,34);
        Ponto2D ponto3 = new Ponto2D(22,14);


        ponto1.compara(ponto2);
        ponto1.compara(ponto3);
        
            
        System.out.println("A distancia do ponto 1 ao 3 é de: " + ponto1.distancia(ponto3));
    }
}
