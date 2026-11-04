algoritmo "semnome"
var
    H, R, P:real
inicio
      Escreva("Quantas horas de atividade física você fez no mês? ")
      leia(H)
      Se (H < 10) entao
         P <- H*2
         Escreval("Você recebeu ",P, " pontos")
      senao
           Se (H >= 10) e (H <= 20) entao
              P <- H*5
              Escreval("Você recebeu",P, " pontos")
           senao
                se (H > 20) entao
                   P <- H*10
                   Escreval("Você recebeu ",P, " pontos")
                fimse
           fimse
      fimse
      R <- P * 0.05
      Escreva("Você vai receber ",R," reais pelos pontos conquistados")
         
fimalgoritmo