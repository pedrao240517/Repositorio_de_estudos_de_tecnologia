algoritmo "semnome"
var
   ano: inteiro
inicio
   escreva("Digite o ano que deseja consultar: ")
   leia(ano)

   // A lógica principal:
   // 1. O ano deve ser divisível por 4
   // 2. MAS não pode ser divisível por 100
   // 3. A MENOS que seja divisível por 400

   se ((ano % 4 = 0) e (ano % 100 <> 0)) ou (ano % 400 = 0) entao
      escreval("O ano ", ano, " é bissexto.")
   senao
      escreval("O ano ", ano, " não é bissexto.")
   fimse
fimalgoritmo
