algoritmo "numerador de a 10 com impares"
var
   C, V, N,I,SM: inteiro // Adicionei 'N' para ler o número sem estragar o contador 'V'
inicio
   C <- 0
   Para V <- 1 ate 6 faca
      Escreva(V, "- Digite um número: ")
      leia(N) // Lemos em N para preservar o contador do Para

      Se (N >= 1) e (N <= 10) entao
         C <- C + 1
         // Removi o 'Escreva(C)' que estava aqui e causava o "6" grudado
      fimse
      se (N% 2 =1) entao
      I <- I + 1
      SM <- SM + N
      fimse
   fimpara

   Escreval("") // Apenas para pular uma linha antes do resultado
   Escreval("Ao todo foram ", C, " valores entre 1 e 10")
   Escreval("Ao todo foram ", I, " números impares")
   Escreval("A soma de número impares é", SM)
fimalgoritmo