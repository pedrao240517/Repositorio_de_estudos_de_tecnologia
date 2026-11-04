algoritmo "aprovadordelauno"
var
    N1, N2, S:inteiro
inicio
     Escreva("Digite a nota da primeira prova: ")
     Leia(N1)
     Escreva("Digite a nota da segunda Prova: ")
     Leia(N2)
     S <-(N1+N2)\2
     Escreval("A sua média é igual a: ", S)
     se (S >= 7) entao
        Escreva("Aluno aprovado. ")
     senao
          Escreva("Aluno reprovado.")
     fimse

fimalgoritmo
