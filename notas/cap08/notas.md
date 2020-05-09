# Capítulo 8 - Polimorfismo e coerções

Código fonte [aqui](codigofonte/cap08).

## Polimorfismo

- Polimorfismo, do grego, significa "muitas formas".

- Em Java, significa que um objeto pode assumir a forma ou o lugar de um objeto de tipo diferente.

- Polimorfismo pode existir quando uma classe herda outra ou implementa uma interface.

### Por herança de classes

- Exemplo: Classes Adulto e Criança herdam a classe Humano. Qualquer método que precisar de um objeto Humano, pode receber um objeto Adulto ou Criança e o Java não precisa saber de que se trata de um objeto Adulto ou Criança, desde que nesse método sejam utilizados métodos da classe Humano.

- Esse relacionamento é chamado de __é-um__, onde, usando o exemplo acima, Adulto __é-um__ Humano e Criança __é-um__ Humano.

- Esse relacionamento é unidirecional, logo o objeto mais específico pode assumir o lugar de um objeto geral, mas não vice-versa.

- Classes concretas e abstratas funcionam da mesma maneira com o polimorfismo.

### Por implementação de interfaces

- Funciona da mesma maneira da herança de classes.

### Em código

- Usando o seguinte exemplo: TipoC estende TipoB e TipoB estende TipoA. Então, se o TipoA ou TipoB for necessário, um objeto do tipo TipoC poderá ser usado.

```java
TipoA var1 = new TipoA();
TipoA var1 = new TipoB();
TipoA var1 = new TipoC();

TipoB var1 = new TipoB();
TipoB var1 = new TipoC();

TipoC var1 = new TipoB();

```

- Polimorfismo é mais usado em argumentos de métodos para que a implementação seja mais abstrata e, portanto, mais flexível.

**Ver depois, conceito de _design por contrato_ ou _programar para uma interface_**

## Coerção

- _Como transformar um objeto geral em um objeto mais específico?_

- Ex.: quando um primitivo `double` (geral) for usado como um `float` (específico).

```java
double detailedScore = 1.2;
float score = (float) detailedScore;
```

- Caso a conversão puder resultar na perda de precisão, os primitidos têm que ser submetidos a uma coerção.

- A precisão é perdida quando:
	- um primitivo **maior** sofre coerção para um primitivo **menor**;
	- um primitivo com um **decimal de ponto flutuante** sofre coerção para um tipo primitivo de número **inteiro**.
	
- Ordem de tamanho dos tipos primitivos: **byte**, **short**, **char**, **int**, **long**, **float**, **double**

### Coerção entre primitivos e objetos

```java
int i = 8;
Integer obj1 = new Integer(i); // não é coerção, mas é válido
Integer obj2 = (Integer) i; // coerção!!!
Integer obj3 = i; // não é coerção, mas faz uso do autoboxing e unboxing pra fazer a passagem entre primitivos e classe wrapper
Float obj4 = 5.7f;
Integer obj5 = obj4; // situação inválida, vai lançar exception em tempo de execução. Classe wrapper não trunca valor, só primitivo
```

Se temos as classes ClassA e ClassB e ClassB estende ClassA e executar o seguinte código:

```java
ClassA obj1 = new ClassB();
obj1.executarMetodoEspecialDaClasseB();
```

Se o método `executarMetodoEspecialDaClasseB` existir apenas na ClasseB, ocorrerá uma exceção em tempo de execução. Para que isso funcione, o código precisa mudar para:

```java
ClassA obj1 = new ClassB();
ClassB obj2 = (ClassB) obj1;
obj2.executarMetodoEspecialDaClasseB();
```

ou para

```java
ClassA obj1 = new ClassB();
((ClassB) obj1).executarMetodoEspecialDaClasseB(); // coerção inline
```

- O operador `instanceof` ajuda a ter certeza se aquele objeto tem o tipo apropriado para fazer uma coerção sem gerar exceção.