algoritmo "49 - soma mostrando pares e impares"
var
   C, P, I,N:inteiro
inicio
      C <- 0
      para C <- 1 ate 6 faca
      Escreva(C, ".Digite um número: ")
      Leia(N)
      Se (N % 2 = 0) entao
         P <- P + 1
      senao
           I <- I  + 1
      fimse
      fimpara
      Escreval("Os números pares são ",P, " e os impares são ",I)


fimalgoritmo