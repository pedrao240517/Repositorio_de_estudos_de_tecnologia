algoritmo "semnome"
var
   carro, dias:inteiro
   km, preco_total, preco_inicial:real
inicio
      Escreva("Qual tipo de carro deseja alugar ?")
      Escreva("Digite[1] para carro popular(R$90)e[2] para carro de luxo(R$150)")
      Leia(carro)
      Escreva("Por quantos dias deseja alugar? ")
      Leia(dias)
      Se (carro = 1) entao
         preco_inicial <- 90*dias
      senao
           se(carro = 2) entao
                    preco_inicial <- 150*dias
      fimse
           fimse
      Escreval("O preço inicial foi igual a ",preco_inicial:4:2)
      Escreva("Quantos KM você percorreu? ")
      leia(km)
      Se (carro = 1) e (km <=100) entao
         preco_total <- preco_inicial + (km*0.20)
      senao
           Se (carro = 1) e (km > 100) entao
              preco_total <- preco_inicial + (km*0.10)
           senao
                Se (carro = 2) e (km <= 200) entao
                   preco_total <- preco_inicial + (km*0.30)
                senao
                     Se (carro = 2) e (km > 200) entao
                        preco_total <- preco_inicial + (km*0.25)
                     fimse
                fimse
           fimse
      fimse
      Escreva("Você vai pagar no total ",preco_total:5:2," reais")



fimalgoritmo

