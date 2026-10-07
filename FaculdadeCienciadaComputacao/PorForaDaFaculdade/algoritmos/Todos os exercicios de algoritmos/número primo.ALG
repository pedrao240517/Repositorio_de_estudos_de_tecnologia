algoritmo "semnome"
var
   N, C, cont:inteiro
inicio
   C <- 1
   cont <- 0
   Escreva("Digite um número: ")
   Leia(N)
   Repita
         Escreval(C)
         se (N % C = 0) entao
         cont <- cont +1
         fimse
   C <- C +1
   Ate( C > N)
   Escreval("Ao todo existem",cont," valores divisisveis")
   se (cont > 2 ) entao
      Escreva("Esse número não é primo. ")
   senao
        escreva("Esse número é primo. ")
   fimse
fimalgoritmo