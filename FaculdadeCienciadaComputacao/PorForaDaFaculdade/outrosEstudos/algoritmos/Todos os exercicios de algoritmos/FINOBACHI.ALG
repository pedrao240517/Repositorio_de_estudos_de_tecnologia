algoritmo "finobachi"
Var
  A, B, Aux, I, Termos : Inteiro
Inicio
  A <- 0
  B <- 1
  Escreva("Quantos termos você quer?")
  Leia(Termos)

  Para I de 1 ate Termos faca
    Escreva(A)  //Ele mostra o número atual.
    Aux <- A + B //Ele calcula quem será o próximo número da fila e guarda no
    A <- B
    B <- Aux
  FimPara
fimalgoritmo