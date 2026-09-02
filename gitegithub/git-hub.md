# Primeiro repositório !
primeiro repositório versionado

Repositório feito durante curso de git e gitHub do - Gustavo guanabara.

link do curso:https://www.youtube.com/playlist?list=PLHz_AreHm4dm7ZULPAmadvNhH6vk9oNZA


Durante o Curso aprendi como utilizar o git,github,github desktop, é como editar o os arquivos em uma IDE.

---
# Aulas
1)O que é Git? O que é versionamento? – Curso de Git e GitHub

2)O que é GitHub? Pra que ele serve? – Curso de Git e GitHub

3)A Evolução do Git e GitHub – Curso de Git e GitHub

4)Instalações e configurações importantes – Curso de Git e GitHub

5)Criando o primeiro Repositório – Curso de Git e GitHub

6)Instalando GitHub Desktop no Linux – Curso de Git e GitHub

7)Clonando um Repositório – Curso de Git e GitHub

8)Versionando seus projetos antigos – Curso de Git e GitHub

9)Você sabe usar Issues? – Curso de Git e GitHub

10)Guia da Linguagem Markdown – Curso de Git e GitHub

11)Seu GitHub muito mais seguro – Curso de Git e GitHub

12)Git Branches de forma fácil e com exemplo – Curso de Git e GitHub

13)Hospedagem Grátis no GitHub Pages – Curso de Git e GitHub

esse curso foi pra facilitar meu início com git e github sem código, nas próximas linhas vamos explicar o aprendizado de git e github completo.

roteiro utilizado para guia:https://roadmap.sh/git-github


### Aprendendo o básico
https://www.boot.dev/lessons/65e6780d-fdde-447a-9898-b30b73793a3a

https://www.youtube.com/watch?v=rH3zE7VlIMs&list=PLw1W1TeNPmy5psU4VrWYVu3j1frw30m9I&index=1&t=409s

Curso de git usando comandos via termianl completo

Pra acessar o manual do git execute no terminal git help git 

1. q Sai do manual
2. j Uma linha abaixo
3. k Uma fila para cima
4. d Meia página abaixo
5. u Meia página acima
6. /<term>: Pesquisar por "termo" (ex /OPTIONS:)
7. n: Próximo termo de pesquisa
8. N Termo de pesquisa anterior

#### Objetivos 

- Entender o que é VCS

- Entender por que usar um sistema de controle de versão

- Entender a diferença do GIT pra outros vcs

-Instalar o Git localmente 



#### O que é VCS?

VCS é version control system ou sistema de controloe de versão é uma ferramenta de software que rastreia, organiza e gerencia alterações em arquivos e código-fonte ao longo do tempo.Ele funciona como uma "máquina do tempo" do projeto, permitindo visualizar estados anteriores, experimentar com segurança sem comprometer o projeto principal e reverter para versões anteriores caso ocorram erros.

Em vez de renomear os aquivos manualmente a cada atualização (feature), um vcs automatiza o processo criando snapshots(versões) do seu código fonte.


### O que é o Git?

O Git é um sistema de controle de distribuição distribuído que rastreia alterações em arquivos, usado principalmente no desenvolvimento de versão de software.

### O que é o GITHUB? 

O GitHub é uma plataforma online de hospedagem de código-fonte e arquivos que usa o sistema de controle da versão Git

### Tipos de VCS

centralizado/linear: Cada desenvolvedor baixa uma cópia completa do projeto, incluindo todo o seu histórico. Isso significa que você pode trabalhar offline e seus dados ficam altamente seguros contra falhas do servidor.

![alt text](../imagens/image-41.png)

distribuido: Todas as versões dos arquivos são hospedadas em um único servidor central. Os desenvolvedores baixam os arquivos de que precisam, fazem as alterações e os enviam diretamente para o servidor.

![alt text](../imagens/image-40.png)


### Termos de VCS

Repositório -  É o banco de dados (ou pasta) que armazena todo o histórico, arquivos e versões do seu projeto. Pode ser local (na sua máquina) ou remoto (hospedado na nuvem, como o GitHub) sendo  representado por .git.

Commit: É a "fotografia" do estado atual do seu projeto. Cada vez que você salva e registra suas alterações, você cria um commit. Ele recebe um código identificador único(marco histórico).

Estados de um arquivo: 

1. modified : qualquer alteração de arquivo
2. staging : preparar pra ser comitado (existe pra segurança de modificações)
3. commited : arquivos enviados


Branch (Ramificação/Galho): Uma ramificação independente do seu código. Permite que você crie novos recursos ou teste coisas novas sem alterar o código principal (a versão de produção). A ramificação principal padrão costuma se chamar main ou master

Merge (Mesclagem): O processo de unir as alterações feitas em uma branch de volta para outra (geralmente para a ramificação principal)

Push: Enviar os seus commits locais para um repositório remoto na internet.

Pull: Baixar as alterações mais recentes do repositório remoto para a sua máquina local e já aplicá-las ao seu projeto.

Clone: O ato de copiar um repositório remoto para a sua máquina local, baixando todos os arquivos e o histórico de commits.

Fork - Fazer a copia de um repositorio remoto de outra pessoa 

Fetch: Baixar as atualizações do repositório remoto, mas sem aplicá-las ou misturá-las com o seu código atual. Ele serve apenas para você visualizar o que a equipe alterou.

Conflict (Conflito): Ocorre quando duas pessoas alteram a mesma linha de um arquivo de formas diferentes e o sistema não consegue decidir qual versão manter. O conflito precisa ser resolvido manualmente.

As Issues (que significa "problemas" ou "questões") no GitHub funcionam como um gerenciador de tarefas e discussões.

- Um Pull Request (PR) no GitHub éuma proposta para mesclar alterações de código de uma ramificação em outra


### Partindo para o 

verificação de instalação/versão do git -> git --version

### Comandos de Porcelana e Encantamento

No Git, os comandos são divididos em comandos de alto nível ("de porcelana") e comandos de baixo nível ("de encanamento"). Os comandos de porcelana são aqueles que você usará com mais frequência como desenvolvedor para interagir com seu código. Alguns exemplos de comandos de porcelana são:
````
git status
git add
git commit
git push
git pull
git log
````

Alguns exemplos de comandos de encanamento são:

````
git apply
git commit-tree
git hash-object

````




