algoritmo "parcelamento"
var
          Valor,Juros,Total,parcela:real
          parcelamento:inteiro
inicio
      Escreva("Quanto você vai pegar de parcelamento? ")
      Leia(valor)
      Juros <-(valor*20)/100
      Total <- (juros+valor)
      Escreva("Em quantas vezes você quer parcelar? ")
      Leia(parcelamento)
      parcela <- (total/parcelamento)
      Escreva("Vou pagar em",parcelamento," parcelas e cada parcela vai ficar",parcela," reais. ")
      
fimalgoritmo
