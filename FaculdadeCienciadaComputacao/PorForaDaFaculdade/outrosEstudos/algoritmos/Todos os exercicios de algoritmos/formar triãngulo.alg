algoritmo "formar triãngulo"
var
     R1, R2, R3:real
inicio
      Escreva("Digite o 1 segmento de reta: ")
      Leia(R1)
      Escreva("Digite o 2 segmento de reta: ")
      Leia(R2)
      Escreva("Digite o 3 segmento de reta: ")
      Leia(R3)
      Se (R1 +R2 > R3) e (R2 + R3 > R1) e (R1 + R3 > R2) entao
         Escreval("É possível formar um triângulo com essas retas. ")
      senao
           Escreval("Não pode formar um triângulo. ")
      fimse
       Se (R1=R2) e (R2=R3) e (R3=R1) entao
          Escreval("Esse é um triângulo equilatero")
       senao
            Se (R1 = R2) ou (R2 = R3) ou (R1 = R3) entao
               Escreval("Esse é um triângulo isosceles")
            senao
                 Escreval("Esse é um triângulo Escaleno")
            fimse
       fimse
fimalgoritmo
