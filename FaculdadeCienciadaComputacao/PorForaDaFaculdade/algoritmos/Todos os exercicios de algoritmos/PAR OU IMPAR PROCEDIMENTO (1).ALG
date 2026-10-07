algoritmo "par ou impar procedimento"
var
    N:inteiro
Procedimento parouimpar(V: inteiro)
inicio
   Se (V%2 = 0 ) entao
      Escreva("O número ", V, " é par")
   senao
        Escreva(" O número ", V, " é impar")
   fimse
fimprocedimento
inicio
      Escreva("Digite um número: ")
      Leia(N)
      parouimpar(N)
fimalgoritmo