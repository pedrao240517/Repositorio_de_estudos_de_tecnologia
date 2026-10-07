algoritmo "CAMPEONATO DE FUTEBOL - COM VETORES"
var
   time: vetor[1..4] de caractere
   i, j: inteiro
inicio
   // Passo 1: Cadastro dos times
   para i <- 1 ate 4 faca
      escreva("Digite o nome do ", i, "o. time: ")
      leia(time[i])
   fimpara

   limpatela
   escreval("-----------------------")
   escreval("   TABELA DE JOGOS     ")
   escreval("-----------------------")

   // Passo 2: Gerar os confrontos
   // O laço 'i' representa o time da casa
   para i <- 1 ate 4 faca
      // O laço 'j' representa o visitante
      para j <- 1 ate 4 faca
         // Condição essencial: um time não pode jogar contra ele mesmo!
         se (i <> j) entao
            escreval(time[i]:15, " [ ] x [ ] ", time[j])
         fimse
      fimpara
   fimpara
fimalgoritmo