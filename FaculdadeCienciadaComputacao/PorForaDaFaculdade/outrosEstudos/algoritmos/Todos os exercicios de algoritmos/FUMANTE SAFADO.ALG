algoritmo "Fumante safado"
var
    C,T,D:inteiro
    V:real
inicio
      Escreva("Quantos cigarros você fuma por dia? ")
      Leia(C)
      Escreva("A quantos anos você fuma? ")
      Leia(T)
      D <- T*365
      V <- (C*10*D)\1440
      Escreva("Você perderá ",V," dias de vida. ")
fimalgoritmo