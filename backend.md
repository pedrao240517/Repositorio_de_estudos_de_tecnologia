# Introdução ao desenvolvimento backend
---


###  Desenvolvimento backend 
fontes:
https://www.youtube.com/watch?v=XBu54nfzxAQ
https://www.youtube.com/watch?v=4r6WdaY3SOA

 Todo site é composto por duas partes: o front end e back end.

  O front end se preocupa com toda a parte visual do site, ou seja, sua apresentação, já o backend engloba toda e qualquer parte que os usuários não interagem.

1) O servidor recebe uma solicitação de um cliente na forma de URL

A URL tem todas as informações necessárias para processar a solcitação, o protocolo, domínio, caminho(patch) e string de consulta.

Ex de url: https://example.com/path?query=value

O protocolo da solicitação informa ao servidor se a solicitação está criptografada, HTTP é para solicitações padrão não criptografadas e HTTPS epara solicitações criptografadas. 

depois temos a hospedagem que é chamada também de domínio, onde serve apenas para dizer a internet para qual servidor enviar a resposta, cada servidor tem seu próprio domínio.

<img width="1341" height="369" alt="image" src="https://github.com/user-attachments/assets/36c41008-6973-40e2-9d53-ab2b7a12b76a" />

Ademais, podemos nos concentrar nas partes mais inportantes da URL o patch e a sting de consulta.

O patch informa ao servidor o que o cliente deseja e define qual seção do código no servidor deve ser executada para obter a resposta correta. Essencialmente o servidor é dividido em várias seções diferentes, cada uma correspondendo a um caminho 
específico
<img width="1520" height="754" alt="image" src="https://github.com/user-attachments/assets/cf9693b6-e0b4-4036-bbac-ac16dccbd6ad" />
Por fim a string de consulta (query string ) é usada pela seção específica escolhida do servidor para alterar a resposta, a string de consulta é dividada em parãmetros de consulta específicos que pode aprimorar a forma como o servidor responde a uma solicitação para um caminho específico. Por exemplo, o youtube usa o mesmo caminho quando você pesquisa um vídeo, mas a string de consulta contém um parãmetro de pesquisa que informa ao servidor o que você pesquisou para que ele possa responder com o que você deseja.
<img width="1884" height="913" alt="image" src="https://github.com/user-attachments/assets/6caf027b-4c10-4960-9eb5-cf250072ab1d" />

Por fim, a URL sozinha não é suficiente para dizer ao servidor o que fazer exatamente, a seção selecionada pelo patch e o parâmetro colocado pela sting de consulta ainda é dividida ainda mais em várias partes diferentes. Para determinar qual parte dessa seção o servidor deve selecionar, ele deve realizar uma ação que é passada junto com a URL.  Essa a ação pode ser GET, POST, PUT, DELETE, combinando a ação e o caminho, o servidor pode encontrar a parte correta da seção que precisa executar. Geralmente a resposta do servidor será uma página HTML gerda dinamicamente com base na solicitação do cliente.
<img width="1304" height="701" alt="image" src="https://github.com/user-attachments/assets/fe39b3b4-dc6b-49f7-93d4-ace319758092" />

Outro ponto a observar sobre um servidor é que ele só é acessível ao mundo externo por meio das seções, isso significa que você pode armazenar qualquer informação confidencial no servidor e ela estará segura desde que não seja exposto o caminho específico, por isso, é relevate ter um banco de dados e um site rodando ao mesmo tempo, já que o servidor escolhe expor apenas o site e não o banco de dados. Essencialmente o servidor atua como uma barreira entre o mundo externo e todas as parte de um servidor. Mas no entanto o que é um servidor?

2) o Que é um servidor ?

Pra entender o que é um servidor é necessário mostraro processo de forma simpleficada.

<img width="1307" height="612" alt="image" src="https://github.com/user-attachments/assets/f3c43c76-ab47-4d40-bca2-523fd3843f5b" />

Quando uma ação é feita pelo cliente, como confirmar o pedido, temos uma requisição (cliente e aquele que acessa a aplicação, também chamdado de usuário), essa requisição é envidada pela internet da maneira que explicamos anteriomente e é devolvida pelo servidor do site/aplicação que enviamos, no caso esse servidor nada mais é que um computador que faz essa conexão. 

Entretanto, esses computadores não entendem essa mensagem de maneira simples, pra isso precisamos de uma linguagem de programação backend.

3) Lingugens back end

Quase toda linguagem de programação backend tem um recurso pra transformar um computador em um cliente e permite que ele receba mensagens.

<img width="1193" height="600" alt="image" src="https://github.com/user-attachments/assets/448fe53f-6ea8-4398-a4a9-42008944ae97" />

Exemplos: 
java Script (Com NodeJS), Python, Ruby e Java.

Entretanto, usar uma linguagem backend apenas é muito difícil e requer muito código.  Para ajudar, utilizamos duas ferramentas, um framework de backend e um gerenciador de pacotes.

Um framework nos ajuda a criar um servidor mais facilmente e com menos código, cada linguagem utiliza seu próprio framework para a constução do servidor.

Exemplos:
Express em javascript, django em python,  ruby on rains em ruby e spring em java. 

Na parte interna do sitema também utilizamos muitos códigos criados por outras pessoas, o qual chamamos de pacotes, e para gerenciar vários pacotes, utlizamos o que chamamos de gerenciador de pacotes, assim como os framework, cada linguagem tem seu próprio gerenciador de pacotes.

Exemplos:
NPM -Javascript
PIP - Python
Bundler - Ruby
Maven - Java 

<img width="1339" height="441" alt="image" src="https://github.com/user-attachments/assets/f4645cf8-0646-485c-991e-13543f65a296" />

4) Onde salvar os dados do nosso site? (O banco de dados)

É um lugar pra armazenar e gerenciar informações, ele nada mais é que um software que geralmente roda em um computador diferente, e precisamos fazer algumas configurações para que nosso sistema possa se comunicar com o banco de dados.

<img width="1284" height="501" alt="image" src="https://github.com/user-attachments/assets/1af3e1e9-6ebd-44d9-8712-3697dfcdcb13" />

O bancos de dados mais populares são MySQL, PosrgreSQL e Mongo DB.

Esse é geralmente o básico pra uma aplicaçõa web 
<img width="1262" height="398" alt="image" src="https://github.com/user-attachments/assets/d4bba3ce-a156-464a-a810-fdd544c164ca" />

sendo o que o cliente pede chamado de requisção (request) e o que o servidor manda de resposta (response) -> request-responde cycle

5) O que acontece em um requição?
de maneira simples a seção de trabalho dessa requição vai ser definidadas no backend após receber a o comando pela URL, durante a definição vamos definir a lista de toso os diferentes tipos de requisções que o backend permite nessa seção, isso é o que chamamos de API (Application Programming Interface)- Interface de programação de aplicativos. Se você enviar uma solicitação que não seja permitidade pela API, o servidor responderá com erro.

Na URL patch temos uma convenção de nomeclatura para nossas solicitações, essa convenção é chamada de transferência de estados represntacional - REST
<img width="1125" height="650" alt="image" src="https://github.com/user-attachments/assets/62268b73-5579-461a-a3b0-ebbe5f934b6d" />

Quando uma API usa essa nomeclatura é chamada de REST API, REST é a convenção mais comun que usamos em API, mais podemos usar outras, uma delas se chama GraphQL e outra RPC (remote procedure call)

6) Infraestrutura

  Invés de usarem seus próprios computadores para usar de servidores e banco de dados, as empresas alugam computadores de outras empresas, o que chamamos de computação em nuvem (ex: AWS, GCP, AZURE). Essa ideia também é conhecida como IAS (infraestrura como serviço) - Infraestructure as a service. No caso, detro desses computadores, tem "outros computadores" que chamamos de máquinas virtuais -virtual machines
<img width="1130" height="626" alt="image" src="https://github.com/user-attachments/assets/e1fb7f63-90a0-4169-a947-07d79c986222" />

E o que acontece se o tráfico aumentar no nosso site?, nesse caso podemos alugar mais VMs e configurar um balenceador de carga que distribuira as solicitações de forma uniforme entre as máquinas.

<img width="1328" height="699" alt="image" src="https://github.com/user-attachments/assets/31713d01-bd5e-4587-b212-db08fede0a71" />

Mais ainda temos outro problema, agora temos muitas máquinas virtuais que precisamos criar e configurar e isso exige muito esforço.  Para isso, as plataformas de computação em nuvem oferecem outro serviço chamado PA(plataforma de acesso), que mandamos nosso código back end e ele configura tudo pra nos, exemplos de paas temos os Elastic Benastalk, App Engine e app service.

7)Microserviços
A ideia e gerencias ações como receber email, pagar comprar e devolver email em um sistema próprio ao inves de criar um sistema pra tudo, evitando assim sobrecarga. Além disso, cada microserviço pode usar sua própria linguagem e seu próprio banco de dados.

Existe no mundo várias empresas oferecendo esses microserviços para implantarmos em nossas aplicações, esses microserviços vendidos são chamados de saas (software como serviço) - software as a service

<img width="1344" height="727" alt="image" src="https://github.com/user-attachments/assets/81f5a139-777f-4c37-b354-9e6375651b87" />

- Fundamentos das infraestrutura como serviço
  
  <img width="1053" height="552" alt="image" src="https://github.com/user-attachments/assets/0192b480-f740-402c-ac89-0ecf80f0b0af" />





  

















