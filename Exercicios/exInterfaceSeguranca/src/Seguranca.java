public interface Seguranca {

/* 
- [ ] **Exercício — Interface Seguranca + Conta + Email:** 
Implementar a interface `Seguranca` com assinatura do método booleano
 `verificaSenha(senha)`, além dos métodos `mensagemSucesso()` e `mensagemFracasso()`. 
 Implementar a classe `Conta` com atributos CPF, senha e saldo; 
 métodos `saca(valor, senha)` e `deposita(valor, senha)` (só realiza a operação se a senha for correta). 
 Implementar a classe `Email` com atributos nome, e-mail e senha; 
 mesmos métodos de verificação/mensagem.
*/

public boolean verificaSenha(String senha);
public void mensagemSucesso();
public void mensagemFracasso();




}
