public class Estagiario extends Funcionario{
    
    public Estagiario(String nome,double salario) {
        super(nome,salario);
    }

    public void calcularBonus(){
        this.salario = this.salario*1.2;
        System.out.println("bonificação x 1.2");   
    }

    public void baterPonto(){
        System.out.println("Batendo ponto");
    }

    public void mostrar(){
        System.out.println(nome);
        System.out.println(salario);
        }
}




