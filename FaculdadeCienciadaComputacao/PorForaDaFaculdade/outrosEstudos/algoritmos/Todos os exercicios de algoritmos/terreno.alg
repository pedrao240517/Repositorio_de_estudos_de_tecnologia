algoritmo "terreno"
var
   A, L, C:real
inicio
      Escreva("Qual a largura do terreno em metros? ")
      Leia(L)
      Escreva("Qual o comprimento do terreno em metros? ")
      Leia(C)
      A <- L*C
      Se (A<100) entao
         Escreval("Esse é um terreno popular. ")
      senao
           se (A >100) e (A < 500) entao
              Escreval("Esse é um terreno master. ")
           senao
                Escreval("Esse é um terreno vip. ")
           fimse
         fimse
         Escreva("Seu terreno tem ",A, " m2 de área.")
fimalgoritmo



