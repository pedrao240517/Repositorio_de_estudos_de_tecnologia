algoritmo "semnome"
var
     N:caractere
     S,V,J:real
     A:inteiro
inicio
      Escreva("Qual o seu nome? ")
      Leia(N)
      Escreva("Quanto você recebe de sálario? ")
      Leia(S)
      Escreva("A quanto anos você trabalha aqui? ")
      Leia(A)
      Se (A <= 3) entao
         J <- S*3/100
         V <- J+S
           Escreva("Seu sálario aumentou em 3% ",N," seu novo sálario é",V)
      senao
           Se (A > 3)  e (A <=10) entao
              J <- S*12.5/100
              V <- J+S
                Escreva("Seu sálario aumentou em 12.5% ",N," seu novo sálario é",V)
           senao
                  J <- S*20/100
                  V <- J+S
                Escreva("Seu sálario aumentou em 20% ",N," seu novo sálario é",V)
           fimse
         fimse
fimalgoritmo
