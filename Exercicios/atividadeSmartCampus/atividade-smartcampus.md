# 🏫 Atividade: Sistema de Gestão SmartCampus

**Disciplina:** Programação Orientada a Objetos  
**Linguagem:** Java  

---

## 📋 Contexto

A universidade está modernizando sua infraestrutura tecnológica através do projeto **SmartCampus**. O objetivo é integrar a gestão de pessoas e o controle de segurança de dispositivos em um único ecossistema de software, utilizando os princípios da **Programação Orientada a Objetos**.

---

## 📌 Requisitos do Sistema

### 1. Gestão de Membros Acadêmicos

O sistema deve lidar com dois perfis principais: **Alunos** e **Professores**.

- Ambos possuem características em comum: `nome` e um número de `registro` institucional.
- A instituição **não permite** a existência de um "membro genérico" — apenas das categorias específicas.

Cada membro tem direito a um **Bônus para o Restaurante Universitário (RU)**, mas a regra de cálculo é diferente:

| Perfil | Regra do Bônus |
|---|---|
| Aluno | Recebe um **valor fixo** de bônus |
| Professor | O bônus é calculado com base em uma **porcentagem do salário base** |

---

### 2. Protocolo de Segurança (2FA)

Para garantir a integridade das operações, o sistema exige uma **Autenticação de Dois Fatores (2FA)**.

Este comportamento **não é exclusivo de pessoas**: além de Alunos e Professores, os **Tablets de Laboratório** também precisam realizar essa validação antes de acessar a rede.

> ⚠️ Um `Tablet` possui um `número de patrimônio`, mas **não é** um membro acadêmico. Entretanto, ele deve obrigatoriamente seguir o mesmo **contrato de autenticação** dos demais.

---

## ✅ O Que Deve Ser Implementado

1. **Modelagem de Classes**  
   Desenvolva a estrutura de classes respeitando os conceitos de **herança** e **abstração** para os membros acadêmicos.

2. **Contratos de Comportamento**  
   Utilize uma **interface** para padronizar o método de autenticação (`realizar2FA`) entre entidades de naturezas diferentes (humanos e dispositivos).

3. **Encapsulamento**  
   Garanta que os atributos estejam devidamente protegidos.

4. **Teste do Sistema**  
   Crie uma **classe principal** que instancie um `Aluno`, um `Professor` e um `Tablet`, demonstrando:
   - O cálculo dos bônus de cada membro acadêmico
   - O funcionamento dos diferentes métodos de autenticação de cada entidade

---

## 💡 Dica de Ouro

> *"Atenção à semântica: Um **Aluno** é um **Membro Acadêmico**, mas um **Tablet** não é. Contudo, todos eles podem ser **Autenticáveis**."*

---

## 📁 Estrutura Sugerida de Arquivos

```
smartcampus/
├── Autenticavel.java        # Interface
├── MembroAcademico.java     # Classe abstrata
├── Aluno.java
├── Professor.java
├── Tablet.java
└── Main.java                # Classe de teste
```

---

## 🗒️ Anotações e Progresso

- [ ] Criar a interface `Autenticavel`
- [ ] Criar a classe abstrata `MembroAcademico`
- [ ] Implementar `Aluno`
- [ ] Implementar `Professor`
- [ ] Implementar `Tablet`
- [ ] Criar a classe `Main` com os testes
