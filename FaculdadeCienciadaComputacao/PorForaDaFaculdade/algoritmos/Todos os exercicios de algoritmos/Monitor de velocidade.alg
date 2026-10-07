algoritmo "Monitor de velocidade"
var
    KM, KMA, M:inteiro
inicio
      Escreval("_____________________")
      Escreval("Monitor de velocidade")
      Escreval("_____________________")
      Escreva("Diga qual a velocidade que o carro passou em KM/H:")
      Leia(KM)
      Se (KM > 80) entao
         KMA <- KM - 80
         M <- (KMA*5)
         Escreval("Esse carro ultrapassou o limite de velocidade")
         Escreval("Esse carro foi multado em ",M," reais")
      senao
           Escreval("Esse carro está dentro do limite de velocidade")
      fimse
fimalgoritmo
