# Social Post Manager

Sistema desenvolvido em **Java** para simular o gerenciamento de publicações em uma plataforma de mídia social, permitindo armazenar informações de posts, registrar curtidas, controlar comentários e exibir os dados das publicações com data e hora formatadas.

O projeto foi desenvolvido com foco na aplicação prática dos fundamentos de **Programação Orientada a Objetos (POO)**, especialmente encapsulamento, composição entre objetos e utilização de coleções.

---

## 🎯 Objetivo

O objetivo do projeto é representar, de forma simplificada, a estrutura de uma publicação de uma rede social.

Cada publicação possui informações como:

* Título;
* Conteúdo;
* Quantidade de curtidas;
* Data e hora da publicação;
* Lista de comentários.

Além disso, cada publicação pode receber novos comentários ou ter comentários existentes removidos.

A implementação busca representar uma relação semelhante à encontrada em plataformas de mídia social, onde uma publicação possui diversos comentários associados a ela.

---

## ✨ Funcionalidades

### 📌 Gerenciamento de publicações

Cada `Post` possui:

* Título da publicação;
* Quantidade de curtidas;
* Conteúdo textual;
* Data e hora de criação;
* Lista de comentários associados.

### 💬 Gerenciamento de comentários

O sistema permite:

* Adicionar comentários a uma publicação;
* Remover comentários;
* Consultar os comentários associados ao post;
* Exibir os comentários durante a apresentação da publicação.

### 🕒 Formatação de data e hora

As datas das publicações são apresentadas no formato:

```text
dd/MM/yyyy HH:mm:ss
```

Exemplo:

```text
28/08/2026 07:30:15
```

Isso permite representar de maneira mais próxima a informação de data e horário normalmente apresentada em redes sociais.

---

## 🏗️ Estrutura do projeto

A principal entidade implementada é a classe `Post`.

```text
src/
└── entities/
    └── Post.java
```

A classe `Post` é responsável por representar uma publicação e manter seus respectivos comentários.

---

## 🧱 Conceitos de Java aplicados

O projeto utiliza diversos conceitos fundamentais da linguagem Java e de Programação Orientada a Objetos.

### Encapsulamento

Os atributos da classe `Post` possuem acesso privado:

```java
private String title;
private Integer likes;
private String content;
private Date moment;
```

O acesso aos dados é realizado através de métodos `getters` e `setters`, mantendo os atributos protegidos de acesso direto externo.

### Composição

Uma publicação possui uma coleção de comentários:

```java
private List<Comment> comments = new ArrayList<>();
```

Essa estrutura representa uma relação entre `Post` e `Comment`, na qual um post pode possuir múltiplos comentários.

### Collections

O projeto utiliza a interface `List` juntamente com `ArrayList` para armazenar os comentários:

```java
private List<Comment> comments = new ArrayList<>();
```

Isso permite adicionar e remover comentários dinamicamente durante a execução.

### Manipulação de objetos

A classe possui métodos específicos para controlar a associação dos comentários:

```java
public void addComment(Comment comment) {
    comments.add(comment);
}

public void removeComment(Comment comment) {
    comments.remove(comment);
}
```

Essa abordagem centraliza na própria entidade `Post` as operações relacionadas aos seus comentários.

### Sobrescrita de `toString()`

O método `toString()` foi sobrescrito para criar uma representação textual completa da publicação.

Ele reúne:

* Título;
* Curtidas;
* Data e hora;
* Conteúdo;
* Comentários.

Isso permite apresentar o estado do objeto de maneira organizada no console.

---

## 🛠️ Tecnologias utilizadas

* **Java**
* **Java Collections Framework**
* `ArrayList`
* `List`
* `Date`
* `SimpleDateFormat`
* `StringBuilder`

---

## 📋 Exemplo de representação

Uma publicação pode ser apresentada da seguinte maneira:

```text
Minha primeira publicação
150 Likes - 28/08/2026 07:30:15
Aprendendo Java e Programação Orientada a Objetos!

Comment:
João comentou:
Ótimo conteúdo!

Maria comentou:
Continue estudando!
```

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/social-post-manager.git
```

### 2. Abra o projeto

Abra o projeto em uma IDE compatível com Java, como:

* IntelliJ IDEA;
* Eclipse;
* Visual Studio Code;
* Apache NetBeans.

### 3. Compile e execute

Execute a classe principal (`Main`), responsável por criar e manipular as publicações.

> **Observação:** a classe `Main` e a implementação de `Comment` devem estar presentes no projeto para que o sistema seja executado completamente.

---

## 📚 Contexto acadêmico

Este projeto foi desenvolvido como parte dos estudos de **Java e Programação Orientada a Objetos**, com o objetivo de consolidar conceitos fundamentais da linguagem por meio da construção de uma aplicação baseada em um cenário do mundo real.

O domínio de uma publicação em rede social foi utilizado para praticar a criação de entidades, relacionamento entre objetos e manipulação de coleções.

---

## 🚀 Possíveis melhorias

Como evolução do projeto, algumas funcionalidades poderiam ser implementadas:

* Sistema de usuários;
* Curtidas individuais por usuário;
* Cadastro e autenticação de usuários;
* Edição de publicações;
* Exclusão de publicações;
* Edição e exclusão de comentários;
* Persistência dos dados em banco de dados;
* API REST utilizando Spring Boot;
* Interface gráfica ou aplicação web;
* Sistema de seguidores;
* Feed de publicações;
* Paginação de posts e comentários.

Essas melhorias permitiriam transformar a implementação atual em uma aplicação de mídia social mais completa.

---

## 👨‍💻 Aprendizados

O desenvolvimento deste projeto contribuiu para a prática de:

* Programação Orientada a Objetos;
* Encapsulamento;
* Composição entre classes;
* Collections em Java;
* Manipulação de listas;
* Criação e gerenciamento de objetos;
* Formatação de datas;
* Sobrescrita de métodos;
* Organização de entidades em pacotes.

---

## 📌 Status

**Concluído — projeto acadêmico de estudos em Java.**

O projeto pode receber novas funcionalidades futuramente como forma de evolução dos conhecimentos em desenvolvimento Java.
