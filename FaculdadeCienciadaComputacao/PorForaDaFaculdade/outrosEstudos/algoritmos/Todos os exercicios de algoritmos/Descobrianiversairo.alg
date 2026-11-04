algoritmo "Descobri aniversário"
var
   Ano_atual,Ano_nascimento,Resultado:inteiro
inicio
      Escreva("Em que anos estamos? ")
      Leia(Ano_atual)
      Escreva("Em que ano eu nasci? ")
      Leia(Ano_nascimento)
      Resultado <- (Ano_atual-Ano_nascimento)
      Escreval("Então você tem ",Resultado," anos ")
      Se (Resultado >=18) entao
         Escreva("Tome cuidado, você já é de maior e pode ser preso. ")
      senao
         Escreva(" Se safou por enquanto. ")
      fimse
fimalgoritmo
