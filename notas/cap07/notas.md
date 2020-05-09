# Capítulo 7 - Herança de Classes

Código fonte [aqui](../../codigofonte/cap07).

 - Herança de classes concretas e abstratas.

 - Herança de classes concretas, para métodos que são sobrescritos, não precisa da anotation @Override. Quando se herda de classe abstrata, aí sim, os métodos devem ser anotados com @Override.

 - Classe concreta: classe comum que pode ser instanciada.

 - Classe abstrata: não pode ser instanciada. Pode ou não ter métodos abstratos. Apenas classes concretas podem implementar métodos abstratos de classes abstratas.

 - Herança de apenas 1 classe.

 - @Override deve ser usado quando um método estiver sobrescrevendo. @Implements é quando um método de uma interface é implementado.

 - Classes podem implementar quantas interfaces forem necessárias, ou seja, N classes.

 - Uma interface pode ser considerada uma classe abstrata com todos os métodos abstratos, ou seja, uma interface te obriga a implementar todos os métodos declarados nela.

 - Uma classe abstrata não tem que implementar os métodos da interface, mas a classe concreta que está estendendo é responsável por implementar.

 - Classes que usarem a mesma interface terão os mesmos métodos Públicos.

 - Interfaces podem extender mais de 1 interface, ao contrário de outras classes.

 ## Encapsulamento

 - Armazenamento de dados junto com métodos que operam com eles.

 - Information hiding - ocultação de dados e métodos. Permite expor uma interface pública ao mesmo tempo que se oculta os detalhes da implementação.

 - Uma classe bem encapsulada tem uma finalizada clara e única. Essa classe só deve conter os métodos e variáveis necessários ao cumprimento de sua finalidade.

 ### Modificadores de acesso

 - Três modificadores de acesso: Private, protected e public, além do modificador padrão que não tem palavra chave, conhecido como package-private.

 * Private: mais restritivo, só permite que, qualquer variável ou método de instância que for marcado com private só poderá ser acessado por outros métodos da mesma classe.

 * Nível de acesso padrão, ou package-private: segundo mais restritivo; acesso por código de classes do mesmo pacote. Uma varíavel ou método é configurado com este nível de acesso a partir do momento que o modificador de acesso é omitido.

 * Protected: terceiro mais restritivo. Igual ao nível de acesso padrão, porém, adiciona a possibilidade de subclasses de fora do pacote acessarem seus métodos ou varíaveis de instância. Ou seja, os métodos que podem acessar esses dados devem estar no mesmo pacote (como no nível padrão) ou estar em uma subclasse da classe que contém os dados protegidos (ser filho (conceito de herança) da classe onde tem esses métodos).

 * Public: menos restritivo; não impõe restrições de acesso.

 ### Ocultação de informações

 - Conceito que visa a ocultar detalhes da implementação de uma classe, usando os modificadores de acesso.

 ### Expondo a funcionalidade do objeto

 - Uma vez que os detalhes da implementação estejam ocultos, é hora de expor a funcionalidade do objeto. Pra isso, se usa o modificador public.

 ## Getters e Setters

 - Conceito final da ocultação de informações e encapsulamento.

 - Um bom design é tornar todas as varíaveis privadas, porém classes externas podem precisar obter o valor de uma delas para determinar seu estado ou configurar o valor. Pra isso, se criam os getters e setters.
