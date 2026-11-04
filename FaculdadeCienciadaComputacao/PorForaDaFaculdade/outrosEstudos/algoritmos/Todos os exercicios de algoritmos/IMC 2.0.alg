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
      Se (IMC < 17) entao
        Escreval("Você está muito abaixo do peso. ")
      senao
           se (IMC >= 17) e (IMC <18.5) entao
              Escreval("Você está abaixo do peso. ")
           senao
                se (IMC >= 18.5) e (IMC < 25) entao
                   Escreval("Você está no peso ideal. ")
                senao
                     se (IMC >= 25) e (IMC < 30 ) entao
                        Escreval("Você está um pouco acima do peso")
                     senao
                          se (IMC >= 30) e (IMC <35) entao
                             Escreval("Você está muito acima do peso(Sobrepeso). ")
                          senao
                               se (IMC >= 35) e (IMC <400 entao
                                  Escreval("Você está com obsedidade severa.")
                               senao
                                    Escreval("Você está em obsedidade mórbida.")
                               Fimse
                          Fimse
                     Fimse
                Fimse
           Fimse
      Fimse
fimalgoritmo
