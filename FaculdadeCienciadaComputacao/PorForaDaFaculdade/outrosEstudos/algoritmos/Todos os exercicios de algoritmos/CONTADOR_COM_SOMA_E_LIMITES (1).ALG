algoritmo "Contador_Com_Soma_e_Limites"
var
   C, N, S, soma, maior, menor: inteiro
inicio
   soma <- 0
   C <- 0

   Escreva("Quantos números você quer contar? ")
   Leia(N)
   Escreva("Quantos você quer saltar por vez? ")
   Leia(S)

   Enquanto (C < N) faca //enquanto (C < N) faca  garante que o programa continue até chegar no numero desejado pelo usuario
      C <- C + S // O contador pula (ex: de 0 para 2)

      // Exibe o número atual do salto
      Escreval(C)

      // Acumula o valor de C na soma total
      soma <- soma + C

      // Lógica para o Primeiro Valor (Inicializa maior e menor)
      // Usamos C = S porque é o valor do primeiro salto
      se (C = S) entao
         maior <- C
         menor <- C
      senao
         // Comparações para os próximos números
         se (C > maior) entao
            maior <- C
         fimse
         se (C < menor) entao
            menor <- C
         fimse
      fimse

   fimenquanto

   Escreval("------------------------------------")
   Escreval("A soma dos números é igual a ", soma)
   Escreval("O maior número é igual a ", maior)
   Escreval("O menor número é igual a ", menor)
fimalgoritmo