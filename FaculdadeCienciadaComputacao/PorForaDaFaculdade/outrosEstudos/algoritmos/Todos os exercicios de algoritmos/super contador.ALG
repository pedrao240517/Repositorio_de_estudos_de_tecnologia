algoritmo "semnome"
var
     opcao, cont: inteiro
inicio
   Repita
      Escreval("")
      Escreval("==============================================================")
      Escreval("|    M E N U        |")
      Escreval("==============================================================")
      Escreval("| [1] De 1 a 10     |")
      Escreval("| [2] De 10 a 1     |")
      Escreval("| [3] Sair          |")
      Escreval("==============================================================")
      Leia(opcao)

      Escolha opcao
         Caso 1
            cont <- 1
            Enquanto (cont <= 10) faca
               Escreva(cont, ".. ")
               cont <- cont + 1
            Fimenquanto
            Escreval("")
         Caso 2
            cont <- 10
            Enquanto (cont >= 1) faca
               Escreva(cont, ".. ")
               cont <- cont - 1
            Fimenquanto
            Escreval("")
         Caso 3
            Escreval("Saindo...")
      Fimescolha

   Ate (opcao = 3)
fimalgoritmo