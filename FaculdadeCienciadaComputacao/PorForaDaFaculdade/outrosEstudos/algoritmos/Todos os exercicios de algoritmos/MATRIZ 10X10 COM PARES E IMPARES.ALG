algoritmo "matriz 10x10 com pares e impares"
var
M : vetor[1..10, 1..10] de inteiro
l,c,p,inp:inteiro
inicio
     para l <- 1 ate 10 faca
      para c  <- 1 ate 10 faca
            Escreval("Digite o valor da matriz: [",l,",",c,"]")
            Leia(M[l,c])
      fimpara
     fimpara
     Escreval("_______________________________________________________________________________________________________________________________")
     Escreval("                                                           MATRIZ                                ")
     Escreval("_______________________________________________________________________________________________________________________________")
     para l <- 1 ate 10 faca
      para c <- 1 ate 10 faca
           Escreva(M[l,c]:8)
           se (M[l,c] %2 = 0 ) entao
                p <- p +1
           senao
                inp <- inp +1
           fimse
           se (M[l,c] %2 = 0 ) entao
              Escreva("{",m[l,c]:2,"}")
           senao
                Escreva(M[l,c]:4)
           fimse
      fimpara
             Escreval()
     fimpara
     Escreval("Os números em colchetes são pares.")
     Escreval("Os números fora dos  colchetes são impares.")
     Escreval("Existem ",p," números pares nessa matriz")
     Escreval("Existem ",inp," números pares nessa matriz")
fimalgoritmo