import java.util.Random; //importação da classe Random para gerar números aleatórios
import java.util.Scanner; //importação da classe Scanner para ler a entrada do usuário

public class Aluno extends MembroAcademico implements Autenticavel {

    //construtor
    public Aluno(String nome, String registro){
        super(nome, registro);
    }

    //métodos

    public double bonusRU(){ 
        double bonusRU = 200.00;
        return bonusRU;
    }

    public void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("O bônus do RU para o aluno " + this.nome + " é de R$ " + this.bonusRU());
    }

    public void realizar2FA(){ //a ideia vai ser criar um codigo aleatorio de 4 digitos e depois pedir para ele digitar, se o codigo for o mesmo, estará autenticado.
        Random random = new Random(); 
        int codigo2FA = random.nextInt(9000) + 1000;
        System.out.println("Código 2FA " + codigo2FA + " enviado para o aluno " + this.nome);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código 2FA para autenticar: ");
        int codigoDigitado = scanner.nextInt();
        if (codigoDigitado == codigo2FA){
            System.out.println("Autenticação realizada com sucesso para o aluno " + this.nome);
        }else {
            System.out.println("Código 2FA incorreto. Autenticação falhou para o aluno " + this.nome);
        }
    }


}
