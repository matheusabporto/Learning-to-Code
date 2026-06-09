public interface Registravel {

    /*
    ## 📄 Questão 4 — Interface `Registravel`
> **Interfaces — NOVO ⭐**

Antes de implementar a classe `Pedido`, crie uma interface chamada `Registravel` que represente o contrato de qualquer entidade 
que possa ser registrada em arquivo.

- [ ] **a)** Declare na interface o método `registrar()` do tipo `void`, sem implementação.
- [ ] **b)** Declare também o método `String gerarResumo()`, que retorna um texto representando o objeto.
- [ ] **c)** Explique com suas palavras: qual é a diferença entre uma interface e uma classe abstrata? Em que situação você escolheria uma em vez da outra?

> 🎯 **Conceito-chave:** Uma interface define um **contrato** — ela diz **O QUE** uma classe deve fazer, mas não **COMO**. Qualquer classe que implemente `Registravel` é obrigada a fornecer os dois métodos declarados.

*/

public void registrar();

public String gerarResumo();

// Resposta: A diferença entre uma interface e uma classe abstrata é que uma interface só pode declarar métodos sem implementação, 
// enquanto uma classe abstrata pode ter métodos com ou sem implementação. Eu escolheria uma interface quando quero garantir que 
// diferentes classes implementem um conjunto específico de métodos, independentemente de sua hierarquia de classes. 
// Já escolheria uma classe abstrata quando quero fornecer uma base comum para um grupo de classes relacionadas, 
// permitindo que compartilhem código e comportamento.



}