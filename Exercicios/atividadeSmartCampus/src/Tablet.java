import java.util.Random;
import java.util.Scanner;

public class Tablet implements Autenticavel{
    //atibutos
    private String numeroPatrimonio;

    //construtor
    public Tablet(String numeroPatrimonio){
        this.numeroPatrimonio = numeroPatrimonio;
    }

    // getters e setters

    public String getNumeroPatrimonio(){
        return this.numeroPatrimonio;
    }

    public void setNumeroPatrimonio(String numeroPatrimonio){
        this.numeroPatrimonio = numeroPatrimonio;
    }

    //métodos

    public void realizar2FA(){ 
        Random random = new Random(); 
        int codigo2FA = random.nextInt(9000) + 1000;
        System.out.println("Código 2FA " + codigo2FA + " enviado para o tablet " + this.numeroPatrimonio);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código 2FA para autenticar: ");
        int codigoDigitado = scanner.nextInt();
        if (codigoDigitado == codigo2FA){
            System.out.println("Autenticação realizada com sucesso para o tablet " + this.numeroPatrimonio);
        }else {
            System.out.println("Código 2FA incorreto. Autenticação falhou para o tablet " + this.numeroPatrimonio);
        }
    }

    public void mostra(){
        System.out.println("Número de patrimônio do tablet: " + this.numeroPatrimonio);
    }

}
