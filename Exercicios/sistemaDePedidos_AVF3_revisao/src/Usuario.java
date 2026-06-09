public class Usuario extends Pessoa {
    /*
    ## 👤 Questão 3 — Classe `Usuario`
> **Herança**

Crie uma classe `Usuario` que herde de `Pessoa` e adicione o atributo `anoNascimento` do tipo `int`.

- [ ] **a)** Implemente o construtor de `Usuario` recebendo todos os dados necessários e utilize `super()` para reaproveitar o construtor da classe pai.
- [ ] **b)** Explique com suas palavras: por que `Usuario` não precisa redeclarar os atributos `cpf`, `nome`, `email` e `senha`?

> 💡 **Dica:** Lembre-se da sintaxe: `public class Usuario extends Pessoa { ... }`
 */

//atributo 

protected int anoNascimento;

//construtor
public Usuario(String cpf, String nome, String email, String senha, int anoNascimento){
    super(cpf, nome, email, senha);
    this.anoNascimento = anoNascimento;
}

//Usuario nao precisa declarar atributos cpf, nome, email e senha porque herdam da classe Pessoa.

}
