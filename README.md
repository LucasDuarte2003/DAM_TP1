# Assignment 1 — Hello Kotlin. Hello Android World!

Course: Desenvolvimento de Aplicações Móveis (DAM)
Student(s): Lucas Mendes Duarte
Date: 28/02/2026
Repository URL: https://github.com/LucasDuarte2003/DAM_TP1

---

## 1. Introduction

Este trabalho tem como objetivo introduzir os conceitos fundamentais da linguagem Kotlin. Os exercícios abrangem manipulação de arrays, desenvolvimento de uma calculadora em consola, geração de sequências e um sistema de gestão de biblioteca virtual com programação orientada a objetos.

## 2. System Overview

O projeto está dividido em quatro exercícios principais:
- **Exercício 1:** Criação de um array com os primeiros 50 quadrados perfeitos utilizando três abordagens diferentes.
- **Exercício 2:** Calculadora em consola com operações aritméticas, booleanas e bitwise.
- **Exercício 3:** Gerador de sequência de bounces de uma bola usando sequências Kotlin.
- **Exercício 6:** Sistema de gestão de biblioteca virtual usando programação orientada a objetos.

## 3. Architecture and Design

O projeto segue uma estrutura baseada em pacotes:
- `dam.exer_1` — array de quadrados perfeitos
- `dam.exer_2` — calculadora em consola
- `dam.exer_3` — sequência de bounces
- `dam.virtual_library` — sistema de biblioteca virtual

Cada exercício está isolado no seu próprio pacote para maior clareza e organização. A biblioteca virtual segue um design orientado a objetos com herança, encapsulamento e polimorfismo.

## 4. Implementation

### Exercício 1
Foram usadas três abordagens para criar um array com os primeiros 50 quadrados perfeitos:
- Construtor `IntArray` com um ciclo `for`
- Range com a função `map()`
- Construtor `Array` com uma lambda

### Exercício 2
Foi implementada uma calculadora em consola usando:
- Expressão `when` para tratamento das operações
- `try/catch` para tratamento de erros (divisão por zero, input inválido)
- String templates para output formatado
- Ciclo `while` para manter a calculadora ativa até o utilizador escrever "exit"

### Exercício 3
Foi gerada uma sequência de bounces de uma bola usando:
- `generateSequence` com ponto de partida em 100.0 metros
- `drop(1)` para ignorar a altura inicial
- `takeWhile` para parar quando a altura desce abaixo de 1 metro
- `take(15)` para limitar a 15 bounces

### Exercício 6 — Biblioteca Virtual
O sistema inclui:
- Classe abstrata `Book` com getter personalizado para a época de publicação e setter personalizado para as cópias disponíveis
- Subclasses `DigitalBook` e `PhysicalBook` com propriedades específicas
- Classe `Library` com métodos para adicionar, emprestar, devolver e pesquisar livros, e um companion object que regista o total de livros criados
- Data class `LibraryMember` que representa um membro da biblioteca

## 5. Testing and Validation

- **Exercício 1:** As três abordagens produzem resultados idênticos (1, 4, 9, ..., 2500).
- **Exercício 2:** Foram testadas todas as operações incluindo casos extremos (divisão por zero, input inválido, operação desconhecida).
- **Exercício 3:** Confirmados 9 bounces acima de 1 metro, a sequência para corretamente com `takeWhile`.
- **Exercício 6:** Foram testados o empréstimo, devolução, aviso de stock esgotado e pesquisa por autor, com o output a corresponder ao esperado pelo enunciado.

## 6. Usage Instructions

1. Clonar o repositório: `git clone https://github.com/LucasDuarte2003/DAM_TP1.git`
2. Abrir o projeto no IntelliJ IDEA
3. Correr cada exercício abrindo o ficheiro correspondente e clicando no botão play

---
*As secções 7 a 11 não se aplicam a este repositório pois nenhum exercício era [AC OK, AI OK].*

# Development Process

## 12. Version Control and Commit History

O Git foi usado ao longo do projeto com commits feitos após a conclusão de cada exercício. O repositório está disponível no GitHub em https://github.com/LucasDuarte2003/DAM_TP1.

## 13. Difficulties and Lessons Learned

- **Exercício 3:** O uso de `filter` numa sequência infinita causou um ciclo infinito. A solução foi usar `takeWhile`, que para a sequência assim que a condição deixa de ser verdadeira.
- **Exercício 2:** Compreender os operadores bitwise (`shl`, `shr`) exigiu estudar a representação binária dos números e inicialmente foi usada uma calculadora online para validar os resultados.
- **Setup Android:** Foi necessário mudar para um PC mais potente porque o meu portatil não tinha capacidade suficiente para correr o simulador Android.

## 14. Future Improvements

- O Exercício 2 poderia ser estendido para suportar números decimais.
- A Biblioteca Virtual poderia incluir um sistema de armazenamento persistente, como uma base de dados.
- A calculadora poderia incluir um histórico das operações anteriores.

---

## 15. AI Usage Disclosure (Mandatory)

- **Ferramenta de IA utilizada:** Claude (claude.ai)
- **Como foi utilizada:** Exclusivamente para esclarecer dúvidas e ajudar na realização deste relatorio.
- **Responsabilidade:** Eu, Lucas Mendes Duarte (nº 50735), sou totalmente responsável por todo o conteúdo submetido.