algoritmo "semnome"
var
J1,J2:inteiro
inicio
Escreval(" __________________________")
Escreval(" Jogo de Jokempo")
Escreval(" __________________________")
Escreval("Jogador 1 escolha (1)Pedra, (2)Papel,(3)Tesoura")
Leia(J1)
Escreval("Jogador 2 escolha (1)Pedra, (2)Papel,(3)Tesoura")
Leia(J2)
se (J1 = J2) entao
   Escreval("Jogo empatado")
senao
   se (J1 =1 ) e (J2=2) entao
      Escreval("Jogador 2 venceu")
   senao
      se (J1 =2 ) e (J2=3) entao
         Escreval("Jogador 2 venceu")
      senao
         se (J1 =3 ) e (J2=1) entao
            Escreval("Jogador 2 venceu")
         senao
            se (J1 =1 ) e (J2=3) entao
               Escreval("Jogador 1 venceu")
            senao
               se (J1 =2 ) e (J2=1) entao
                  Escreval("Jogador 1 venceu")
               senao
                  se (J1 =3 ) e (J2=2) entao
                     Escreval("Jogador 1 venceu")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
fimse
fimalgoritmo
