algoritmo "fatorial"
var
   C, N, F:inteiro
   R:caractere
inicio
Repita
      Escreva("Digite um número: ")
      Leia(N)
      C <- N
      F <- 1
      Repita
          F <- F*C
          C <- C-1
      Ate(C < 1)
      Escreval("O valor do fatorial de",N, " é igual a ",F)
      Escreva("Deseja continuar?[S/N]? ")
      Leia(R)
      Limpatela
Ate (R ="N")
fimalgoritmo
