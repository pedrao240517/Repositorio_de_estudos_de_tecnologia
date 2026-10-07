algoritmo "DEPENDENTESDEUMFUNCIONÁRIO"
var
     nome:caractere
     sal,nsal:real
     dep:inteiro
inicio
      Escreva("Qual o nome do funcionário? ")
      Leia(nome)
      Escreva("Qual o salário do funcionário? ")
      Leia(sal)
      Escreva("Qual a quantidade de dependentes? ")
      Leia(dep)
      Escolha dep
              Caso 0
                   nsal  <- sal + (sal*5/100)
              Caso 1,2,3
                   nsal  <- sal + (sal*10/100)
              Caso 4,5,6
                   nsal  <- sal + (sal*15/100)
              Caso 7,8,9
                   nsal  <- sal + (sal*20/100)
              outrocaso
                   nsal  <- sal + (sal*25/100)
      fimescolha
      Escreval("O novo sálario vai ser igual a R$",nsal," reais.")
fimalgoritmo
