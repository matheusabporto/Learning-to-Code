import java.util.Random;
import java.util.Scanner;

public class Professor extends MembroAcademico implements Autenticavel {

    //atributos
    private double salario;

    //construtor
    public Professor(String nome, String registro, double salario){
        super(nome, registro);
        this.salario = salario;
    }

    //getters e setters

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    //métodos

    public double bonusRU(){
        double bonusRU = (this.salario * 0.15);
        return bonusRU;
    }

    public void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("O bonus do RU para o professor corresponde a 15% de seu salário, totalizando R$ " + this.bonusRU());
    }

    public void realizar2FA(){ 
        Random random = new Random(); 
        int codigo2FA = random.nextInt(9000) + 1000;
        System.out.println("Código 2FA " + codigo2FA + " enviado para o professor " + this.nome);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código 2FA para autenticar: ");
        int codigoDigitado = scanner.nextInt();
        if (codigoDigitado == codigo2FA){
            System.out.println("Autenticação realizada com sucesso para o professor " + this.nome);
        }else {
            System.out.println("Código 2FA incorreto. Autenticação falhou para o professor " + this.nome);
        }
    }

}
