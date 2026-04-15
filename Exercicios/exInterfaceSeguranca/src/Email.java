public class Email implements Seguranca {
    
    /*- [ ] **Exercício — Interface Seguranca + Conta + Email:** 
Implementar a interface `Seguranca` com assinatura do método booleano
 `verificaSenha(senha)`, além dos métodos `mensagemSucesso()` e `mensagemFracasso()`. 
 Implementar a classe `Conta` com atributos CPF, senha e saldo; 
 métodos `saca(valor, senha)` e `deposita(valor, senha)` (só realiza a operação se a senha for correta). 
 Implementar a classe `Email` com atributos nome, e-mail e senha; 
 mesmos métodos de verificação/mensagem.
*/

//atributos
protected String nome;
protected String email;
protected String senha;

//Construtor
public Email(String nome, String email, String senha){
    this.nome = nome;
    this.email = email;
    this.senha = senha;

}

//Getters e Setters
public void setNome(String nome){
    this.nome = nome;
}
public String getNome(){
    return this.nome;
}

public void setSenha(String senha){
    this.senha = senha;
}
public String getSenha(){
    return this.senha;
}

public void setEmail(String email){
    this.email = email;
}
public String getEmail(){
    return this.email;
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

//Métodos






}
