algoritmo "tabuada"
var
   C, N, R:inteiro
inicio
      C <- 0
      Escreva("Quer ver tabuada de qual número? ")
      leia(N)
      Escreval("Contador númerico de 1 até 10")
      repita
      C <- C+1
      R <- C*N
      Escreval(N," X",C," = ",R)
      Ate (C = 10)
fimalgoritmo
