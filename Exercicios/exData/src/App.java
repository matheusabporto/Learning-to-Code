public class App {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data(11, 4, 2026);
        Data data2 = new Data(13, 5, 1992);
        Data data3 = new Data(01, 8, 1995);
        Data data4 = new Data(13,5,1992);

        System.out.println(data1.toString());
        System.out.println(data2.toString());
        System.out.println(data3.toString());
        data1.eIgual(data2);
        data2.eIgual(data4);
        data1.vemAntes(data2);
        data2.vemAntes(data3);
        
    }
}
