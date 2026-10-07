algoritmo "título de eleitor"
var
     ano_atual,ano_nascimento,idade:inteiro
inicio
      Escreval("_____________________________________")
      Escreval("       Tribunal eleitoral   ")
      Escreval("_____________________________________")
      Escreva("Em que ano estamos? ")
      Leia(ano_atual)
      Escreva("Em que ano você nasceu? ")
      Leia(ano_nascimento)
      Escreval("______________________________________")
      Escreval("               Status                   ")
      Idade <- (ano_atual-ano_nascimento)
      Se (idade >= 18) entao
         Escreval("Você está apto a votar.")
         Escreva("______________________________________")
      senao
         Escreval("Você não está apto a votar")
         Escreva("______________________________________")
      fimse
fimalgoritmo
