# HTML E CSS
## Repositório pra registro do curso de 5 módulos de HTML e CSS3 do curso em vídeo.
---
### O que vamos aprender? 

#### Módulo 1 - Primeiros passos (cap 1 a 12)
1) Evolução da internet
2) Como Surgiu?
3) Como a internet funciona?
4) Como Funciona os protocolos? 
5) O que é dominio e hospedagem e qual a diferençã?
6) Qual a diferença entre as linguagens HTML, CSS e  JS?
7) Qual a diferença de back end pra front end
8) Como Organizar o Ambiente de desenvolvimento
9) Como fazer a estrutura básica de HTML
10) Porque do posionamento de cada comando
11) Diferença de maiusculas pra minusculas
12) Como Trabalhar com textos 
13) Como colocar símbolos e emojis
14) Como organizar o contéudo de forma hierarquica
15) Vamos entender a semântica de HTML5
16) Aprender a usar links e ancoras
17) Aprender a trabalhar com multimia (vídeos,imagens e aúdios)
18) Como Aplicar estilos nas CSS 

#### Módulo 2 -  Cores (cap 13 a 17)
19) Psicologia das cores 
20) Harmonização de cores
21) Paleta de cores 
22) Tipografia (fontes)
23) Estudos das CSS 
24) variaveis em CSS
25) Modelo de caixas 
26) Criação de site do zero

### Módulo 3 - Do repositório ao site online  (cap 18 a 21)
27) Como hospedar seu site 
28) Configurações de CSS pra imagens de fundo
29) Criação de projeto de Cordel
30) Como trabalhar com tabelas 

### Módulo 4 - páginas web completas, funcionais e responsivas. (Cap 22 a 26)
31) Iframes 
32) Projeto Rede sociais
33) Formulários 
34) Design Responsivos 
35) Projeto tela de login responsiva

### Módulo 5  - Aprofundamento em  técnicas de CSS3 para criar páginas modernas e responsivas (novas tecnlogias )
36) Flexbox
37) Grid Layout
38) Projeto Final


---
- melhores livros pra aprender HTML e CSS
1) Material de apoio - curso em vídeo
2) Rerências on-line
MDN
W3C Standards
Whatwg Living Standard
W3Schools
4) Livros 
Serie O' Reilly 
HTML5 e CSS3 - Um guia prático e visual de html5 e css 3
HTLM e CSS - Projete e constua sites
HTML e CSS - Use a cabeça
Crie seu próprio site 
Fundamentos de HTML5 e CSS 3 - Moujour
HTML5: a Linguagem de Marcação que Revolucionou a Web - Moujour
CSS Grid Layout: Criando Layouts CSS Profissionais - Moujour
CSS3 - Moujour


---
## Módulo 1 - Primeiros passos 

1) Evolução da internet
2) Como Surgiu?
3) Como a internet funciona?

##### História da Internet

A internet surgiu durante a guerra fria, com a URSS lançando um sátelite espacial(Sputinick), para saber a órbita da terra, no entando, os EUA achavam que era algum tipo de sátelite espião. Nessa perspectiva, o governo dos Estados Unidos temia um ataque russo às bases militares. Um ataque poderia trazer a público informações sigilosas, tornando os EUA
vulneráveis. 

Então foi fundado uma agência pra estudos de tecnologias de guerra a DARPA - (Defense Advanced Research Projects Agency) é a agência do Departamento de Defesa dos EUA, com o intuito de proteger informações de um possível ataque.

Com isso, eles criaram uma rede de compartilhamento entres as bases militares a ARPANET. A ARPANET funcionava através de um sistema conhecido como chaveamento de pacotes, que é um sistema de transmissão de dados em rede de computadores no qual as informações são divididas em pequenos pacotes, que por sua vez contém:
• trecho dos dados
• o endereço do destinatário
• informações que permitiam a remontagem da mensagem original. 

Esses sistema, funcionava por meio de um protocolo chamado NCP - Network Control Protocol (protocolo de controle de rede) e de maneira simples tinha o obejtivo de vários computadores falarem a mesma linguagem.


Porém, o NCP tinha um problema de funcionar apenas uma comunicação por vez, ou seja, ao longo de uma transmisão, se outro conputadores quiserem se comunicar tem que esperar o fim da transmissão.

Pra acabar com isso dois pesquisadores criaram dois protocolos que depois foram juntados o TCP/IP 

Bob kahn -> TCP (Transfer control protocol) várias transmissoes 
Vint Cerf - IP (internetwork Protocol) - Indentificador de máquinas 

Com o tempo a ARPANET cresceu tanto que eles resolveram separar ela em três redes.

MILNET - MILITAR 
NFFNET - CIENTÍFICA
Comerciais

Essas redes queriam se conectar em inglês - Interconnect Networking que abreviando fica internetwoking que abreviando de novo fica internet.

##### Como funciona a internet?

1) O computador transfere a informação solicitada por meio de pacotes e enviado para o destinatario (O IP indenfica o destinatario e enviador e o tcp envia os pacotes depois de quebrar a mensagem )

###### O passo a passo da Infraestrura da internet

Primeiramente a internet e dividida em milhas, a primeira é ultima milha server pra tudo que fazemos para nos conectar ou receber informações.

O dispostivo manda os pacotes por meio de ondas de rádio que o receptor (o roteador), determinar se são 0 ou 1 por meio de uma frequência pré establecida (frequência da modulação). O roteador tem que transformar esses sinais em outras coisas para passar pelos cabos de transmisão até o IPS (provedores de internet)[responsável por achar a melhor rota pra informação]. 

Os IPS levam essas informações até os Hubs de Internet, nos hubs de internet e eles repassam pelos ips e devolvem ao destinatario, sempre buscando a rota mais curta. Mas e se essa mensagem sair da região de distribuição de internet dos IPS?

Nesse ponto chegamos as espinhas centrais da internet, por meio de cabos submarinos são interligado os litorais dos paises.



Ok, nesse ponto abrangimos, quase tudo sobre a infraestrutura da internet, mas você deve se perguntar, e aqueles que não tem IPS em suas regiões e não moram e regiões litorâneas? 


Para isso temos meios de trasnmissão de internet para todos como sátelites e balões atmosfericos que funcionam como cabos por meio de ondas de rádio e assim sendo usados como pontos de transmissão.

##### Como era a internet antigamente?


Por meio de um protocolo de navegação chamado gopher, era acessado as informações que o funcionário queria.

Em 1993 um inglês chamado Tim Berness-Lee criou um protocolo que foi incluido mais tarde no TCP/IP o HTTP (HyperText Transfer Protocol) e a linguagem HTML (HyperText Markup Language) e com isso mudou a internet pra uma World Wide Web (rede de alcançe mundial) pois permitia a facilitação do funcionamento da internet.

Outra coisa que foi criado pra internet funcionar foi um navegador (O Mosaic) 

No caso a World Wide Web e uma subrede da internet.














