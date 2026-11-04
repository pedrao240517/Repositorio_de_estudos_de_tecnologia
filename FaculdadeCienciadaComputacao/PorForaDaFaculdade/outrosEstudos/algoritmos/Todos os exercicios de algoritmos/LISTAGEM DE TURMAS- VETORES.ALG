algoritmo "listagem de turmas- vetores"
var
   nome:vetor[1..4] de caractere
   n1: vetor [1..4] de real
   n2: vetor [1..4] de real
    m: vetor [1..4] de real
    sm ,mt:real
    i,tot:inteiro
inicio
     Para i<- 1 ate 4 faca
        Escreval("ALUNO", i)
        Escreva("nome: ")
        Leia(nome[i])
        Escreva("primeira nota: ")
        Leia(n1[i])
        Escreva("Segunda nota: ")
        Leia(n2[i])
        m[i] <- n1[i]+n2[i]/2
        sm <-  sm + m[i]
        
     fimpara
     mt<- sm/4
     limpatela
     
     Escreval("LISTAGEM DE ALUNOS")
     Escreval("__________________")
     Para i <- 1 ate 4 faca
          Escreval(nome[i]:15, m[i]:4:1)
          se (m[i] >  mt ) entao
              tot <- tot + 1
          fimse
     fimpara
     Escreval("__________________")
     Escreval(" A média da turma é igual a : ",mt)
     Escreva("O total de alunos acima da média é: ",tot)
     

fimalgoritmo