algoritmo "seletor de pessoas"
var
    G,resp:caractere
    I, C, contM18, contF25:inteiro
inicio
repita
      Escreval("___________________________________")
      Escreval("Seletor de pessoas")
      Escreval("___________________________________")
      Escreval("Qual o seu gênero?[F/M]")
      leia(G)
      Escreval("Qual a sua idade?")
      Leia(I)
      Escreval("Qual a cor do seu cabelo?")
      Escreval("CASTANHO[1]")
      Escreval("LOIRO[2]")
      Escreval("PRETO[3]")
      Escreval("RUIVO[4]")
      Leia(C)
      Se (G = "M") e (I > 18) e (C = 2) entao
         contM18 <- contM18 + 1
      fimse
      Se (G = "F") e (I >= 25) e (I <= 30) e (C = 3) entao
         contF25 <- contF25 + 1
      FimSe
      Escreval("Deseja continuar?[S/N]")
      leia(resp)
      limpatela
ate ( resp = "N")
      Escreval("Foi contabilizado ",contM18," homens de mais de 18 anos de cabelo loiro e",contF25," mulheres de entre 25 e 30 de cabelo preto")
fimalgoritmo