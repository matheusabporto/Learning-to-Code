public abstract class Produto {
    /*
    ## 📦 Questão 2 — Classe `Produto`
> **Atributos e Construtor Padrão**

Crie uma classe chamada `Produto` com os atributos: `id` (`int`), `desc` (`String`) e `preco` (`Double`).

- [ ] **a)** Implemente um construtor padrão (sem parâmetros) que inicialize `id` com `0`, `desc` com `""` e `preco` com `0.0`.
- [ ] **b)** Implemente o método `mostrar()` que exiba a descrição do produto no console.

> ⚠️ **Atenção:** Na Questão 6, `Produto` será transformada em classe abstrata. Já pense em como isso afetará seu código.
 */

//atributos
protected int id;
protected String desc;
protected double preco;

//construtor
/* public Produto(){ // nao pode ser instanciado diretamente, mas pode ser chamado por construtores de subclasses
    this.id = 0;
    this.desc = "";
    this.preco = 0.0;
}
*/

//metodo mostrar

public abstract void mostrar();

}
