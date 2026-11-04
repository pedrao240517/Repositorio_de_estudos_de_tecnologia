algoritmo "valorespares- vetores"
var
    val: vetor[1..7] de inteiro
    i,T:inteiro
inicio
      T <- 0
      i <- 1
      Para i <- 1 ate 7 faca
          Escreva("Digite o ",I,"o. valor: ")
          Leia (val[i])
          se (val[i] % 2 = 0 ) entao
             T <- T +1
          fimse
     fimpara
    Escreva("Tem ", T, " valores pares")
fimalgoritmo