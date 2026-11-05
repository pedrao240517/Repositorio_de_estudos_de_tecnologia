algoritmo "analisadorstrings"
var
   N:caractere
   C:inteiro
inicio
      Escreva("Digite seu nome: ")
      leia(N)
      Escreval("Total de letras do seu nome: ", Compr(N))
      Escreval("Seu nome em maisculo: ", maiusc(N))
      Escreval("Seu nome em maisculo: ", minusc(N))
      Escreval("1 letra: ",copia(N, 1, 1))
      Escreval("ultima letra: ",copia(maiusc(N),compr(N),1 ))
      Para C <- compr(N) ate 1 passo -1   faca
        Escreva(copia(maiusc(N),C ,1))
      fimpara
fimalgoritmo