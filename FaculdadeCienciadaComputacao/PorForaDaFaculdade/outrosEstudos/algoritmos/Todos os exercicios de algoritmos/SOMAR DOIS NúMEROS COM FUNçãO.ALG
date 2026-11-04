algoritmo "somar dois números com função"
var
   N1,N2,resp:inteiro
funcao soma(X,Y:inteiro):inteiro
inicio
      Retorne X + Y
fimfuncao
inicio
      Escreva("Digite um número: ")
      Leia(N1)
      Escreva("Digite outro número: ")
      Leia(N2)
      Resp <- soma(N1,N2)
      Escreva("A soma entre ",N1, " e ",N2," é igua a ",Resp)

fimalgoritmo