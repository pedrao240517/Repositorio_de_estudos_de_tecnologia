algoritmo "semnome"
var
    C, soma:inteiro
inicio
      C  <- 0
      soma <- 0
      Se (C = 0) entao
repita
         C <- C +2
         soma <- soma + C
         Escreval(C)
ate(C=100)
      fimse
      Escreval(" A soma dos números é igual a ",soma)


fimalgoritmo