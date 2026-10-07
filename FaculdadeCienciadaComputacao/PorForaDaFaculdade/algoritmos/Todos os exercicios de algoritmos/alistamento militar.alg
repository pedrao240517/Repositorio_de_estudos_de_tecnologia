algoritmo "alistamentomilitar"
var
     ano_atual,ano_nascimento,idade,D:inteiro
inicio
      Escreval("_____________________________________")
      Escreval("        EXÉRCiTO BRASILEIRO    ")
      Escreval("_____________________________________")
      Escreva("Em que ano estamos? ")
      Leia(ano_atual)
      Escreva("Em que ano você nasceu? ")
      Leia(ano_nascimento)
      Escreval("______________________________________")
      Escreval("               Status                   ")
      Idade <- (ano_atual-ano_nascimento)
      Se (idade = 18) entao
         Escreval("Você está apto a se alistar.")
         Escreva("______________________________________")
      fimse
      se (idade > 18) entao
         D <- Idade- 18
         Escreval("Você está apto a se alistar e está a ",D," anos atrasado ")
         Escreva("______________________________________")
      fimse
      Se (idade <18 ) entao
         D <- 18- Idade
         Escreval("Você não está apto a se alistar e falta ainda ",D," ano/s para se alistar ")
         Escreva("______________________________________")
      fimse
fimalgoritmo
