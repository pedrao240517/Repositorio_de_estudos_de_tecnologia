algoritmo "apenas c - vetores"
var
   nome:caractere
   soc: vetor[1..4] de caractere
   c,tot:inteiro
inicio
      tot <- 0
      para C <- 1 ate 4 faca
             Escreva("Digite seu nome: ")
             Leia(nome)
             se (copia(maiusc(nome),1,1 )= "C") entao
                tot <- tot + 1
                soc[tot] <- nome
             fimse
      fimpara
      limpatela
      Escreval("  LISTAGEM FINAL ")
      para C <- 1 ate tot faca
           Escreval(soc[c])
      fimpara
      Escreva(" A quantidade de pessoas que começa com a letra C é ", tot)

fimalgoritmo