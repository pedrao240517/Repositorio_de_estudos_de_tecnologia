algoritmo "Dia da Mulher"
var
      nome:caractere
      D ,valor,r:real
      
inicio
      Escreva("Qual o seu nome? ")
      Leia(nome)
      Escreva("Seu sexo é (1)masculino ou (2)feminino? ")
      Leia(R)
      Escreva("Qual o valor da sua compra? ")
      Leia(valor)
      se (R=2) entao
      D <- (13*valor)/100
      valor <- valor - D
      senao
      D <- (5*valor)/100
      valor <- valor - D
      fimse
      Escreva("Você teve um desconto de ",D," %, sua compra ficou",valor," reai")
fimalgoritmo
