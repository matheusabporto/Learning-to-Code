public class App {
    public static void main(String[] args) throws Exception {
        Invoice arroz = new Invoice("arroz", 15, 3.50);
        Invoice tv = new Invoice("tv", 5, 2375.50);

    System.out.println("O valor total da fatura do item arroz é de R$ " + arroz.calcularFatura() + " reais");
    System.out.println("O valor total da fatura do item TV é de R$ " + tv.calcularFatura() + " reais");
    

    }
}
