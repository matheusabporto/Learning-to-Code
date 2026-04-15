public class Conta implements Seguranca {

    /*- [ ] **Exercício — Interface Seguranca + Conta + Email:** 
Implementar a interface `Seguranca` com assinatura do método booleano
 `verificaSenha(senha)`, além dos métodos `mensagemSucesso()` e `mensagemFracasso()`. 
 Implementar a classe `Conta` com atributos CPF, senha e saldo; 
 métodos `saca(valor, senha)` e `deposita(valor, senha)` (só realiza a operação se a senha for correta). 
 Implementar a classe `Email` com atributos nome, e-mail e senha; 
 mesmos métodos de verificação/mensagem.
*/

//atributos
protected String cpf;
protected String senha;
protected double saldo;

//Construtor
public Conta(String cpf, String senha, double saldo){
    this.cpf = cpf;
    this.senha = senha;
    this.saldo = saldo;
}

//Getters e Setters
public void setCpf(String cpf){
    this.cpf = cpf;
}
public String getCpf(){
    return this.cpf;
}

public void setSenha(String senha){
    this.senha = senha;
}
public String getSenha(){
    return this.senha;
}

public void setSaldo(double saldo){
    this.saldo = saldo;
}
public double getSaldo(){
    return this.saldo;
}

//métodos - SÓ REALIZA A OPERAÇÃO SE  A SENHA FOR CORRETA

public boolean verificaSenha(String senha){
    return this.senha.equals(senha);
}

public void mensagemSucesso(){
    System.out.println("Sucesso! Senha verificada!");
}

public void mensagemFracasso(){
    System.out.println("Erro. Senha incorreta!");
}

//métodos

public void sacar(double valor, String senha){
    if (verificaSenha(senha)){
        this.saldo = this.saldo - valor;
        mensagemSucesso();
    }else {
        mensagemFracasso();
    }
}


public void depositar(double valor, String senha){
    if (verificaSenha(senha)){
        this.saldo = this.saldo + valor;
        mensagemSucesso();
    }else {
        mensagemFracasso();
    }
}


}
