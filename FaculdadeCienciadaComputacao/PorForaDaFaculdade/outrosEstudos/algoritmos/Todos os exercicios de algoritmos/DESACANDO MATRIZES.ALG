algoritmo "DESACANDO MATRIZES"
var
   m:vetor[1..4,1..4] de inteiro
   i,c,p:inteiro
   
procedimento texto()
inicio
      Escreval("_________________________")
      Escreval("     MENU DE OPÇÕES      ")
      Escreval("[1]MATRIZ PRINCIPAL")
      Escreval("[2]DIAGONAL PRINCIPAL")
      Escreval("[3]TRIÂNGULO SUPERIOR")
      Escreval("[4]TRIÂNGULO INFERIOR")
      Escreval("[5]SAIR")
      Escreval("_________________________")
      leia(p)

fimprocedimento
inicio
      para i <- 1 ate 4 faca
       para c <- 1 ate 4 faca
            Escreval("Digite o valor da posição: ","[",i,",",c,"]: ")
            leia(m[i,c])
       fimpara
      fimpara
      limpatela
      repita
      texto()
      limpatela
      escolha p
       Caso 1
       escreval("---MATRIZ COMPLETA ---")
       para i <- 1 ate 4 faca
        para c <- 1 ate 4 faca
             Escreva(m[i,c]:5)
        fimpara
               Escreval()
      fimpara
       Caso 2
       escreval("---DIAGONAL PRINCIPAL ---")
       para i <- 1 ate 4 faca
        para c <- 1 ate 4 faca
           se(i=c) entao
                   Escreva(m[i,c]:4)
           senao
               Escreva("     ")
           fimse
        fimpara
               Escreval("")
      fimpara
       Caso 3
       escreval("--- TRIÂNGULO SUPERIOR ---")
            para i <- 1 ate 4 faca
               para c <- 1 ate 4 faca
                  se (c > i) entao
                     Escreva(m[i, c]:5)
                  senao
                     Escreva("     ")
                  fimse
               fimpara
               Escreval("")
            fimpara
       Caso 4
        escreval("--- TRIÂNGULO INFERIOR ---")
            para i <- 1 ate 4 faca
               para c <- 1 ate 4 faca
                  se (c < i) entao
                     Escreva(m[i, c]:5)
                  senao
                     Escreva("     ")
                  fimse
               fimpara
               Escreval("")
            fimpara
       Caso 5
       Escreva("Saindo do programa...")
      fimescolha
      ate(p=5)

fimalgoritmo