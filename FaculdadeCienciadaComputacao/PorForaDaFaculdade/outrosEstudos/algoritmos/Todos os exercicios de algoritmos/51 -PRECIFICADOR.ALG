algoritmo "precificador"
var
   C, P, N, soma,maior,menor: inteiro
   nome, menorn, maiorm:caractere
procedimento inicial()
inicio
      Escreval("________________________")
      Escreval("     PRECIFICADOR 2.0   ")
      Escreval("________________________")

fimprocedimento
inicio
      inicial()
      limpatela
      para C <- 1 ate 4 faca
      Escreva("Qual o nome do produto? ")
      leia(nome)
      Escreva(C,".Qual o valor do produto em reais? ")
      Leia(P)
      soma <- soma + P
      limpatela
      se (C = 1) entao
         maior <- P
         maiorm <- nome
         menor <- P
         menorn <- nome
      senao
           Se (P < menor) entao
                 menor <- p
                 menorn <- nome
           senao
                se (P > maior) entao
                   maior <- P
                   maiorm <- nome
                fimse
           fimse
      fimse
      fimpara
      Escreval("A soma dos produtos é ",soma," reais")
      Escreval("O produto de menor valor foi ",menorn," de ",menor," reais ")
      Escreval("O produto de maior valor foi ",maiorm," de ",maior," reais ")
      
      


fimalgoritmo