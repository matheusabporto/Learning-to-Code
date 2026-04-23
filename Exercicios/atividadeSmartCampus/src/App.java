public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Joao", "12345");
        Professor professor1 = new Professor("Maria", "678910", 5000.00);
        Tablet tablet1 = new Tablet("T01");
        MembroAcademico aluno2 = new Aluno("Francisco", "54321");
        MembroAcademico professor2 = new Professor("Jorge", "13579", 3500.00);

        aluno1.mostra();
        aluno1.realizar2FA();
        

        professor1.mostra();
        professor1.realizar2FA();
       

        tablet1.mostra();
        tablet1.realizar2FA();

        aluno2.mostra();
        // aluno2.realizar2FA(); -> nao da pra fazer porque membroacademino nao implementa esse metodo da classe de interface Autenticavel.
        

        professor2.mostra();
        // professor2.realizar2FA(); -> nao da pra fazer porque membroacademino nao implementa esse metodo da classe de interface Autenticavel.
        
    }
}
