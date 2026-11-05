algoritmo "analisador de valores"
var
   C, N,D,S,D5,D0,D2:inteiro
   M:real
inicio
      Escreva("Quantos números você quer? ")
      Leia(N)
      Escreva("___________________________")
      limpatela
      Para C <- 1 ate N faca
           Escreva(C,".Digite um número: ")
           Leia(D)
           S <- S +D
           M <- S/N
      Se (D % 5 = 0) entao
         D5 <- D5 +1
      fimse
      Se (D = 0) entao
         D0 <- D0 +1
      fimse
      Se (D % 2 = 0) entao
         D2 <- D2 +1
      fimse
      fimpara
      Escreval("A soma dos valores é ",S)
      Escreval("A média dos valores é ",M)
      Escreval("A quantidade de números dívisiveis por 5 é ",D5)
      Escreval("A quantidade de valores nulos é ",D0)
      Escreval("A quantidade de números pares é ",D2)
      

fimalgoritmo