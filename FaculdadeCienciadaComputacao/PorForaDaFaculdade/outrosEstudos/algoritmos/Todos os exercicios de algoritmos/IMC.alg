algoritmo "imc"
var
   M,A,IMC:real
inicio
      Escreva("Qual sua massa corporal? ")
      Leia(M)
      Escreva("Qual a sua altura? ")
      leia(A)
      IMC <- M / (A^2)
      EscrevaL("IMC: ", IMC:5:2)
      Se (IMC >= 18.5) e (IMC <= 25) entao
         Escreva("Você está com o peso corporal adequado.")
      senao
         Escreva("Você está com o peso corporal inadequado.")

      fimse
fimalgoritmo
