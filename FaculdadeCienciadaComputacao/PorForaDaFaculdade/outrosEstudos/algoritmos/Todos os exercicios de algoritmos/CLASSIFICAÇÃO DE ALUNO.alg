algoritmo "Futebol"
var
       B,M,S:inteiro

inicio
      EscrevaL("BANGU X MENGÃO")
      Escreval("______________")
      Escreval("Quantos gols do BANGU ? ")
      Leia(B)
      
      Escreval("Quantos gols do MENGÃO ? ")
      Leia(M)
      
      S  <- Abs(B-M)
      Escolha s
              Caso 0
                 Escreval("_______________")
                 Escreval("    EMPATE    ")
                 Escreval("_______________")
              Caso 1,2
                 Escreval("_______________")
                 Escreval("    NORMAL     ")
                 Escreval("_______________")
              Caso 3,4,5
                 Escreval("_______________")
                 Escreval("    GOLEADA    ")
                 Escreval("_______________")
      fimescolha
      
fimalgoritmo
