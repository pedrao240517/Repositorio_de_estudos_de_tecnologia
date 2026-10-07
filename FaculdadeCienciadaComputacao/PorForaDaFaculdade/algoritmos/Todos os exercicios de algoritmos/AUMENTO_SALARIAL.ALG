algoritmo "Aumento_salarial"
var
   nome, g:caractere
   anos, s, R:real
inicio
      Escreva("Qual o seu nome? ")
      Leia(nome)
      Escreva("Qual o seu salário? ")
      Leia(s)
      Escreva("Qual o seu gênero? ")
      Leia(g)
      Escreva("Quantos anos você trabalha na empresa? ")
      Leia(anos)
      Se (g = "feminino") e (anos < 15) entao
         R <- S + (S*5/100)
      senao
           Se (g = "feminino") e (anos >=15) e (anos < 20) entao
           R <- S + (S*12/100)
           senao
                Se (g = "feminino") e (anos >20)  entao
                R <- S + (S*23/100)
                senao
                     Se (g = "masculino") e (anos < 15) entao
                     R <- S + (S*3/100)
                     senao
                          se (g = "masculino") e (anos >=15) e (anos < 20) entao
                          R <- S + (S*13/100)
                          senao
                               Se (g = "masculino") e (anos >20)  entao
                                  R <- S + (S*25/100)
                               fimse
                          fimse
                     fimse
                fimse
           fimse
      fimse
      Escreva("Seu novo salário é igual a ",R," reais")
fimalgoritmo