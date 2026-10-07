algoritmo "matriz inicial"
var
M : vetor[1..3, 1..2] de inteiro
l,c:inteiro
inicio
     para l <- 1 ate 3 faca
      para c  <- 1 ate 2 faca
            Escreval("Digite um valor: ")
            Leia(M[l,c])
      fimpara
     fimpara
     para l <- 1 ate 3 faca
      para c <- 1 ate 2 faca
           Escreva(M[l,c]:5)
      fimpara
             Escreval()
     fimpara

fimalgoritmo