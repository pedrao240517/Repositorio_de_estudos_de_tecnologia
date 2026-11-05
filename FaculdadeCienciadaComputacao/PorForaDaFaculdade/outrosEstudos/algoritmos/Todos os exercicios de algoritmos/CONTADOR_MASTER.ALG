algoritmo "contador_master"
var
   N1, N2, N3: inteiro
inicio
   Escreval("----- CONTADOR MASTER -----")
   Escreva("Digite o primeiro Valor: ")
   Leia(N1)
   Escreva("Digite o último Valor: ")
   Leia(N2)
   Escreva("Digite o incremento: ")
   Leia(N3)

   Escreva("Contagem: ")

   // CASO 1: Contagem Progressiva (Ex: 1 até 10)
   Se (N1 <= N2) entao
      Enquanto (N1 <= N2) faca
         Escreva(N1, " ")
         N1 <- N1 + N3
      fimenquanto

   // CASO 2: Contagem Regressiva (Ex: 10 até 1)
   senao
      Enquanto (N1 >= N2) faca
         Escreva(N1, " ")
         N1 <- N1 - N3 // Aqui a gente subtrai para diminuir o valor
      fimenquanto
   fimse

   Escreval("... Acabou!")
fimalgoritmo