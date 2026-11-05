algoritmo "contador marcador"
var
   C:inteiro
inicio
      C <- 30
      Escreval("Contador de 30 a 1")
      Escreval(C)
      Enquanto (C > 0) faca
               C <- C-1
               Escreval(C)
      se (C%4 = 0) entao
         Escreval("[ ",C,"  ]")
      fimse
      fimenquanto

fimalgoritmo