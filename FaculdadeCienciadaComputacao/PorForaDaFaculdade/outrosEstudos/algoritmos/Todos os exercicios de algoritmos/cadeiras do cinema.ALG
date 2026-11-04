algoritmo "cadeira do cinema"
var
   B: vetor[1..10] de Caractere
   cad, i: inteiro // Adicionei o i aqui para a inicialização
   r: caractere

procedimento mostrarfileira()
var i: inteiro
inicio
   Para i <- 1 ate 10 faca
      // Verificando se está vazio (ajustado para "")
      se (B[i] = "") entao
         Escreva("[B", i:2, "]")
      senao
         Escreva("[---]")
      fimse
   fimpara
   Escreval()
   Escreval("________________________________")
fimprocedimento

inicio
   // PASSO IMPORTANTE: Inicializar o vetor como vazio
   Para i <- 1 ate 10 faca
      B[i] <- ""
   fimpara

   Repita
      limpatela
      mostrarfileira()
      Escreva("Reservar cadeira B: ")
      leia(cad)

      // Validação para não travar se digitarem um número maior que 10
      Se (cad < 1) ou (cad > 10) entao
         Escreval("Erro: Cadeira inexistente!")
      Senao
         Se (B[cad] = "") entao
            B[cad] <- "X"  // <-- AQUI ESTAVA O ERRO: Agora estamos ocupando o lugar!
            Escreval("Cadeira B", cad, " reservada com sucesso!")
         senao
            Escreval("Erro: Cadeira B", cad, " já está ocupada!")
         fimse
      fimse

      Escreva("Deseja reservar outro lugar? [S/N] ")
      leia(r)
   ate (r = "N") ou (r = "n")
fimalgoritmo