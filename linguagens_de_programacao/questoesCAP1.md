### **1. Por que é útil para um programador ter alguma experiência no projeto de linguagens, mesmo que ele nunca projete uma linguagem de programação?**

R: Pois entender como foi a construção da linagugem ajuda a ter clareza de ideias e melhor entendimento ao todo sobre as linguagens 
facilitando seu uso e aprendizado.

### **2. Como o conhecimento de linguagens de programação pode beneficiar toda a
comunidade da computação?**

R: Facilita a criação de novas linguagens e melhores sugestões de mudanças na linguagem, pois os programadores terão
um entendimento mais macro sobre toda a ferramenta.

**3. Que linguagem de programação tem dominado a computação científica nos últimos 50 anos?**

R: FORTRAN

**4. Que linguagem de programação tem dominado as aplicações de negócios nos
   últimos 50 anos?**

R: COBOL

**5. Que linguagem de programação tem dominado a Inteligência Artificial nos últimos 50 anos?**

R:LISP

**6. Em que linguagem o UNIX é escrito?**

R: C

**7. Qual é a desvantagem de ter muitas características em uma linguagem?**

R: Falta de qualidade acentuada em um determinado aspecto.

**8. Como a sobrecarga de operador definida pelo usuário pode prejudicar a legibilidade de um programa ?**

R: Ter muita facilidade de escrita pode causar problemas de leitura e conseguentemente sua legibilidade, por exemplo, criar 
comandos personalizados pra operadores comuns pode atrapalhar quem for ler o código.

**9. Cite um exemplo da falta de ortogonalidade no projeto da linguagem C**

R:A ortogonalidade em uma linguagem de programação significa que um pequeno conjunto de primitivas pode ser combinado de forma consistente, sem exceções estranhas ou restrições arbitrárias.
Em C, você pode passar variáveis de tipos básicos (como int ou float) como parâmetros para funções, e as funções também podem retornar esses tipos básicos. No entanto, embora você possa passar uma struct inteira como argumento para uma função, as funções em C tradicional não podem retornar uma struct diretamente (antigamente era preciso retornar um ponteiro para ela)

**10. Qual linguagem usou a ortogonalidade como um critério de projeto primário?**

R:ALGOL68


**11. Que sentença de controle primitiva é usada para construir sentenças de controle
    mais complicadas em linguagens que não as têm?**

R: : o comando de seleção (como o if) combinado com o GOTO (ou saltos incondicionais).

Historicamente, em linguagens mais antigas ou primitivas que não possuíam estruturas de repetição complexas prontas (como laços for ou while), os programadores usavam desvios condicionais junto com o GOTO para construir estruturas de controle e loops personalizados do zero.


**12. Que construção de uma linguagem de programação fornece abstração de processos?**

R: O subprograma( função, método ou procedimento)

**13. O que significa para um programa ser confiável?**

R: Atende às suas especificações sob todas as condições.

**14. Por que verificar os tipos dos parâmetros de um subprograma é importante?**

R: Para evitar erros  de execução

**15. O que são apelidos?(em linguagens de programação)**

R:A contecem quando duas ou mais variáveis diferentes acessam exatamente a mesma posição de memória.

**16. O que é o tratamento de exceções?**

R: O tratamento de exceções é um mecanismo de controle de fluxo da linguagem projetado para interceptar e lidar com erros em tempo de execução (ou outras condições anômalas) de forma elegante, sem que o programa simplesmente feche de repente ou quebre.

Pense nisso como um "plano de emergência":

O programa tenta executar um bloco de código arriscado (como tentar ler um arquivo que pode não existir).

Se der tudo certo, o programa continua normalmente.

Se acontecer um erro (uma exceção), o mecanismo desvia o fluxo para um bloco de tratamento (um "plano B"), permitindo que o programa avise o usuário, tente consertar o problema ou feche de forma segura, em vez de crashar.

**17. Por que a legibilidade é importante para a facilidade de escrita?**

R: Quanto mais legivel e claro o codigo ou seja(intuitivo), mais facil pro programador escrever ele.

**18. Como o custo de compiladores para uma linguagem está relacionado ao projeto
    dela?**

R: O custo da criação do compilador essa associado ao tempo de finalização da construção da linguagem , a execução do programa e outros fatores sobre a linguagem.

**19. Qual tem sido a influência mais forte no projeto de linguagens de programação
    nos últimos 50 anos?**

20. Qual é o nome da categoria de linguagens de programação cuja estrutura é ditada pela arquitetura de computadores de von Neumann?


**21. Que duas deficiências das linguagens de programação foram descobertas como
    um resultado da pesquisa em desenvolvimento de software dos anos 1970?**

R: Uso excessivo de goto

22. Quais são os três recursos fundamentais de uma linguagem orientada a objetos?

R: herança, polimorfismo e encapsulamento

23. Qual foi a primeira linguagem a oferecer suporte aos três recursos fundamentais
    da programação orientada a objetos?

R: Smalltalk

24. Dê um exemplo de dois critérios de projeto de linguagens que estão em conflito
    direto um com o outro.

R: facilidade de escrita e facilidade de leitura

25. Quais são os três métodos gerais de implementar uma linguagem de programação?

R: compiladores, interpretadores e implementação híbrida.

26. Qual produz uma execução de programas mais rápida, um compilador ou um
    interpretador puro?

R: compilador, poir trazuz o codigo inteiro de uma vez pra linguagem de máquina.

27. Que papel a tabela de símbolos tem em um compilador?

R:A tabela de símbolos funciona como um "dicionário" ou um registro que o compilador usa para guardar informações sobre os identificadores do programa (como nomes de variáveis, funções, classes, seus tipos, escopos e posições de memória).

Ela serve para o compilador conseguir verificar se uma variável foi declarada antes de ser usada, checar se os tipos de dados são compatíveis e saber onde alocar espaço na memória para cada coisa.


28. O que faz um ligador?

R: O ligador (ou linker, em inglês) é um programa responsável por juntar todos os arquivos de código-objeto gerados pelo compilador, além de bibliotecas externas (como funções prontas que a linguagem oferece), para formar um único arquivo executável pronto para rodar.

29. Por que o gargalo de von Neumann é importante?

R:O gargalo de von Neumann é extremamente importante porque ele representa o principal limite de velocidade para o desempenho dos computadores.

30. Quais são as vantagens de implementar uma linguagem com um interpretador
    puro?

R: maior facilidade de implementação da linguagem e economia de recursos.

## Conjunto de problemas 

1. Você acredita que nossa capacidade de abstração é influenciada por nosso domínio de linguagens? Defenda sua opinião.

R: Sim, nossa capacidade de abstração é fortemente influenciada pelo domínio de linguagens. Quanto mais rica e expressiva é uma linguagem (seja natural ou de programação), mais ferramentas mentais ela nos dá para estruturar pensamentos complexos. Na programação, linguagens que oferecem recursos avançados de abstração — como funções, classes e herança — permitem que o programador resolva problemas focando na lógica de alto nível, sem se perder em detalhes mecânicos e repetitivos de baixo nível.

2. Cite alguns dos recursos de linguagens de programação específicas que você
conhece cujo objetivo seja um mistério para você.

R: Em linguagens mais modernas (como Python, Java ou C#), você simplesmente cria uma variável e guarda um valor nela. Mas em C, você pode criar uma variável que guarda o endereço de memória de outra variável, e até somar números a esse endereço (ponteiro++)

3. Que argumentos você pode dar a favor da ideia de uma única linguagem para
todos os domínios de programação?

R: A ausência de precisar aprender novas linguagens de computação.


4. Que argumentos você pode dar contra a ideia de uma única linguagem para
   todos os domínios de programação?

R: A generalização de funcionalidades causa a ausência de especificidade necessárias para determinados contextos, ex: quando
se trabalha com o gerrenciamento de recursos de hardware o java pode ser ruim pelo simples fato de ele gerenciar a mémoria automaticamente com o 
garbage colection.

5. Nomeie e explique outro critério pelo qual as linguagens podem ser julgadas
(além dos discutidos neste capítulo).

R: facilidade de aprendizado pra iniciantes na área da computação.

6. Que sentença comum das linguagens de programação, em sua opinião, é mais
prejudicial à legibilidade?

R:  a necessidade de muita escrita

7. Java usa um símbolo de fechamento de chaves para marcar o término de todas as
sentenças compostas. Quais são os argumentos a favor e contra essa decisão de
projeto?

R: Maior controle de escopo e escrita de algoritmos são a vantagem e a desvantagem 
menor falta de liberdade sobre a escrita e ncessidade de inserção desses simbolos para o compilamento.

8. Muitas linguagens distinguem entre letras minúsculas e maiúsculas em nomes
definidos pelo usuário. Quais são as vantagens e desvantagens dessa decisão de
projeto?

Vantagens:Flexibilidade e Padrões: Permite criar convenções de nomenclatura muito claras. Por exemplo, usar letras maiúsculas para classes (Cliente) e minúsculas para variáveis (cliente), o que ajuda na organização e leitura do código.

Desvantagens:  Erros sutis (Bugs): Se o programador digitar total com letra minúscula em uma linha e Total com maiúscula na linha seguinte sem perceber, a linguagem vai achar que são duas variáveis diferentes, gerando um erro difícil de achar.

9. Explique os diferentes aspectos do custo de uma linguagem de programação

R: Maior custo de hardware, de recursos(mémoria), compilação, deploy e etc.

10. Quais são os argumentos para escrever programas eficientes mesmo sabendo
que os sistemas de hardware são relativamente baratos?

R:  Para otimização do programa em qualquer sistemas de hardware, além de economizar
esses recursos em escala global ajudando o meio ambiente.

11. Descreva alguns trade-offs de projeto entre a eficiência e a segurança em alguma
linguagem que você conheça.

R: um grande exemplo disso é o próprio java onde ele foca em sistemas robustos e seguros
entretanto é que essa segurança e robustez reduzem a eficiência de execução, tornando o programa mais lento se comparado a linguagens como o C."

12. Quais recursos principais uma linguagem de programação perfeita deveria incluir, em sua opinião?

1- segurança acima de tudo
2- legibilidade alta 
3- alta portabilidade 
4- facilidade de aprendizado

13. A primeira linguagem de programação de alto nível que você aprendeu era implementada com um interpretador puro, um sistema de implementação híbrido
ou um compilador? (Você não necessariamente saberá isso sem pesquisar).

R: Híbrida


14. Como sentenças de declaração de tipos para variáveis simples afetam a legibilidade de uma linguagem, considerando que algumas não precisam de tais declarações?

R: A falta de declaração do tipo de variavel torna ela mais dificil de indentificar seu tipo sem ver o tipo de estrutura
onde ela é usado no algoritmo

15. Algumas linguagens de programação – por exemplo, Pascal – têm usado o ponto
e vírgula para separar sentenças, enquanto Java os utiliza para terminar sentenças. Qual desses usos, em sua opinião, é mais natural e menos provável de resultar em erros de sintaxe? Justifique sua resposta.


R: A maioria dos programadores e especialistas concorda que o uso como terminador (estilo Java) é mais natural e causa menos erros.

Por quê?
Porque no estilo terminador a regra é simples e mecânica: acabou a linha de comando, coloca ;. Você não precisa ficar pensando se aquele comando é o último de um bloco ou não. No estilo separador do Pascal, se você esquecer e colocar um ponto e vírgula no último comando por hábito, o compilador pode recusar e gerar um erro de sintaxe chato.


18. Muitas linguagens contemporâneas permitem dois tipos de comentários: um no
    qual os delimitadores são usados em ambas as extremidades (comentários de
    múltiplas linhas) e um no qual um delimitador marca apenas o início do comentário (comentário de uma linha). Discuta as vantagens e desvantagens de cada
    um dos tipos de acordo com nossos critérios.

R: o de uma linha é bom pra coisas simples e rapidas como titulos de funcionalidades enquanto o de multiplas linha
pra explicações mais detalhadas por exemplo um método que está sendo extendido de uma outra classes por herança e não por criação proprias





































