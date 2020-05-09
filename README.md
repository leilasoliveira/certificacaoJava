# certificacaoJava

Projeto com notas e código fonte dos estudos para a Certificação OCA Java SE Programmer I.

## Índice de notas de estudo

- **Capítulo 1 -** Empacotamento, compilação e interpretação de código Java
- **Capítulo 2 -** Programação com instruções Java
- **Capítulo 3 -** Programação com operadores e strings Java
- **Capítulo 4 -** Classes e variáveis básicas
- **Capítulo 5 -** Métodos e escopo de variáveis
- **Capítulo 6 -** Programação com arrays
- [**Capítulo 7 -** Herança de classes](notas/cap07)
- [**Capítulo 8 -** Polimorfismo e coerções](notas/cap08)
- [**Capítulo 9 -** Tratamento de exceções](notas/cap09)
- **Capítulo 10 -** Programação com a API de data e hora
- **Capítulo 11 -** Expressões lambda

## Execução de códigos empacotados

Para executar código empacotado (package), fazer o seguinte:

Compilar todas as classes que não dependem de ninguém primeiro e coloque numa pasta de classes (usando código fonte do [cap07](codigofonte/cap07)):

```java
javac -d classes Plant.java
```

* O parâmetro `-d` define o diretório para onde o bytecode deve ser gerado.

Depois compilar as demais classes que dependem do bytecode gerado:

```java
javac -d classes -cp classes\; MapleTree.java
javac -d classes -cp classes\; Tulip.java
javac -d classes -cp classes\; Rose.java
javac -d classes -cp classes\; Simulator.java
```


* O parâmetro `-cp` define o classpath, ou seja, onde estão os arquivos bytecode que a classe a ser compilada depende para compilar.

Depois, para executar a aplicação (ou seja, a classe que contém o método main), executar o seguinte código:

```java
java -cp classes com.ocajexam.tutorial.plants.Simulator
```

* O parâmetro `-cp` define o classpath, ou seja, onde estão os arquivos bytecode que a classe a ser executada depende para rodar.

E voílá! :smile:
