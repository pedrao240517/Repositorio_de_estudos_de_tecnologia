algoritmo "semnome"
var
     D, S:inteiro
inicio
       Escreva("Quantos dias você trabalhou nesse mês? ")
       Leia(D)
       Se (D > 31) ou (D < 0) entao
      Escreva("Valor inválido! Digite um número entre 0 e 31.")
   Senao
       S <- (D*8*25)
       Escreva("Você vai receber ",S," reais")
       fimse
       
fimalgoritmo
