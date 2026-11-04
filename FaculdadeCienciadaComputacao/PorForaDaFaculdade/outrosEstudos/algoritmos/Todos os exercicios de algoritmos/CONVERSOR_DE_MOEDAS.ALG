algoritmo "Conversor_de_Moedas"
var
   R, D: real
   C, Q: inteiro
inicio
   C <- 1
   Escreva("Quantas conversões você quer fazer? ")
   Leia(Q)

   Enquanto (C <= Q) faca
      Escreva("Qual o valor em R$? ")
      Leia(R)
      D <- R / 5.22
      // O Escreval pula uma linha, facilitando a próxima leitura
      Escreval("O valor convertido é U$", D:5:2)

      // O contador que faz o loop avançar
      C <- C + 1
   Fimenquanto
fimalgoritmo