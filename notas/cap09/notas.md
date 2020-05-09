# Tratamento de Exceções

Código fonte [aqui](../../codigofonte/cap09).

`Exceptions` são usadas para tratar eventos que afetem o fluxo normal de execução do aplicativo.

### Vantagens

- Separação de código de tratamento de erros e o código principal, por meio de blocos `try-catch`;
- Possibilidade de propagação dos erros para cima da pilha de chamadas;
- Agrupamento de exceções semelhantes (via hierarquia de classes).

### Hierarquia de exceptions

- Uma exceção em Java é definida pela classe `Throwable`. As classes de exceção são a classe `Throwable` e suas subclasses.
- `Exception` e `Error` são subclasses de `Throwable`. `RuntimeException` é subclasse de `Exception`.
- `RuntimeException` e `Error`são exceptions não verificadas. Todas as demais são verificadas.

#### Exceções verificadas (checked)

- Examinadas em tempo de **compilação**.

#### Exceções não verificadas (unchecked)

- Examinadas em tempo de **execução**.
- São subclasses da classe `RuntimeException`.
- A maioria dessas exceções ocorrem devido a erros de programação.

#### Erros (não verificados)

- Condições extremas e normalmente fazem o aplicativo falhar.

Todos os tipos de exceções podem ser lançados!



Dica de estudo do livro: usar asserções ao invés do tratamento de exceções?

- Encontrei [esse](https://www.devmedia.com.br/assertivas-em-java/25835) artigo interessante que mostra o uso das asserções.

### Alterar o fluxo do programa

- Construir o bloco `catch` sempre pelas subclasses. Não é boa prática capturar as classes `Exception` e `RuntimeException`.
- A cláusula `finally` só não será executada se o aplicativo encerrar antes.

#### -try-with-resources

- Fecha recursos que precisam ser encerrados quando não forem mais necessários, desde que esses recursos implementem a interface `AutoCloseable`.
- Ou seja, ao invés de usar o bloco `finally` pra fechar um recurso, o fechamento estará implícito no recurso.

Ex.:

```java
public void demonstrateTryWithResources(){
    try(Scanner sc = new Scanner(System.in)){ // try-with-resources
        System.out.println("Number of apples: ");
        int apples = sc.nextInt();
        System.out.println("Number of oranges: ");
        int oranges = sc.nextInt();
        System.out.println("Pieces od Fruit: " + (apples + oranges));
    } catch (InputMismatchException ime) {
        ime.printStackTrace();
    }
    // sem bloco `finally`
}
```

### Reconhecer exceções comuns

- Como NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsExceptions, ClassCastException

#### Exceções verificadas comuns

- **CloneNotSupportedException** - lançado quando o método `clone` é chamado por um objeto que não pode ser clonado.
- **NoSuchMethodException** - lançado quando o método chamado não pode ser localizado.
- **FileNotFoundException** - lançado quando tenta abrir um arquivo que não foi encontrado.
- **InterruptedIOException** - lançado quando uma thread é interrompida.
- **ClassNotFoundException** - lançado quando a classe não pode ser carregada.
- **IOException** - lançado quando há falha na operação de entrada/saída de dados.
- **SQLException** - lançada quando ocorre erro no banco de dados ou instrução SQL.
- **FontFormatException** - lançada quando um formato de font é inválido (pacote _awt_).

#### Exceções não verificadas comuns

- **IllegalArgumentException** - lançado quando recebe um argumento inválido.
- **NumberFormatException** - lançado quando tenta converter uma string em um dos tipos numéricos com o formato incorreto.
- **ArrayIndexOutOfBoundsException** - lançado quando tenta acessar um array com um índice menor que zero ou, maior ou igual que o tamanho do array.
- **IndexOutOfBoundsException** - lançado quando um índice está fora do intervalo (em collections).
- **NullPointerException** - lançado quando tenta acessar algo de um objeto que está nulo (um método ou propriedade).
- **IllegalStateException** - lançado quando um método é chamado num momento inapropriado. Por exemplo, uma lista em que removeu um objeto e tenta-se remover novamente o mesmo objeto, é lançada esta exception.
- **ClassCastException** - lançado quando tenta converter um objeto para uma subclasse da qual ele não é instância.
- **ArithmeticException** - lançado quando uma condição aritmética excepcional acontece, por exemplo, divisão por zero.

#### Erros comuns

- **AssertionError** - lançado quando uma asserção falha.
- **ExceptionInInitializerError** - lançado quando uma exceção inesperada ocorre em um inicializador estático.
- **VirtualMachineError** - lançado quando ocorre um erro na JVM.
- **OutOfMemoryError** - lançado quando a coleta de lixo é executada, mas não consegue liberar espaço.
- **NoClassDefFoundError** - lançado quando a JVM não consegue encontrar uma definição de classe que foi encontrada em tempo de compilação.