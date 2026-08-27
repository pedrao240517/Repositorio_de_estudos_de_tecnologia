# Banco de Dados

- Fontes 

https://www.youtube.com/watch?v=pmAxIs5U1KI&list=PLxI8Can9yAHeHQr2McJ01e-ANyh3K0Lfq

Sistemas de Banco de Dados (Ramez Elmasri, Shamkant B. Navathe)

# 01 - Visão geral de banco de dados

Conceito: banco de Dados é uma coleção de dados.

### 1- O que é um dado?

Nesse contexto, um dado é um fato que deve ser armazenado(persistido) e que tem um significado implícito.
Ou seja, tem algum aspecto do mundo real que precisa ser modelada e um foco específico.

Esses dados tem uma estrutura lógica que confere um siginifcado aos dados(mini Mundo).



````
Pensa em um dado como uma informação importante que queremos guardar.

👦 Exemplo:

João tem 5 anos.

Isso é um fato sobre o mundo real que podemos guardar no computador.

A estrutura lógica é a forma de organizar esse dado para ele fazer sentido:

Nome → João
Idade → 5 anos

👉 Resumindo: dado é uma informação sobre algo real que guardamos de forma organizada para ter significado.
````
### 2- O que SGBD? 

Esse contexto que estamos trabalhando ficará armazenado e
gerenciado por um  **Sistema de gerenciamento do Banco de dados (Database Management System)**

Esse sistema é uma coleção de programas que permite que um usuario crie e mantenha um banco de dados.O SGBD  é um sistema de sftware de uso geral que facilita o prcesso de 
definição, construção, manipulação de dados entre diversos usuários e aplicações

Exemplos de SGBDS: 

  ![img_10.png](../imagens/img_10.png)

A definição ou informação descritiva que o banco organiza eses dados é chamado de **metadados**(dados sobre os dados).

Um programa de aplicação acessa o banco de dados ao enviar consultas ou solicitações de dados ao SGBD.A consulta geralmente é recuperação de dados e transação  e 
quando quando os dados são lidos e/ou gravados no banco de dados 

![img_14.png](../imagens/img_14.png)

- Estrutura de um sistema de Banco de dados.

  ![img_11.png](../imagens/img_11.png)

### 3- Vantagens do SGBDs

#### 3.1 Independência entre dados e programas 

As aplicações que não usam a sgpd incorporam as estruturas de dados e fazem o controle de acesso a esses dadps 

Porém, as aplicações com SGBD não precisam lidar com controle de acesso a dados
e o armazenamento.

#### 3.2 independência entre operações e programas 

Os SGBDs permitem que operações sobre os dados sejam definidas de maneira indepndente da aplicação.

#### 3.3 Controle de Redundância
Todos os dados são armazenados no mesmo lugar e todas as aplicações acessam a mesma instância desses dados.
(evita inconsistência de dados).

#### 3.4 Controle de dados
Controla quem acessa os dados.

#### 3.5 Persistência para programas e estruturas de dados (objetos)
Podemos implementar uma serie de dados sobre algum codigo de programação e gera algum resultado desses dados.

#### 3.5 - Eficiência no processamento de consultas
Permitem consultar funcionalidades sobre os dados de forma eficiente.

#### 3.6 - Backup e recuperação

Recuperação de dados em caso de problemas

#### 3.7 - Garantia de restrição de identidade

Os dados armazanados em um banco são associados a restrições(regras).

#### 3.8 - Outras regras

- garantia de padrões
- redução de desenvolvimentos de software
- flexibilidade e disponibilidade
- economia de escala

### 4- Abstração de Dados

pra usar as funcionalidades do SGBD é precso conhecer o modelo de dados(é a estrutura lógica ou conjunto de regras matemáticas e visuais que define como os dados são armazenados, organizados, manipulados e relacionados dentro do sistema
)

### 5 - Usuarios em um Banco de dados 

- Administradores de banco de dados: Responsaveis pelo modelo de dados
que serão usados.

- Projetista de banco de dados: Lidam com a projeção do banco de dados

- Analistas de sistemas/programadores: profissionais que irão se preucupar com a aplicação que será desenvolvida ao usuários finais.

- Usuários finais 

Os profissionais são quem fazem os módulos e intefaces dos SGBDS,
os que desenvolvem as funcionalidades e o analistas de suporte dos sgbds(lidam com as demandas necessárias a ser colocados no banco de dados).

### 6 - Modelagem de dados 

#### 6.1 Níveis de Modelagem de Dados

**Conceitual**:
O nível mais alto e abstrato; foca nos conceitos de negócio, entidades principais e relacionamentos, sem se preocupar com tecnologia ou SGBD (muito proximo da forma - mais simples de explicar)[especificação e pré requisitos].

**Lógico/Intermediário**: detalha os atributos, chaves primárias/estrangeiras e as regras de negócio estruturadas, mantendo independência da ferramenta final.

**Físico**: O mais técnico e próximo do sistema; define tipos de dados exatos, tabelas, índices e códigos de criação executados no banco de dados

#### 6.2 Componentes de Abstração de Banco de Dados

**Esquema(Schema)** connjuto de entidades que tem o mesmos atributos

![img_10.png](img_10.png)

**Instância (Instance)**: conjunto entidade com entidades individuais.

![img_11.png](img_11.png)

**Estado do Banco de Dados (Database State)**:É a imagem ou retrato completo de todas as informações contidas no banco em um instante particular no tempo.É sinônimo prático do conjunto atual de instâncias.Cada comando que modifica dados transforma o banco em um novo estado.O SGBD assegura que todo estado seja válido e obedeça às regras estabelecidas no esquema.


### 7- Linguagens 

A Linguagem de consulta SQL (Structured Query Language), pode ser divida em três partes.

DQL - Data Query language (linguagem de consulta de dados )

DDL - linguagem de definição de dados 

DML - Linguagem de manipulação de dados

![img_11.png](../imagens/img_11.png)

 - estrutura interna de um SGBD 

![img_13.png](../imagens/img_13.png)

## Modelo de Entidade- relacionamento (MER)

para constuir um banco de dados  é necessário
estabelecer a forma como os dados 
serão armazenadaos nesses banco 

Estabelecer a forma como os dados serão armazenados
implicam na construção de um modelo para organização dos dados : **uma modelagem
de dados**.

é um tipo de modelos de dados conceitual de alto nível, existe 
uma notação baseadas em diagrama para a construção de um MER o diagrama entidade - relaciomento ou  DER.


### elementos do diagrama ER 

entidades, atributo, chaves , relacionamentos e cardinalidades.

#### Entidade

1. entidade forte -  é um objeto básico usado para 
representar um coisa no mundo real, fisica ou conceitual com exsitencia independente.
2. entidade fraca - se a existência dó faz sentido quando está relacionada a outra entidade.

dica:  as entidades são frequentemente mencionada e suas propriedades descritas.

as entidades são representadas por retângulos e a do tipo fraco 
por borda dupla 
![img_8.png](img_8.png)

#### atributo 
é uma propriedade que descreve uma entidade sendo representado em elipses

![img_9.png](img_9.png)

##### tipos de atributos

1. simples x compostos

as simples tem apenas um atributo e as compostas
mais de uma  atributo pra ele (ex: nome pode ter  primeiro nome e sobrenome)


2. univalorados x multivalorados

um atributos multivalorado é aquele que pode ter varios valores  ex: localizações


3. armazendados x derivados

os derivados são aqueles que são calculdados com base de outros valores 

ex: idade é o calculo de data atual - data de nascimento


4. atributo chave 

tem o papel de designar o tipo de entidade.
ou seja o id - identificador, faz com que duas entidades do mesmo  conjunto tenham os mesmos valores.

![img_12.png](img_12.png)

a entidade fraca recebe o nome de **chave parcial*

#### Relacionamentos

relacionamento entre entidades. Represetado pro losangos

o grau de relacionamento é o  número de tipos entidade
participantes do relacionamento.

##### grau de relacionamento

1. binário - grau dois
2. ternario - grau três
3.n - ario  - grau n

dica: geralmente é ações que envolvem entidades (verbos)


#### relacionamento do tipo recursivo

ocorre quando o mesmo relacionamento assumim papeis
diferentes.

ex: um funcionario sempre é supervisionado e supervisor de alguem.

![img_14.png](img_14.png)

#### cardinalidades

explica numero maximo e minimos de instancias de ralacionamento entr entidades

tipos: 

1:1 
1:N
M:N

![img_13.png](img_13.png)

#### restrição de participação.

 se uma entidade precisa estar associada  a um relacionamento outra ou não.

Se sim é participação total, se não é parcial.

total é mostrado por linha dupla 

parcial é mostrado por linha unica

#### propriedades de relacionamento

um relacionamneto pode ter um atributo.

exemplo: trabalha  - pode ter horas 





































 
 

