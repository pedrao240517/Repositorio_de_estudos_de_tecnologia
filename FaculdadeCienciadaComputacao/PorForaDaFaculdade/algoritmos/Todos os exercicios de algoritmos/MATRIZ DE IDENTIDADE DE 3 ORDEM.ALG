algoritmo "matriz de identidade de 3 ordem"
var
   m: vetor[1..10, 1..10] de inteiro
   l,c:inteiro
inicio
      Para l<- 1 ate 10 faca
        para c <- 1 ate 10 faca
             se(l=c) entao
             m[l,c] <- 1
              senao
               m[l,c] <- 0
             fimse
           Escreva(m[l,c])
        fimpara
               Escreval()
      fimpara

fimalgoritmo