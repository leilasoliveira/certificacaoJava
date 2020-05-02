# certificacaoJava

## Execução de códigos empacotados

- Para executar código empacotado (package), fazer o seguinte:

- Compilar todas as classes que não dependem de ninguém primeiro e coloque numa pasta de classes (usando código fonte do cap07):

`javac -d classes Plant.java`

* O parâmetro `-d` define o diretório para onde o bytecode deve ser gerado.

- Depois compilar as demais classes que dependem do bytecode gerado:

`javac -d classes -cp classes\; MapleTree.java`
`javac -d classes -cp classes\; Tulip.java`
`javac -d classes -cp classes\; Rose.java`
`javac -d classes -cp classes\; Simulator.java`

* O parâmetro `-cp` define o classpath, ou seja, onde estão os arquivos bytecode que a classe a ser compilada depende para compilar.

- Depois, para executar a aplicação (ou seja, a classe que contém o método main), executar o seguinte código:

`java -cp classes com.ocajexam.tutorial.plants.Simulator`

* O parâmetro `-cp` define o classpath, ou seja, onde estão os arquivos bytecode que a classe a ser executada depende para rodar.

E voílá! :D
