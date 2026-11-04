algoritmo "DETECTOR DE PESADO"
var
   I:inteiro
   N, Pesado:caractere
   P, Mai:real
procedimento Topo()
inicio
 Limpatela
 Escreval("-----------------------------")
 Escreval(" DETECTOR DE PESADO")
 Escreval("Maior peso até agora ",Mai, "Kg")
 Escreval("-----------------------------")
fimprocedimento
inicio
      Topo()
      Para I <- 1 ate 5 faca
           Escreva("Digite o nome: ")
           Leia(N)
           Escreva("Digite o peso de ", N, ": ")
           Leia(P)
           se (P > Mai) entao
              Mai <- P
              Pesado <- N
           Fimse
           Limpatela
           Topo()
      fimpara
      Topo()
      Escreval(" A pessoa mais pesada foi ", Pesado, ", com", Mai, " quilos.")
fimalgoritmo