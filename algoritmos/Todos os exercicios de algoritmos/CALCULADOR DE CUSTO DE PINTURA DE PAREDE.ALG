algoritmo "Calculador de custo de pintura de parede"
var
      L, C, M, D, A, CU:real
inicio
       Escreva("Digite a largura da parede: ")
       Leia(L)
       Escreva("Agora digite o comprimento da parede: ")
       Leia(C)
       Escreva("Quanto cada balde pinta em metros? ")
       Leia(M)
       Escreva ("Quanto custa cada balde? ")
       Leia(D)
       A<- L*C
       CU<- A/M
       D<-CU*D
       Escreval(" A área é igual a: ", A)
       Escreval("Vai ser necessário: ",CU," baldes")
       Escreva("O custo para pintar a parede é: ", D)

fimalgoritmo