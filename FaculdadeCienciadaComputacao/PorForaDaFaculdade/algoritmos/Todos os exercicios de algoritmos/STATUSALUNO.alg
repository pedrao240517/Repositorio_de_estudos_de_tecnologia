algoritmo "O que aconteceu com o aluno"
var
     N1,N2,M:real
inicio
      Escreva("Diga sua primeira nota: ")
      Leia(N1)
      Escreva("Diga sua segunda nota: ")
      Leia(N2)
      M <- (N1+N2)/2
      Escreval("A sua média é igua há: ",M:4:2)
       Se (M >= 7) entao
          Escreva("Aluno aprovado")
       senao
           se (M >=5) e (M < 7)  entao
              Escreva("Aluno de recuperação")
           senao
                Escreva("Aluno reprovado")
           Fimse
       Fimse

fimalgoritmo
