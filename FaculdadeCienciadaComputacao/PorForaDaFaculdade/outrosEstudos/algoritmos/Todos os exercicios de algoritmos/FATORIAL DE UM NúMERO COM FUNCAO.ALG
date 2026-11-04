algoritmo "fatorial de um número com funcao"
var
   N,F :inteiro
funcao fatorial(V:inteiro):inteiro
var
   C ,R:inteiro
inicio
    R <- 1
    Para C <- 1 ate V faca
    R <- R *C
    fimpara
    Retorne R
fimfuncao
inicio
      Escreva("Digite um número: ")
      Leia(N)
      F <- fatorial(N)
      Escreva("O fatorial de ",N,"!"," é igua a ",F)

fimalgoritmo