# Projeto Full Stack com Docker: Spring Boot + React + MongoDB + MySQL

## 📌 Visão Geral

Esta é uma aplicação Full Stack formada por duas APIs conectadas uma ao MySQL e outra ao MongoDB, e um front-end feito em React para requisições do tipo POST direcionada às duas APIs.


- **Frontend** em React (porta `3000`)
- **Backend 1**: API em Spring Boot conectada ao MongoDB (porta `8090`)
- **Backend 2**: API em Spring Boot conectada ao MySQL (porta `8080`)
- **Banco de Dados**: MongoDB e MySQL

  Cada programa possui o seu container. As APIs também possuem seu Dockerfile.

  O arquivo docker-compose serve para a criação das imagens de uma vez, colocando-as na mesma network(rede) para que elas consigam se conectar umas as outras.

  Para rodar os containers é necessário navegar até a pasta de origem onde estarão os arquivos das APIs, do front -end e do docker-compose, e digitar o comando:
  
  **docker-compose up --build**

  Depois deste código funcionar, verifique se os containers estão ativos digitando:

  **docker ps**

  Caso aparecam todos os containers criados pelo docker-compose o projeto foi um sucesso!
  
  
