
# 🧾 Gerador de XML em Java / XML Generator in Java

📌 Projeto simples em Java que gera um XML formatado automaticamente a partir de objetos usando **reflection**.

📌 Simple Java project that generates formatted XML automatically from objects using **reflection**.

> 📚 **Este projeto foi desenvolvido como atividade prática do curso ISIFLIX.**  
> 📚 **This project was developed as a practical activity for the ISIFLIX course.**

<details>
<summary>🇧🇷 Versão em Português</summary>

## 🚀 Funcionalidades

- Geração automática de XML com base nas propriedades do objeto.
- Suporte a objetos aninhados (ex: `Cliente` com `Endereco`).
- Saída direta no console (pode ser adaptado para gerar arquivos).

## 📋 Exemplo de uso

```java
Cliente c = new Cliente();
c.setId(12332);
c.setNome("Vinicius");
// ...
System.out.println(XMLProcessor.generateXML(c));
```

## ⚙️ Requisitos

- Java 11 ou superior

</details>

<details>
<summary>🇺🇸 English Version</summary>

## 🚀 Features

- Automatically generates XML based on object fields.
- Supports nested objects (e.g., `Cliente` with `Endereco`).
- Outputs directly to the console (can be adapted to generate files).

## 📋 Example usage

```java
Cliente c = new Cliente();
c.setId(12332);
c.setNome("Vinicius");
// ...
System.out.println(XMLProcessor.generateXML(c));
```

## ⚙️ Requirements

- Java 11 or higher

</details>
