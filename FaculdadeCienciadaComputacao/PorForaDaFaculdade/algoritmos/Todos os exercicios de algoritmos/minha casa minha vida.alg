algoritmo "Emprestimo minha casa minha vida"
var
     valor, salario, P:real
     anos,meses:inteiro
inicio
      Escreva("Qual o valor da casa? ")
      Leia(valor)
      Escreva("Qual o seu sálario? ")
      Leia(salario)
      Escreva("Em quanto anos pretende pagar esse emprestimo? ")
      Leia(anos)
      meses <- (anos*12)
      P <- (valor/meses)
      se ( P >  salario * 0.30) entao
         Escreva("Emprestimo Recusado.O valor da parcela ultrapassa a 30% do salário")
      senao
           Escreva("Emprestimo aceito. O valor da parcela ficou em ",P:5:2," reais")
      fimse
fimalgoritmo

