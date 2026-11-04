algoritmo "semnome"
var
    C, soma:inteiro
inicio
      C  <- 500
      soma <- 0
      Se (C = 500) entao
repita
         Escreval(C)
         soma <- soma + C
         C <- C -50
ate(C<0)
      fimse
      Escreval(" A soma dos números é igual a ",soma)


fimalgoritmo