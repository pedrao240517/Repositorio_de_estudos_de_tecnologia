algoritmo "cadastro de notas"
var
   gabarito: vetor[1..5] de caractere
   prova: vetor[1..5] de caractere
   nomes: vetor[1..3] de caractere
   notas: vetor[1..3] de inteiro
   i, j, notaAluno: inteiro
inicio
   Escreval("--- CADASTRO DO GABARITO OFICIAL ---")
   para i <- 1 ate 5 faca
      Escreva("Questão ", i, ": ")
      Leia(gabarito[i])
   fimpara
   Limpatela

   // 2. CADASTRO DOS ALUNOS E SUAS RESPOSTAS
   para i <- 1 ate 3 faca
      Escreval("--- ALUNO ", i, " ---")
      Escreva("Nome: ")
      Leia(nomes[i])

      notaAluno <- 0
      para j <- 1 ate 5 faca
         Escreva("Resposta da questão ", j, ": ")
         Leia(prova[j])
         se (maiusc(prova[j]) = maiusc(gabarito[j])) entao
            notaAluno <- notaAluno + 2
         fimse
      fimpara

      notas[i] <- notaAluno // Guarda a nota final deste aluno no vetor de notas
      Limpatela
   fimpara

   // 3. TABELA FINAL DE RESULTADOS
   Escreval("---------------------------------------")
   Escreval("         RESULTADO FINAL               ")
   Escreval("---------------------------------------")
   Escreval("NOME             NOTA      SITUAÇÃO    ")

   para i <- 1 ate 3 faca
      Escreva(nomes[i]:15, notas[i]:5)

      se (notas[i] >= 6) entao
         Escreval("      APROVADO")
      senao
         Escreval("      REPROVADO")
      fimse
   fimpara
fimalgoritmo