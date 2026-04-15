algoritmo "somador númerico"
var
cont, N, soma, M, P:inteiro

inicio
      cont <- 1
      soma <- 0
      Enquanto (cont <= 10) faca
       Escreva(" Digite o ",cont," o. valor: ")
       Leia(N)
       se (N > M) entao
          M <- N
       fimse
       se (N < P) entao
          P <- N
       fimse
          soma <- soma + N
          cont <- cont + 1
       fimenquanto
           Escreval(" A soma dos números é igua a",soma)
           Escreval(" O maior número dessa soma é",M)
           Escreval(" O menor número dessa soma é",P)
fimalgoritmo
