algoritmo "preçodeviajem"
var
     D:inteiro
     P:real
inicio
      Escreva("Qual distãncia você deseja percorrer em KM? ")
      Leia(D)
      se (D <=200)entao
         P <- D*0.50
         Escreva("O preço da viagem ficou ",P," reais")
      senao
         P <- D*0.45
         Escreva(" O preço da vaigem ficou ",P," reais")
      fimse
fimalgoritmo
