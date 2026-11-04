algoritmo "par ou impar com funcao"
var
  N:inteiro
  R:caractere
funcao par_ou_impar(V:inteiro):caractere
inicio
      Se (V % 2 = 0) entao
        Retorne "PAR"
      senao
        Retorne "IMPAR"
      fimse
fimfuncao
inicio
    Escreva("Digite um número: ")
    Leia(N)
    R <- par_ou_impar(N)
    Escreva("O número ", N," e um valor ",R)




fimalgoritmo