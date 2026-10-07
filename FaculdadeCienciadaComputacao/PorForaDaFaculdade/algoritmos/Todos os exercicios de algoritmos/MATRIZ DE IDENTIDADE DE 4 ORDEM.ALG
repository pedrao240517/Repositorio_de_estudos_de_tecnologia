algoritmo "matriz de identidade de 4 ordem"
var
   m: vetor[1..4, 1..4] de inteiro
   l,c,s,sm,m3:inteiro
procedimento proc()
inicio
      Escreval(" _____________________________________")
      Escreval("| MATRIZ DE 4 IDENTIDADE DE 4 ORDEM   |")
      Escreval("|_____________________________________|")
fimprocedimento
inicio
      s <- 0
      sm <- 1
      Para l<- 1 ate 4 faca
        para c <- 1 ate 4 faca
            Escreva("Digite o valor da posição: [",l,",",c,"]")
            leia(m[l,c])
            se(l=c) entao
                    s <- s + m[l,c]
            fimse
        fimpara
      fimpara
      proc()
      para l<- 1 ate 4 faca
       para c <- 1 ate 4 faca
        escreva(m[l,c]:5)
       fimpara
       Escreval()
      fimpara
      para c <- 1 ate 4 faca
      sm <- sm * m[2,c]
      fimpara
      para l <- 1 ate 4 faca
           se (m[l,3]> m3) entao
            m3 <- m[l,3]
            fimse
      fimpara
      Escreval("_____________________________________")
      Escreval("A soma da diagonal principal é ",s)
      Escreval("A multiplicação da segunda linha é ",sm)
      escreval("O maior número da 3  coluna é ",m3)

fimalgoritmo