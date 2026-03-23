public class Conta {

    /** Exercicio. 1. Criar a classe Conta que possui o CPF do titular da conta, o
numero representativo do banco e o saldo. Implementar metodo que retorna
a bonificação do correntista. A bonificação e 10% do valor do saldo. Imple-
mentar metodos que realizam o saque de um valor e o deposito de um valor.
Implementar metodo para mostrar os atributos.
Exerccio. 
2. Modicar a classe e incluir um atributo que indica se o corren-
tista e um cliente especial ou não. Refazer o metodo
3.Implementar metodo que realiza a transfer^encia de valor de uma
conta para outra.
*/

    private String cpf;
    private int numBanco;
    private double saldo;
    private boolean especial;

    public Conta(String cpf, int numBanco, double saldo, boolean especial){
        this.cpf = cpf;
        this.numBanco = numBanco;
        this.saldo = saldo;
        this.especial = especial;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setNumBanco(int numBanco){
        this.numBanco = numBanco;
    }

    public int getNumBanco(){
        return this.numBanco;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setEspecial(boolean especial){
        this.especial = especial;
    }

    public boolean isEspecial(){
        return this.especial;
    }

    public double bonificacao(){
        if(especial){
            return (this.saldo*0.1);
        }   else {
            return (this.saldo*0.05);
        }
    }

    public void saque(double valor){
        if (valor>0 && valor<=this.saldo){
            saldo = saldo - valor;
            System.out.println("Saldo após o saque: " + this.saldo);
        }   else {
            System.out.println("Saldo insuficiente. Tente novamente.");
        }
    }


    public void deposito(double valor){
        if (valor>0){
            saldo = saldo + valor;
        }
    System.out.println("Saldo após o depósito: " + this.saldo);    
    }

    public void transferencia(Conta contaDestino, double valor){
        if (valor>0 && valor<=this.saldo){
            this.saque(valor);
            contaDestino.deposito(valor);
            System.out.println("transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para fazer realizar a transferência desejada. Tente novamente");
        }
    }





    public void mostra(){
        System.out.println("CPF: " + this.cpf);
        System.out.println("Número do Banco: " + this.numBanco);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("A bonificação é no valor de R$" + this.bonificacao());
        if (especial){
        System.out.println("o cliente é um cliente ESPECIAL");
        }   else {
            System.out.println("O Cliente não é um cliente ESPECIAL");
        }
    }
}
