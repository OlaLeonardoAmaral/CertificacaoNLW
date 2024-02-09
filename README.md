<div align="center">
  <img src="https://github.com/OlaLeonardoAmaral/CertificacaoNLW/assets/86934921/e9ff2adc-901f-49d1-84f7-feae72a11e5f" style="height: 55px; width: auto;">
</div>

<h1 align="center">
  NLW Expert · Trilha: Java
</h1>


<div>
  <p align="left">
  Este projeto consiste na criação de uma API com SpringBoot, fornecendo acesso a uma variedade de questões relacionadas a uma tecnologia escolhida pelo usuario para facilitar a preparação para a certificação na área selecionada.
  </p>
  <p>
      Orientado e conduzido por
    <a href="www.youtube.com/@DanieleLeao">
      Daniele Leão
    </a>, educadora da Rocketseat.
  </p>
</div>

---
<h3 align="center">
  Tecnologias utilizadas
</h3>
<div align="center">
  <img align="center" alt="Leo-HTML" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg">
  <img align="center" alt="Leo-CSS" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg">
  <img align="center" alt="Leo-Js" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postgresql/postgresql-original.svg">
  <img align="center" alt="Leo-Js" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/docker/docker-original.svg">
</div>  

---

## Requisitos
- <a href="https://efficient-sloth-d85.notion.site/Instalando-Java-17-a6636205fb13442d86998dda72710fdc">Java 17</a>
- <a href="https://efficient-sloth-d85.notion.site/Maven-4b297322549040f1ad2bf61d6080dd0a">Maven</a>
- <a href="https://efficient-sloth-d85.notion.site/Instalando-Docker-e-Docker-Compose-7953729d22554795b50033c4c19eae70">Docker</a>

## HTTP


### POST `/students/verifyIfHasCertification`

Verifica se o estudante já tem uma certificação.

#### Request body

```json
{
  "email": "testando123@hotmail.com",
  "technology": "JAVA"
}
```

#### Response body

```json
{
  "message": "Usuário não pode fazer a prova"
}

OR

{
  "message": "Usuário pode fazer a prova"
}

```

### GET `/questions/technology/{technology}`

Retorna as questões e alternativas de uma determinada tecnologia.

#### Response body

```json

[
  {
    "id": "c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66",
    "technology": "JAVA",
    "description": "Como criar uma classe em Java?",
    "alternatives": [
      {
        "id": "bafdf631-6edf-482a-bda9-7dce1efb1890",
        "description": "Usando a palavra-chave \"class\""
      },
      {
        "id": "98f6891b-5f14-4b8e-bb87-46456a2610d4",
        "description": "Definindo uma interface em Java"
      },
      {
        "id": "993a7d37-62a0-4040-810d-d667e3f7a891",
        "description": "Utilizando métodos estáticos"
      },
      {
        "id": "98bf8d0f-dc1c-4db0-b09c-94246089aa02",
        "description": "Criando um construtor padrão"
      }
    ]
  },
  {...},
  {...}
]
```


### POST `/students/certification/answer`

Onde você ira enviar as suas respostas para cada questão de uma determinada tecnologia.

#### Request Body

```json
{
  "email": "testando123@hotmail.com",
  "technology": "JAVA",
  "questionAndAnswers": [
      {
        "questionID": "c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66",
        "alternativeID": "bafdf631-6edf-482a-bda9-7dce1efb1890"
      },
      {
        "questionID": "b0ec9e6b-721c-43c7-9432-4d0b6eb15b01",
        "alternativeID": "f8e6e9b3-199b-4f0d-97ce-7e5bdc080da9"
      },
      {
        "questionID": "f85e9434-1711-4e02-9f9e-7831aa5c743a",
        "alternativeID": "d3e51a56-9b97-4bb8-9827-8bcf89f4b276"
      }
    ]
}
```


#### Response body

```json
{
  "id": "2ff73dfc-e680-4bdb-9801-6b81a9b308a7",
  "technology": "JAVA",
  "grade": 3,
  "studentID": "33617864-15ac-4a8c-91a2-55b3c316928d",
  "studentEntity": null,
  "answersCertificationsEntity": [
    {
      "id": "65c00036-9f89-4fd6-b734-1fe69e18813e",
      "certificationID": "2ff73dfc-e680-4bdb-9801-6b81a9b308a7",
      "studentID": null,
      "studentEntity": null,
      "questionID": "c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66",
      "answerID": "bafdf631-6edf-482a-bda9-7dce1efb1890",
      "createdAt": "2024-02-09T08:42:12.002493",
      "correct": true
    },
    {
      "id": "7a64ae06-3140-45b1-abf0-eabda93fb9fa",
      "certificationID": "2ff73dfc-e680-4bdb-9801-6b81a9b308a7",
      "studentID": null,
      "studentEntity": null,
      "questionID": "b0ec9e6b-721c-43c7-9432-4d0b6eb15b01",
      "answerID": "f8e6e9b3-199b-4f0d-97ce-7e5bdc080da9",
      "createdAt": "2024-02-09T08:42:12.006072",
      "correct": true
    },
    {
      "id": "2243b29d-f3e9-48ed-b3a7-f4a4c00f2cc0",
      "certificationID": "2ff73dfc-e680-4bdb-9801-6b81a9b308a7",
      "studentID": null,
      "studentEntity": null,
      "questionID": "f85e9434-1711-4e02-9f9e-7831aa5c743a",
      "answerID": "d3e51a56-9b97-4bb8-9827-8bcf89f4b276",
      "createdAt": "2024-02-09T08:42:12.006736",
      "correct": true
    }
  ],
  "createdAt": "2024-02-09T08:42:11.993524"
}

```


### GET `/ranking/top10`

Retorna o top 10 de usuarios com as maiores notas.

#### Response body

```json
[
  {
    "id": "a407151a-c6a2-4922-b054-92685a992cef",
    "technology": "JAVA",
    "grade": 3,
    "studentID": "e3096ba8-bf8f-478f-9e74-5ea5ab09f5a3",
    "studentEntity": {
      "id": "e3096ba8-bf8f-478f-9e74-5ea5ab09f5a3",
      "email": "amaral3442@codes.com",
      "createdAt": "2024-02-08T11:49:20.33859"
    },
    "answersCertificationsEntity": [],
    "createdAt": "2024-02-08T11:49:20.350954"
  },
  {
    "id": "2ff73dfc-e680-4bdb-9801-6b81a9b308a7",
    "technology": "JAVA",
    "grade": 3,
    "studentID": "33617864-15ac-4a8c-91a2-55b3c316928d",
    "studentEntity": {
      "id": "33617864-15ac-4a8c-91a2-55b3c316928d",
      "email": "testando123@hotmail.com",
      "createdAt": "2024-02-09T08:42:11.978983"
    },
    "answersCertificationsEntity": [],
    "createdAt": "2024-02-09T08:42:11.993524"
  },
  {
    "id": "1fce7030-d5f9-4338-9262-0b8a69d7c88f",
    "technology": "JAVA",
    "grade": 2,
    "studentID": "045ce8e1-1c9d-40af-ab56-354bf58b9d13",
    "studentEntity": {
      "id": "045ce8e1-1c9d-40af-ab56-354bf58b9d13",
      "email": "lucas3442@teste.com",
      "createdAt": "2024-02-07T23:44:38.740027"
    },
    "answersCertificationsEntity": [],
    "createdAt": "2024-02-07T23:44:38.750305"
  }
]

```



