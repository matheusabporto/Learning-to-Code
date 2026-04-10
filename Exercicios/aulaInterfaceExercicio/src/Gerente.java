public class Gerente extends Funcionario {

    public Gerente(String nome,double salario){
        super(nome,salario);
    }

    public void calcularBonus(){
        this.salario = this.salario*2;
        System.out.println("bonificação x2");
    }

    public void baterPonto(){
        System.out.println("Batendo ponto");
    }

    
}
