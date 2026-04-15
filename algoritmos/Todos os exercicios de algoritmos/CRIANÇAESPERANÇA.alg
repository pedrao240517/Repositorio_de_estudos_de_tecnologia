algoritmo "semnome"
var
      D:inteiro
      valor:real
inicio
      Escreval("_______________________")
      Escreval("   CRIANÇA ESPERANÇA      ")
      Escreval("_______________________")
      Escreval("[1] para doar 10 reais")
      Escreval("[2] para doar 25 reais")
      Escreval("[3] para doar 50 reais")
      Escreval("[4] para doar 100 reais")
      Escreval("[5] para doar outro valor ")
      Escreval("[6] para cancelar a doação")
      Leia(D)
      Escolha D
         Caso 1
             Valor <- 10
         Caso 2
             Valor <- 25
         Caso 3
             Valor <- 50
         Caso 4
             Valor <- 100
         Caso 5
             Escreva("Qual o valor da doação? ")
             Leia(valor)
         Caso 6
             Valor <- 0
      Fimescolha
      Escreval("__________________________________________________")
      Escreval("Sua doação foi de", valor," reais, muito obrigado.")
      Escreval("__________________________________________________")
      
fimalgoritmo
