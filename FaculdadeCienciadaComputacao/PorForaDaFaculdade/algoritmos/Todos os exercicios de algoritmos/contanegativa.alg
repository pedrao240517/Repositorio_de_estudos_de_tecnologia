algoritmo "contanegativo"
var
    N,C, Neg:inteiro
inicio
      C <- 1
      Neg <- 0
      Repita
        Escreval("Digite um número: ")
        Leia(N)
        se (N < 0) entao
           Neg <- Neg +1
        fimse
        C <- C+1
      Ate(C >5)
      Escreva("Tem ",Neg," negativos")
fimalgoritmo
