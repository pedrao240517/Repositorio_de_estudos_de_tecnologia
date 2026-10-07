# A web e seus protocolos de comunicação
## Noção básica sobre a internet
### Objetivos 
- Entender o que é a internet e como funciona
- O que é HTTP e como funciona
- O que é nome de domínio e como funciona
- O que é hospedagem
- O que é DNS e como funciona
- O que é um navegador e como funciona

---
1) O protocolo TCP/IP

O que é um protocolo? -> conjunto de regras para os computadores comunicarem entre si 
 O TCP/IP é o conjunto fundamental de protocolos de comunicação que permite a transferência de dados na internet e em redes de computadores. Ele define regras para formatar, endereçar, transmitir e receber dados. Composto pelo protocolo de controle de transmissão (TCP) e protocolo de internet (IP), funciona em camadas para garantir a entrega segura e o roteamento eficiente

- regras do IP

-Indentifica cada dispossitivo na rede(númerico).
-divide a informações em pacotes de bytes com origem e destino (computação em pacotes).

- Regras do TCP 
Entrega Ordenada: O TCP numera cada pacote (segmento) para garantir que sejam remontados na ordem correta, mesmo que cheguem fora de sequência.

Controle de Fluxo e Erros: Gerencia a velocidade de transmissão para não sobrecarregar o receptor e reenvia pacotes perdidos ou corrompidos.

Full-Duplex: Permite que dados fluam simultaneamente nas duas direções entre o emissor e o receptor.

Além desses protocolos principais, existe uma ampla gama de outras tecnologias e protocolos usados ​​para viabilizar a comunicação e a troca de dados pela internet, incluindo o Sistema de Nomes de Domínio (DNS), o Protocolo de Transferência de Hipertexto (HTTP) e o protocolo Secure Sockets Layer/Transport Layer Security (SSL/TLS)

2) O tráfego da internet
 Nessa parte, vamos simplificar o processo pois essa parte se reserva exclusivamente para a máteria de redes de computadores, mas resumindo, a internet e um enorme conjunto de cabos que passam entre os continentes e cidades e com isso é distribuido no final pelos IPS(Provedores de serviços de internet) e enviado para servidores DNS para a tradução de domínio para IP.

 3)Entendendo endereços IP e nomes de domínio

Endereços IP e nomes de domínio são conceitos importantes para entender ao trabalhar com a internet.

Um endereço IP é um identificador único atribuído a cada dispositivo em uma rede. Ele é usado para encaminhar dados para o destino correto, garantindo que as informações sejam enviadas ao destinatário pretendido. Os endereços IP são normalmente representados como uma série de quatro números separados por pontos, como "192.168.1.1".

Os nomes de domínio, por outro lado, são nomes legíveis para humanos usados ​​para identificar sites e outros recursos da internet. Normalmente, são compostos por duas ou mais partes, separadas por pontos. Por exemplo, “google.com” é um nome de domínio. Os nomes de domínio são traduzidos em endereços IP usando o Sistema de Nomes de Domínio (DNS).

O DNS é uma parte essencial da infraestrutura da internet, responsável por traduzir nomes de domínio em endereços IP. Quando você digita um nome de domínio no seu navegador, seu computador envia uma consulta DNS para um servidor DNS, que retorna o endereço IP correspondente. Seu computador então usa esse endereço IP para se conectar ao site ou outro recurso que você solicitou.


no futuro continuar.