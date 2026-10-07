algoritmo "maior nota"
var
    C,A,R,Maiornota,Menornota:inteiro
    N,melhor_aluno,pior_aluno:caractere
inicio
      Escreval("_________________")
      Escreval("Escola vida mansa")
      Escreval("_________________")
      Escreval("Quantos alunos tem na turma?")
      Leia(A)
      C <- 0
      Menornota <- 99
      Maiornota <- 0
        Enquanto (C < A) faca
                 C <- C + 1
      Escreval("_________________")
      Escreval("Nome do aluno:")
      Leia(N)
      Escreval("Nota de ",N,":")
      Leia(R)
             Se (R > Maiornota) entao
                    Maiornota <- R
                    melhor_aluno <- N
             fimse
             Se (R < Menornota) entao
                    Menornota <- R
                    pior_aluno <- N
             FimSe
         fimenquanto
         Escreval("___________________________")
         Escreval("O melhor aproveitamento foi de ", melhor_aluno, " com a nota ", Maiornota:2:1)
         Escreval("O pior foi ", pior_aluno, " com ", Menornota)
fimalgoritmo