algoritmo "semnome"
var
        N:inteiro
inicio
      Escreval("______________________________________________________")
      Escreval("Sorteio de um número de 1 a 1000000: ")
      Escreval("Clique  em 1 pra sortear.")
      Leia(N)
      Escreval("______________________________________________________")
      Se (N= 1) entao
         Aleatorio 1, 1000000
         Leia(N)
         Aleatorio off

         Escreval("O número sorteado foi: ", N)
      senao
           Escreval("Sorteio cancelado.")
      fimse
fimalgoritmo
