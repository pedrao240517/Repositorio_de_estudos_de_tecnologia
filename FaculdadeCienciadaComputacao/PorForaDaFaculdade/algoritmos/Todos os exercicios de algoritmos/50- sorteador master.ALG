algoritmo "50- sorteador master
"
var
   N, C, M5, D3:inteiro
inicio
      C <- 1
      Repita
      Aleatorio 1,10
      Escreva(C,".O número sorteado foi: ")
      Leia(N)
      C <- C + 1
      Se (N > 5) entao
         M5 <- M5 +1
      fimse
      se (N % 3 = 0) entao
         D3 <- D3 +1
      fimse
      Ate (C =21)
      Escreval("Foram sorteador ",M5," números acima de de 5")
      Escreval("e foram sorteados ",D3, " números divisíveis por 3")
      


fimalgoritmo