algoritmo "valoresparescomposicção- vetores"
var
    val: vetor[1..7] de inteiro
    i,T:inteiro
inicio
      T <- 0
      i <- 1
      Para i <- 1 ate 7 faca
          Escreval("Digite o ",I,"o. valor: ")
          Leia (val[i])
          se (val[i] % 2 = 0 ) entao
             T <- T +1
          fimse
     fimpara
    Escreva("Tem ", T, " valores pares")
    para i<- 1 ate 7 faca
       Se (val[i] %  2 = 0) entao
        Escreval("valor par na posição ",i )
        fimse
    fimpara
fimalgoritmo