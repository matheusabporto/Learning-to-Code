# Learning to Code — POO em Java
> Repositório de exercícios da disciplina de **Programação Orientada a Objetos** da Universidade de Fortaleza (UNIFOR) — Prof. Rommel Dias.

---

## Estrutura do Repositório

```
Learning-to-Code/
├── Exercicios/
│   ├── arrayProdutos/       → Vetores de objetos (classe Produto)
│   ├── aulaInterface/       → Aula de interfaces (Funcionario, Gerente, Estagiario)
│   ├── aulaInterfaceExercicio/ → Exercício de interfaces com bonificação
│   ├── calcularIMC/         → Classe Pessoa com cálculo de IMC
│   ├── CpfBanco/            → Conta bancária com CPF
│   ├── empregado/           → Classe Empregado na firma
│   ├── idadePessoa/         → Cálculo de idade com classe Pessoa
│   ├── lojaInformatica/     → Classe Invoice (fatura de loja)
│   ├── ponto2d/             → Ponto no plano cartesiano 2D
│   └── questaoPredio/       → Elevador de prédio
├── ListaCompletaPOO.pdf     → Lista completa de exercícios (AV1, AV2, AV3 + Desafios)
├── Lista-de-Exercícios-Heranca.pdf → Lista de exercícios de Herança
└── 4 - Exercicio-Classes Abstratas-Interface.pdf → Exercícios de Classes Abstratas e Interface
```

---

## Conceitos Abordados

- Classes, atributos e métodos
- Encapsulamento (getters/setters/construtores)
- Vetores e ArrayLists de objetos
- Relacionamento entre classes
- Herança simples e múltipla
- Classes abstratas e interfaces
- Polimorfismo
- Exceções (try/catch)
- Leitura e escrita de arquivos

---

## 📄 Lista Completa de POO — `ListaCompletaPOO.pdf`

### AV1

#### Aula: Transição para o Java (parte I)
> Tipos de variáveis, condicionais e repetição.
- [ ] Exercício: Atividade prática com tipos, condicionais e laços em Java.

#### Aula: Transição para o Java (parte II)
> Vetores e algoritmos fundamentais.
- [ ] Exercício: Atividade prática com vetores e algoritmos em Java.

#### Aula: Transição para o Java (parte III)
- [ ] Exercício: Atividade geral com linguagem Java.

---

#### Aula: Classes — atributos e métodos (parte I)
- [x] **Exercício — Classe Pessoa:** Criar a classe `Pessoa` com atributos nome, ano de nascimento, peso, altura. Implementar métodos para calcular o IMC, a idade, a quantidade de água que a pessoa necessita beber por dia. Implementar método `mostra()` (void).

---

#### Aula: Classes — atributos e métodos (parte II)
- [x] **Exercício — Classe Conta (v1):** Criar a classe `Conta` com atributos CPF do titular, número representativo do banco e saldo. Implementar método que retorna a bonificação do correntista (10% do saldo). Implementar métodos de saque, depósito e mostrar atributos.
- [x] **Exercício — Classe Conta (v2):** Modificar a classe `Conta` incluindo atributo que indica se o correntista é cliente especial ou não. Refazer o método de bonificação: 10% se especial, 5% se não.
- [x] **Exercício — Classe Conta (v3):** Implementar método que realiza a transferência de valor de uma conta para outra.

---

#### Aula: Classes — vetores de objetos
- [x] **Exercício — Classe Produto:** Criar a classe `Produto` com código (String), peso e valor (em reais). Implementar método `mostra()`. Criar um vetor de *n* produtos e implementar algoritmos para:
  - Contar quantos produtos têm peso maior que 10 e valor menor que R$ 50,00;
  - Calcular a média dos pesos;
  - Capturar o produto mais leve e mostrar suas informações;
  - Capturar o produto de maior valor e mostrar suas informações;
  - Calcular a média dos valores cujo peso é maior que 10.

---

#### Aula: Classes — construtores e encapsulamento (parte I)
- [x] **Exercício — Classe Pessoa (com encapsulamento):** Criar classe `Pessoa` com atributos privados: nome, CPF, ano de nascimento, altura. Criar gets/sets públicos, método para mostrar todos os dados e método para calcular a idade.
- [x] **Exercício — Classe Empregado:** Criar classe `Empregado` com atributos nome, sobrenome e salário mensal. Construtor que inicializa os três atributos (salário negativo → 0). Gets e sets para cada atributo. Método `forneceAumento()` que aumenta em 10% o salário. Na classe principal, criar dois objetos e exibir o salário anual de cada um.
- [x] **Exercício — Classe Invoice:** Criar classe `Invoice` para loja de informática, representando a fatura de um item vendido. Atributos: identificador (String), quantidade comprada e preço unitário. Usar construtor para inicializar (quantidade negativa → 0; preço negativo → 0.0). Implementar método que calcula o valor total da fatura, além de gets e sets.

---

#### Aula: Classes — construtores e encapsulamento (parte II)
> Uso do `this`.
- [x] **Exercício — Classe Ponto2D:** Escrever a classe `Ponto2D` representando um ponto no plano cartesiano. Atributos privados; gets/sets; método que compara se um ponto é igual a outro; método que calcula a distância euclidiana de um ponto até outro.

---

#### Aula: Classes — construtores e encapsulamento (parte III)
- [x] **Exercício — Classe Elevador:** Criar a classe `Elevador` para armazenar informações de um elevador dentro de um prédio. Atributos: andar atual (térreo = 0), total de andares, capacidade (máximo de pessoas) e quantidade de pessoas presentes. Métodos: construtor (recebe capacidade e total de andares; começa no térreo e vazio), `entra()` (adiciona pessoa se houver espaço), `sai()` (remove pessoa se houver alguém), `sobe()` (não sobe se já estiver no último andar), `desce()` (não desce se já estiver no térreo).
- [x] **Exercício — Classe Data:** Criar a classe `Data` com os atributos dia, mês e ano. Implementar: gets/sets; método toString() formatado como "dd/mm/aaaa"; método que checa se uma data é igual a outra; método `vemAntes()` que retorna true se a data da instância vem antes da passada como argumento (datas iguais retornam true). Na classe principal, inicializar um objeto e fazer chamadas a todos os métodos.
- [x] **Exercício — Classe Turma:** Implementar a classe `Turma` com um vetor de nomes dos alunos, um vetor de idades e um vetor de médias. Construtor e gets/sets associados. Métodos: `idadeMaisVelho()` (retorna a maior idade), `nomeMaisNovo()` (retorna o nome do aluno mais novo), `numeroAprovados()` (aluno aprovado com média ≥ 7.0).
- [ ] **Exercício — Classe Imovel:** Uma imobiliária trabalha com casas (tipo 1) e apartamentos (tipo 2). Atributos: tipo, proprietário, tamanho (m²), se está em área nobre, ano de construção e valor de compra. Implementar: classe `Imovel` com construtor, gets/sets; método para calcular IPTU (regras na tabela do PDF); método para calcular o valor de venda (regras na tabela do PDF); método para calcular a idade do imóvel; método `mostra()`. Na classe principal: vetor de *n* imóveis; mostrar IPTUs e valores de venda; mostrar proprietários com imóveis de mais de 10 anos; quantidade de apartamentos e casas; média do tamanho de apartamentos em área nobre; menor IPTU de casa fora de área nobre; tamanho do imóvel com menor valor de venda.

---

### AV2

#### Aula: Classes — relacionamento entre classes (parte I)
- [ ] **Exercício — Cliente + Conta:** Implementar a classe `Cliente` com CPF e endereço (encapsulamento + método `imprimir()`). Implementar a classe `Conta` associada a um cliente, com saldo não negativo (encapsulamento + método `imprimir()`). Instanciar um objeto `Conta` na classe principal.
- [ ] **Exercício — Operacao + fazOperacao:** Implementar a classe `Operacao` com tipo (D – depósito ou R – retirada) e valor associado. Na classe `Conta`, implementar o método `fazOperacao()` que realiza uma operação e atualiza o saldo. Realizar *n* operações sobre uma conta na classe principal.

---

#### Aula: Classes — relacionamento entre classes (parte II)
- [ ] **Exercício — Aluno + Turma:** Implementar a classe `Aluno` com nome, ano de nascimento e média global. Método `imprimir()`. Implementar a classe `Turma` com conjunto de alunos e um curso. Métodos: retornar o aluno com maior média; retornar o aluno mais novo. Instanciar um objeto `Turma` e chamar os métodos.
- [ ] **Exercício — Agenda + Contato:** Implementar as classes `Agenda` e `Contato`. Cada contato tem nome, telefone e indicador se é favorito. Na classe `Agenda`: método que retorna a quantidade de contatos favoritos; método que retorna quantos contatos começam com a letra "R" (ou "r"). Inicializar um objeto `Agenda` e fazer chamadas aos métodos.
- [ ] **Exercício — Classe Voo:** Escrever a classe `Voo` que armazena e realiza operações de um voo. Atributos: data (classe `Data`), quantidade de assentos, vetor de assentos (reservado ou não). Construtor (recebe data e número de assentos; todos desocupados inicialmente). Métodos: `verifica()` (retorna se assento está ocupado); `ocupa()` (reserva um assento); `vagas()` (retorna número de cadeiras vagas); `imprimir()` (mostra data e cadeiras disponíveis). Fazer chamadas na classe principal.
- [ ] **Exercício — Produto + Loja:** Implementar a classe `Produto` com código (letras e números), nome, valor e quantidade em estoque; construtor, gets/sets e método `imprimir()`. Implementar a classe `Loja` com conjunto de produtos. Métodos: `vender()` (realiza a venda de uma unidade); `abastecer()` (abastece uma unidade); `valorEstoque()` (computa o valor total do estoque). Instanciar um objeto `Loja` e fazer chamadas.

---

#### Aula: Herança simples
> Superclasse, subclasse, `extends`, `super`, `protected`, `@Override`.
- [ ] **Exercício — Funcionario + Presidente:** Implementar a classe `Funcionario` com nome, CPF, salário; método que calcula e retorna o bônus (5% do salário). Implementar a classe `Presidente` herdando de `Funcionario` e adicionando a quantidade de ações da empresa. Instanciar objetos dos dois tipos, calcular e mostrar o bônus. Reimplementar o bônus do Presidente para 10% do salário e refazer a chamada.
- [ ] **Exercício — Estudante + Bolsista:** Implementar a classe `Estudante` com matrícula, ano de ingresso e curso. O preço da cópia de uma folha é R$0,10; implementar método que retorna o valor gasto com a cópia de um material. Implementar a classe `Bolsista` herdando de `Estudante`, com atributo valor da bolsa (em R$). Para bolsistas, o preço da cópia é reduzido para R$0,07. Implementar método que retorna o valor gasto com cópia e método que retorna quantas cópias o bolsista pode tirar com o valor da bolsa. Instanciar um `Estudante` e um `Bolsista` e fazer chamadas.

---

#### Aula: Herança múltipla
> Conceito de interface.
- [ ] **Exercício — Interface Seguranca + Conta + Email:** Implementar a interface `Seguranca` com assinatura do método booleano `verificaSenha(senha)`, além dos métodos `mensagemSucesso()` e `mensagemFracasso()`. Implementar a classe `Conta` com atributos CPF, senha e saldo; métodos `saca(valor, senha)` e `deposita(valor, senha)` (só realiza a operação se a senha for correta). Implementar a classe `Email` com atributos nome, e-mail e senha; mesmos métodos de verificação/mensagem.
- [ ] **Exercício — Hierarquia de formas geométricas:** Criar a seguinte hierarquia:
  - Interface `FormaGeometrica` com métodos de cálculo de perímetro e área;
  - Classe abstrata `Quadrilatero` cujo construtor recebe os 4 lados e implementa o cálculo do perímetro;
  - Classes `Retangulo` (construtor recebe base e altura) e `Quadrado` (construtor recebe apenas o lado);
  - Classe `Circulo` com construtor recebendo o raio.
  - Na classe principal: perguntar ao usuário quantas formas criar; para cada forma, perguntar o tipo (quadrado, retângulo ou círculo) e solicitar os dados. Armazenar todas em um vetor. Imprimir: (a) os dados (lados ou raio); (b) os perímetros; (c) as áreas. Para (b) e (c), usar polimorfismo.

---

#### Aula: Polimorfismo (parte I)
> Classes abstratas, métodos abstratos, `instanceof`.
- [ ] **Exercício — Animal + Cachorro + Preguica:** Criar a classe `Animal` com nome e idade (encapsulamento). Criar a classe `Cachorro` (herda de `Animal`) com indicador se corre ou não, e a classe `Preguica` (herda de `Animal`) com indicador se escala ou não. Em cada classe, implementar método que mostra o som emitido. Na classe principal: instanciar um `Cachorro` e uma `Preguica` e chamar o método de som. Declarar um objeto do tipo `Animal` e instanciar de forma polimórfica; chamar o método.
- [ ] **Exercício — Vetor de animais:** Usando o exercício anterior, armazenar em um único vetor objetos do tipo `Cachorro` e `Preguica`. Calcular a média da idade dos animais cadastrados.

---

#### Aula: Polimorfismo (parte II)
- [ ] **Exercício — Imovel + Casa + Apartamento + Imobiliaria:** Implementar a classe abstrata `Imovel` com área (m²), quantidade de quartos e preço de compra. Criar as classes `Casa` (indicador de quintal) e `Apartamento` (indicador de piscina na área externa). Regras de preço de venda: Casa com > 4 quartos ou quintal → +30%; senão → +15%. Apartamento com área > 300 m² e piscina → +50%; senão → +10%. Implementar método `calcularPrecoVenda()` em cada subclasse. Criar a classe `Imobiliaria` com um vetor de *n* imóveis (Casas ou Apartamentos). Métodos da `Imobiliaria`: calcular média do preço de compra; retornar quantidade de casas; retornar quantidade de apartamentos; retornar o imóvel de maior preço de venda.
- [ ] **Exercício — Ingresso + IngressoVip + IngressoComum:** Implementar a classe abstrata `Ingresso` com atributos: nome do evento, `ehMeia` (se é meia entrada), preço e lote. Implementar as classes `IngressoVip` e `IngressoComum` com o método obrigatório `calculaReembolso()`. Para ingressos comuns: reembolso de 5% se entrada inteira ou lote 1; senão 3%. Para VIPs: reembolso de 10% se entrada inteira e lote 1; senão 6%. Na classe principal, receber *n* ingressos, armazenar em um vetor e mostrar os reembolsos de todos.
- [ ] **Exercício — Veiculo + Carro + Moto + Van:** Criar a classe abstrata `Veiculo` com indicador de cor metálica, valor de fabricação, quantidade em estoque e método abstrato `calcularValorVenda()`. Criar as classes `Carro` (número de portas, câmbio automático), `Moto` (cilindradas) e `Van` (assentos, capacidade de peso). Calcular os valores de venda conforme tabelas do PDF. Todos os veículos têm seguro = 5% do valor de venda. Instanciar aleatoriamente um vetor de carros, motos e vans; calcular o maior valor de fabricação.
- [ ] **Exercício — Produto + Computador + Celular + Loja:** Criar a classe `Produto` com nome do modelo, preço e tempo de garantia (meses). Criar classes `Computador` (indicador de impressora) e `Celular` (indicador de carregador). Cada produto tem método `calcularDesconto(formaPagamento)` (formas 1 ou 2), com tabelas de desconto diferentes para computadores e celulares (ver PDF). Criar a classe `Loja` com conjunto de produtos. Métodos: `qntCelCarregador()` (quantidade de celulares com carregador); `computadorBarato()` (retorna o computador de menor preço). Instanciar um objeto `Loja` e fazer chamadas.

---

### AV3

#### Aula: Estruturas avançadas
> `ArrayList` e seus métodos.
- [ ] **Exercício — ArrayList de inteiros:** Criar um `ArrayList` de números inteiros. Efetuar operações de adição, remoção, busca, modificação e outros métodos da estrutura.
- [ ] **Exercício — Cliente + Academia:** Criar a classe `Cliente` com atributos: id (inteiro), nome, ano de nascimento, telefone. Criar a classe `Academia` com nome e lista de clientes. Métodos da `Academia`: cadastrar novo cliente; remover cliente por id; retornar o número de clientes cadastrados; retornar clientes nascidos após 2000; remover clientes nascidos antes de 1990. Instanciar um objeto `Academia` (começa sem clientes), cadastrar, remover e mostrar a quantidade de clientes.
- [ ] **Exercício — VeiculoInteligente + Aerospace + Motorpower + Administracao:** Criar a classe `VeiculoInteligente` com velocidade atual (km/h), nível atual de combustível (litros) e nível máximo de combustível. Todo veículo começa parado e com o tanque cheio. Método `partida()` (inicia a 10 km/h) e `parada()`. Criar as classes `Aerospace` (indicador de bagageiro) e `Motorpower` (indicador de SUV). Método `controlarVelocidade()`: para `Aerospace`, se compacto e em área urbana → +50%; senão → -5%. Para `Motorpower`, se não SUV, velocidade < 25 km/h ou não em área urbana → +100%; senão permanece igual. Método `abastecer()`: `Aerospace` completa o tanque se combustível < 20L; `Motorpower` completa se < 10L. Criar a classe `Administracao` com lista de veículos inteligentes. Métodos: adicionar veículo; remover veículo (use `equals`); retornar veículos com velocidade maior que um valor; remover veículos parados.

---

#### Aula: Exceções
> `try`, `catch`, `finally`; tipos de exceção (`ArithmeticException`, `ArrayIndexOutOfBoundsException`, etc.).
- [ ] Estudo de erros de compilação vs. erros de execução.
- [ ] Prática com blocos `try/catch` e `try/catch/finally`.

---

#### Aula: Arquivos
> Leitura e escrita de arquivos.
- [ ] **Exercício — Escrita (Eleicao):** Implementar a classe `Eleitor` com CPF, ano de nascimento e candidato votado (1, 2 ou 3); construtor, gets, sets e `toString()`. Criar a classe principal `Escrita`: declarar lista de eleitores (inicialmente vazia); receber eleitores (parar quando o voto for diferente de 1, 2 ou 3); salvar os dados no arquivo `"eleicao.txt"` usando `toString()`.
- [ ] **Exercício — Leitura (Eleicao):** Criar a classe principal `Leitura`: declarar lista de eleitores; ler os eleitores do arquivo `"eleicao.txt"` e mostrar quantos eleitores foram recebidos.

---

## 🏆 Desafios

- [ ] **Desafio 1 — Jogo da Velha:** Criar a classe `JogoDaVelha` com array bidimensional 3x3 e resultado final. Construtor inicializa o array vazio. Método `exibir()` para mostrar o tabuleiro. Método `realizarJogada()` recebe o identificador do jogador (1 ou 2) e a posição escolhida. Realizar jogadas na classe principal.
- [ ] **Desafio 2 — Batalha Naval:** Implementar o jogo batalha naval usando POO. Tabuleiro 10x10 para cada jogador. Navios: 4 submarinos (1×2), 3 contratorpedeiros (1×3), 2 navios tanque (1×4), 1 porta-aviões (1×5). Navios dispostos aleatoriamente sem sobreposição, podendo ser rotacionados. Dois jogadores se alternam escolhendo posições de ataque. Posições repetidas não são consideradas. Salvar posições de ataque em `"ataques1.txt"` e `"ataques2.txt"`. Salvar resultado em `"saida.txt"` (vencedor e número de ataques de cada um).
- [ ] **Desafio 3 — Carregamento de Contêiner:** Criar a classe `Objeto3D` para representar objetos tridimensionais. Criar as classes `Conteiner` e `Caixa` herdando de `Objeto3D`. Ler dados de entrada de um arquivo `.txt` (dimensões do contêiner e tipos de caixas com indicadores de rotação). Empacotar as caixas dentro do contêiner maximizando o aproveitamento do espaço (volume das caixas / volume do contêiner próximo de 1). Gerar arquivo `log.txt` com aproveitamento, dados de cada caixa e posição no contêiner.

---

## 📄 Lista de Exercícios de Herança — `Lista-de-Exercícios-Heranca.pdf`

- [ ] **Exercício 1 — Animal + Peixe + Cachorro:** Criar as classes `Animal` (nome, peso), `Peixe` (tipoHabitat) e `Cachorro` (raça) com herança, gets/sets encapsulados e `toString()` nas subclasses. `Peixe` exibe: nome, peso e tipoHabitat. `Cachorro` exibe: nome, peso e raça. Criar classe de teste.
- [ ] **Exercício 2 — Pessoa → Empregado → Gerente / Vendedor + Cliente:** Diagrama com hierarquia: `Pessoa` (nome, idade, sexo) → `Empregado` (salário, matrícula, `valorInss()` = salário × 11%) → `Gerente` (nomeGerencia) e `Vendedor` (valorVendas, qntVendas). Também `Pessoa` → `Cliente` (valorDivida, anoNascim). `toString()` em `Gerente`, `Vendedor` e `Cliente`. Criar classe de teste.
- [ ] **Exercício 3 — Pessoa + Fornecedor + Empregado + Administrador + Operario + Vendedor:**
  - Criar classe `Pessoa` com nome, endereço, telefone (encapsulada).
  - Criar subclasse `Fornecedor` com `valorCredito` e `valorDivida`; método `obterSaldo()` = valorCredito − valorDivida. Criar programa de teste.
  - Criar subclasse `Empregado` com `codigoSetor`, `salarioBase` e `imposto`; método `calcularSalario()`. Criar programa de teste.
  - Criar subclasse `Administrador` (herda de `Empregado`) com `ajudaDeCusto`; redefinir `calcularSalario()` (salário + ajudaDeCusto). Criar programa de teste.
  - Criar subclasse `Operario` (herda de `Empregado`) com `valorProducao` e `comissao`; redefinir `calcularSalario()` (salário + comissão sobre valorProducao). Criar programa de teste.
  - Criar subclasse `Vendedor` (herda de `Empregado`) com `valorVendas` e `comissao`; redefinir `calcularSalario()` (salário + comissão sobre valorVendas). Criar programa de teste.
- [ ] **Exercício 4 — Diagrama livre:** Criar você mesmo um diagrama de classes com herança diferente de todos os exemplos vistos e implementar no NetBeans.

---

## 📄 Exercícios de Classes Abstratas e Interface — `4 - Exercicio-Classes Abstratas-Interface.pdf`

- [ ] **Exercício 1 — ContaBancaria (abstrata) + ContaCorrente + ContaPoupanca:** Criar a classe abstrata `ContaBancaria` com número da conta e saldo; métodos abstratos `sacar(double)` e `depositar(double)`. Criar `ContaCorrente` com `taxaDeOperacao` (descontada em cada saque e depósito; saldo não pode ficar negativo). Criar `ContaPoupanca` com `limite` (saldo pode ficar negativo até o limite).
- [ ] **Exercício 2 — Interface Imprimivel:** Criar a interface `Imprimivel` com o método `mostrarDados()`.
- [ ] **Exercício 3 — Implementar interface em ContaCorrente e ContaPoupanca:** Fazer as duas classes implementarem `Imprimivel`; no método `mostrarDados()`, mostrar os atributos de cada conta.
- [ ] **Exercício 4 — Classe Relatorio:** Criar a classe `Relatorio` com o método `gerarRelatorio(Imprimivel)` que executa o `mostrarDados()` do objeto recebido.
- [ ] **Exercício 5 — Classe executável:** Instanciar uma `ContaCorrente` e uma `ContaPoupanca`; creditar valores; efetuar saque (na poupança, sacar mais que o saldo atual). Criar um objeto `Relatorio` e executar `gerarRelatorio()` para cada conta.
- [ ] **Exercício 6 — Método transferir:** Incrementar a classe `ContaBancaria` com o método `transferir(double valor, ContaBancaria destino)` usando os métodos `sacar()` e `depositar()`.
- [ ] **Exercício 7 — Classe Banco:** Criar a classe `Banco` com um `ArrayList` de contas bancárias. Implementar os métodos `inserir(ContaBancaria)`, `remover(ContaBancaria)` e `procurarConta(int numeroConta)` (retorna a conta ou `null`).
- [ ] **Exercício 8 — Banco implementa Imprimivel:** Fazer a classe `Banco` implementar `Imprimivel`; o método `mostrarDados()` deve executar `mostrarDados()` de cada conta.
- [ ] **Exercício 9 — Sistema bancário completo (com interface gráfica):** Criar uma classe executável que instancia um banco e oferece o seguinte menu:
  1. Criar conta (poupança ou corrente; inserir no banco);
  2. Selecionar conta (por número; submenu: depositar, sacar, transferir, gerar relatório, voltar);
  3. Remover conta (por número);
  4. Gerar relatório (dados de todas as contas);
  5. Finalizar.

  **Usar interface gráfica.**

---

*Repositório mantido por Matheus Porto — UNIFOR, Engenharia de Software.*
