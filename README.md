
<div align="center">
  <img src="https://github.com/OlaLeonardoAmaral/CertificacaoNLW/assets/86934921/e9ff2adc-901f-49d1-84f7-feae72a11e5f" style="height: 55px; width: auto;">
</div>

<h1 align="center">
  NLW Expert · Trilha Java
</h1>

<p align="center">
  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen"/>
  <img alt="Java" src="https://img.shields.io/badge/Java-17-blue"/>
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-2.7-brightgreen"/>
  <img alt="PostgreSQL" src="https://img.shields.io/badge/PostgreSQL-13.0-blue"/>
  <img alt="Docker" src="https://img.shields.io/badge/Docker-Compose-blue"/>
</p>

<p align="center">
  Este projeto foi desenvolvido durante a 14ª edição da <a href="https://rocketseat.com.br">Next Level Week</a> (NLW Expert), com foco na construção de uma API em Java, utilizando Spring Boot para facilitar a preparação para certificações na área de tecnologia. Durante o desenvolvimento, foram aplicados conceitos de arquitetura sólida (SOLID), integração com banco de dados usando PostgreSQL e containerização com Docker.
</p>

---

## 🚀 Tecnologias Utilizadas

<div align="center">
  <img align="center" alt="Java" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
  <img align="center" alt="Spring Boot" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg">
  <img align="center" alt="PostgreSQL" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg">
  <img align="center" alt="Docker" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg">
  <img align="center" alt="Hibernate" height="40" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/hibernate/hibernate-original.svg">
</div>

---

## 📖 Descrição

Este projeto é uma API voltada para a gestão de questões relacionadas a certificações tecnológicas. O usuário pode escolher uma tecnologia e responder a uma série de perguntas que simulam uma certificação. Utilizando **Spring Boot**, **PostgreSQL** e **Docker**, a aplicação também foca em princípios de **SOLID** e práticas de **Lambda** e **debug avançado** para otimizar a performance e a clareza do código.

### Funcionalidades:
- **Verificação de Certificação**: Verifica se o estudante já obteve uma certificação anterior.
- **Banco de Questões**: Retorna um conjunto de perguntas sobre a tecnologia escolhida.
- **Envio de Respostas**: Permite que os usuários respondam às questões e obtenham a pontuação.
- **Ranking**: Exibe os 10 melhores usuários com base nas pontuações.

---

## 🔥 Endpoints

| Método | Endpoint                             | Descrição                                                |
|--------|--------------------------------------|----------------------------------------------------------|
| POST   | `/students/verifyIfHasCertification`  | Verifica se o estudante já possui certificação.           |
| GET    | `/questions/technology/{technology}`  | Retorna questões de uma determinada tecnologia.           |
| POST   | `/students/certification/answer`      | Envia as respostas das questões de certificação.          |
| GET    | `/ranking/top10`                      | Retorna o top 10 dos usuários com as maiores pontuações.  |

---

## 📚 Aprendizados

Durante o desenvolvimento deste projeto, adquiri experiência prática com:
- **Spring Boot**: Configuração avançada e otimização de APIs RESTful.
- **Banco de Dados**: Integração com **PostgreSQL** utilizando **Spring Data JPA** e **Hibernate ORM** para persistência eficiente dos dados.
- **Docker Compose**: Containerização do ambiente de desenvolvimento e configuração automatizada.
- **SOLID e Lambda**: Aplicação de princípios de design para manter o código escalável e de fácil manutenção.
- **Debug Avançado**: Uso de técnicas de debugging para solucionar problemas de lógica e performance.

---

## 🏆 Resultados

A aplicação gerou um ambiente interativo e dinâmico, facilitando a preparação de usuários para certificações. O sistema de ranking engaja os participantes, e a flexibilidade na escolha das tecnologias testadas torna o projeto versátil para diversas áreas.
