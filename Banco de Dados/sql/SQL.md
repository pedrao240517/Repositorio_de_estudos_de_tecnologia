# SQL - Structured Query Language

curso: https://www.youtube.com/playlist?list=PLhq-SSGmAY_0BPSjOvRD_pfCSPFd12Kpx

site do curso de exercicios:https://www.masterywithsql.com/all_exercises#chapter-3


### O que é o SQL?

SQL (Structured Query Language) é uma linguagem de programação usada para gerenciar e manipular dados armazenados em sistemas de gerenciamento de banco de dados relacionais (SGBDR). Ela permite recuperar, inserir, atualizar e excluir dados, bem como definir esquemas de banco de dados e controlar o acesso aos dados. O conhecimento básico de SQL é fundamental para interagir com praticamente qualquer banco de dados.
 
sql é considerada uma linguagem não processual ou declarativa
### O que é um banco de dados relacional ? 

Bancos de dados relacionais organizam os dados em tabelas, onde cada tabela representa um tipo específico de entidade (como clientes ou produtos). Essas tabelas são interligadas com base em relacionamentos entre os dados, frequentemente utilizando colunas compartilhadas chamadas chaves. Essa estrutura permite o armazenamento, a recuperação e o gerenciamento eficientes de grandes conjuntos de dados, garantindo a integridade e a consistência dos dados.

dado= tabela = entidade  (processo que faz isso se chama normalização)

relacionamento entre tabelas = chaves estrangeiras

indetificador da tabela  = chave primária

![img.png](img.png)



### O que é um Banco de Dados NoSQL (Não Relacional)?

Os bancos NoSQL (que significa "Not Only SQL" ou "Não Apenas SQL") foram criados para oferecer máxima flexibilidade no armazenamento de dados.

Eles não desativaram um esquema fixo de tabela antecipadamente. Isso significa que você pode armazenar dados de diferentes formatos e tamanhos juntos. Os modelos mais comuns de NoSQL incluem:

Documentos: Os dados são salvos em arquivos semelhantes a JSON (como no MongoDB ), ótimos para estruturas aninhadas e complexas.

Chave-Valor: Funciona como um dicionário ou lista telefônica, onde cada chave aponta para um valor específico (como o Redis ), ideais para cache e alta velocidade.

Colunas Largas: Organizam os dados em colunas em vez de linhas, excelentes para análise de Big Data (como o Cassandra ).

Grafos: Focam nos relacionamentos interpessoais, muito usados ​​em redes sociais ou sistemas de recomendação (como o Neo4j ).


![img_1.png](img_1.png)


O NoSQL foi criado exatamente para resolver dores de cabeça clássicas dos bancos de dados relacionais (SQL) quando o assunto é volume gigantesco de dados, velocidade e flexibilidade.

ex: mudanças de estuturas(nova tabela de rede social favorita por exemplo),esclabilidade cara, excesso de tabelas e joins deixando o sistema mais lento.

### Benefícios e limitações do SGBD relacional

Os Sistemas de Gerenciamento de Bancos de Dados Relacionais (SGBDR) organizam os dados em tabelas com linhas e colunas, estabelecendo relações entre essas tabelas por meio de chaves. Essa abordagem estruturada oferece benefícios como integridade de dados através de restrições e propriedades ACID (Atomicidade, Consistência, Isolamento e Durabilidade), garantindo transações confiáveis. No entanto, os SGBDR podem apresentar limitações quanto à escalabilidade, especialmente com conjuntos de dados massivos, e podem não ser a escolha ideal para lidar com dados não estruturados ou semiestruturados devido ao seu esquema rígido.

Atomicidade: A transação é indivisível; ou tudo é executado ou nada é aplicado

Consistência: A operação leva o banco de dados de um estado válido a outro estado válido.

Isolamento: Transações simultâneas ocorrem sem interferência mútua.

Durabilidade: Dados salvos persistem mesmo após falhas do sistema.

## Regras de normalização (uma pequena explicação)

1- cada linha/registro de uma tabela deve ser único - para cada linha deve ter uma coluna que identifique exclusivamente essa linha (primary key-> id: indentificador)

![img_2.png](img_2.png)

o id pode ser chamado de chaver substituta pois ele é artificial ou seja não é uma chave de uma coluna existente, mais sim de uma nova. 
pra declarar essa coluna colocamos nome da tabela e id, ex:fil_id







