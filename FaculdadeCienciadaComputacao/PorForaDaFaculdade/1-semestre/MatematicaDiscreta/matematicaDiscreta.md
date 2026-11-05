# Matemática Discreta

## Bibliografia 

Fundamentos Matemáticos para a Ciência da computação
Judith L. Gersting

https://www.youtube.com/watch?v=KGoSTh1sgyM&list=PL6mfjjCaO1WrEJ0JKRyXO3QjaPkJaSvAS

playlist de aulas

## CAP 1 - Lógica Formal

- Definição de lógica formal 

A lógica formal é o ramo da filosofia e da matemática que estuda a estrutura, a forma e a validade dos argumentos dedutivos, independentemente do conteúdo ou do significado real de suas proposições

## SEÇÃO 1.1 PROPOSIÇÕES, REPRESENTAÇÕES SIMBÓLICAS E TAUTOLOGIAS

**Uma proposição (ou declaração) é uma sentença que é falsa ou verdadeira.**

````
Considere as seguintes sentenças:

Dez é menor do que sete.
Cheyenne é a capital do estado americano de Wyoming.
Ela é muito talentosa.
Existem outras formas de vida em outros planetas no universo
````
A sentença (a) é uma proposição, já que é falsa. A sentença (b) é uma proposição, já que é verdadeira. A sentença (c) não é falsa
nem verdadeira, pois “ela” não está especificada; por isso, (c) não é uma proposição. A sentença (d) é uma proposição, já que é ou
falsa ou verdadeira; nós não precisamos ser capazes de decidir qual das alternativas é válida.

setença/decalração = uma afirmação

preposição = setença que pode ser falsa ou verdadeira


### Conectivos e Valores Lógicos

Na lógica temos conectivos e valores lógicos sendo esse componentes essenciais
em uma construção de setença.

#### Conectivos Binários

**Letras de Preposição**: Letras maiscúlas no incio das frases pra indicar a preposição, (A),(B),(C).

**Conectivo Lógico E**: Repreentado por E ou o símbolo lógico  ∧

**Conectivo Lógio Ou**: Representado por OU  ou o símbolo lógico V

**Conjunção:** A expressão A ∧ B é chamada a conjunção de A e B; A e B são denominados **os elementos, ou fatores**, dessa expressão.

**Disjunção:** A expressão A ∨ B (leia “A ou B”) é a disjunção de A e B; A e B são os elementos,
ou fatores, da disjunção.

#### _tabela verdade E e OU_

![img.png](img.png)

**Condicional:** Proposições podem ser combinadas na forma “se proposição 1, então proposição 2”. Se A denotar a proposição 1 e B a 2, a proposição composta
é denotada por A → B (leia “A condiciona B”). O conectivo lógico aqui é o condicional e significa que a verdade de A implica, ou leva a, a verdade
de B. No condicional A → B, **A é a proposição antecedente e B, a consequente**

**Bicondicional** O conectivo bicondicional é simbolizado por ↔. Ao contrário da conjunção, da disjunção e do condicional, o conectivo bicondicional não é, de
fato, um conectivo fundamental, é um atalho conveniente. A expressão A ↔ B é uma abreviatura de ( A → B) ∧ (B → A). Podemos escrever a tabelaverdade para o bicondicional construindo, passo a passo, a tabela para (A → B) ∧ (B → A)

![img_1.png](img_1.png)

#### Conectivos Unitarios

**negação** é um conectivo lógico unário. A negação de A — simbolizada por A′ ou -A  — é lida como “não A” .

#### Resumo dos conectivos 

![img_2.png](img_2.png)


### Equações lógicas

Podemos encadear letras de proposição, conectivos e parênteses (ou colchetes) para formar novas expressões, como
(A → B) ∧ (B → A)


Uma cadeia que forma uma expressão válida é denominada uma **fórmula bem-formulada ou fbf**

Em uma fbf com diversos conectivos, o último a ser aplicado é o **conectivo principal.** Em

A ∧ (B → C)′
o conectivo principal é ∧. 

Em

(A ∨ B) ∧ C) → (B ∨ C′)

- quantidade de linhas em uma tabela-verdade

  O número total de  ramos no último nível é, então, igual a 2n sendo n = número de preposições ou seja se tiver 3 preposições
o número de linhas deve ser 2³ =  8 linhas de combinações.

![img_3.png](img_3.png)

- tautologias 

 **Tautologia**  É uma proposição ou fórmula composta que é sempre verdadeira em todas as simulações possíveis de valores (na tabela-verdade, a última coluna apresenta apenas "V" de verdadeiro).

 **Contradição** é um fbf cujo valor lógico é sempre falso

 **fbfs equivalentes**  são quando duas preposições compostas possuem exatamente a mesma tabela verdade


- Algumas tatuologias equivalentes 

obs: vale resalta a dualidade das equivalências ou seja Cada equivalência em um dos pares é a dual da outra.

**1) Comututividade** 

A ordem dos fatores não altera o resultado.

 A V B <->  B V A -> "A ou B" é o mesmo que "B ou A".

 A ^ B <->  B ^ A -> "A ou B" é o mesmo que "B ou A".

**2) Associatividade**

Quando temos várias operações iguais seguidas, a forma como agrupamos com parênteses não muda o resultado.

(A ∨ B) ∨ C ⇔ A ∨ (B ∨ C) 

(A ∧ B) ∧ C ⇔ A ∧ (B ∧ C)

**3) Distributividade**

Esta propriedade funciona de forma muito semelhante à matemática básica que já conhecemos (o chamado "chuveirinho"). Permite distribuir um operador que está do lado de fora por cima dos termos que estão dentro dos parênteses.

A ∨ (B ∧ C) ⇔ (A ∨ B) ∧ (A ∨ C)

A ∧ (B ∨ C) ⇔ (A ∧ B) ∨ (A ∧ C)

**4) Propriedades dos Elementos Neutros**

Estas regras demonstram o comportamento de uma proposição $A$ quando é combinada com valores lógicos fixos: $1$ (que representa o Verdadeiro) e $0'$ (que representa a negação do Falso, ou seja, também equivale ao Verdadeiro).

A ∨ 0′ ⇔ 1

A ∧ 1 ⇔ A 

**5)  Propriedades dos Complementares**

Estas regras estabelecem a relação direta entre uma proposição $A$ e a respetiva negação $A'$. Elas baseiam-se nos princípios fundamentais da lógica clássica (o princípio do terceiro excluído e o princípio da não-contradição).

A ∨ A′ ⇔ 1 (A expressão lê-se como "A ou a negação de A é equivalente a Verdadeiro (1))

Explicação detalhada: Esta regra baseia-se no princípio lógico do terceiro excluído. Numa situação real, uma proposição ou é verdadeira ou a sua negação é verdadeira; não existe uma terceira alternativa.

Exemplo prático: Imagine que A é a afirmação "A porta está aberta". O seu complementar ($A'$), portanto, é "A porta não está aberta". Se dissermos "A porta está aberta ou a porta não está aberta", esta frase cobre todas as hipóteses possíveis do universo. Independentemente de a porta estar aberta ou fechada, a afirmação conjunta é sempre uma certeza absoluta (uma tautologia), resultando sempre em Verdadeiro (1).  

**6) Leis de Morgan** 

`**A ∨ B)′ ↔ A′ ∧ B′  ((A negação do "E"))**`

O que diz: A negação de uma conjunção ("A e B") é equivalente à disjunção das negações ("não A ou não B").

A regra prática: Para negar um "E", você nega cada parte e troca o "E" por "OU".

Exemplo prático:Proposição original (A): "O carro é rápido e econômico".Negação correta (De Morgan): "O carro não é rápido ou não é econômico".

`**(A ∧ B)′ ↔ A′ ∨ B′ ((A negação do "OU"))**`

O que diz: A negação de uma disjunção ("A ou B") é equivalente à conjunção das negações ("não A e não B").

A regra prática: Para negar um "OU", você nega cada parte e troca o "OU" por "E".

Exemplo prático:

Proposição original: "A Ana estuda matemática ou física".

Negação correta (De Morgan): "A Ana não estuda matemática e não estuda física".

![img_4.png](img_4.png)


###  Conectivos Lógicos no Mundo Real

Os conectivos são usados no mundo real em debates lógicos, programas de computador e dispositivos elêtronicos 
com portas lógicas.

### Um algoritmo

Um algoritmo é um conjunto de instruções que podem ser executadas mecanicamente em um tempo finito de modo
a resolver algum problema.

formas de escrever um algoritimos temos: 

pseudocódigo - código escrito em sua linguá materna

código de máquina - código em 0 ou 1  e etc. 

## SEÇÃO 1.2 LÓGICA PROPOSICIONAL


