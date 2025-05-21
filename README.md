# 📋 Personal Task Manager API

Uma API RESTful para gerenciamento pessoal de tarefas em estilo Trello, com autenticação, persistência no MongoDB e executável via Docker.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- Spring Security + JWT
- MongoDB Atlas (ou local via Docker)
- Docker + Docker Compose
- Swagger para documentação

---

## 🔐 Autenticação

A autenticação é baseada em **JWT**. Após login, um token deve ser incluído no header das requisições:


---

## 📂 Estrutura de Entidades

### 👤 Usuário
```json
{
  "id": "user123",
  "name": "Kauan",
  "email": "kauan@email.com",
  "password": "<hashed>"
}
``` 

### 🧾 Board
```json
{
  "id": "board123",
  "title": "Projeto Final",
  "description": "Tarefas relacionadas ao projeto",
  "userId": "user123"
}
``` 

### 📋 List
```json
{
  "id": "list456",
  "title": "A Fazer",
  "boardId": "board123"
}
``` 

### ✅ Task
```json
{
  "id": "task789",
  "title": "Implementar autenticação",
  "description": "Criar login com JWT",
  "done": false,
  "listId": "list456"
}
``` 

---

## 📌 Endpoints

### 🔑 Autenticação

| Método   |     Rota       |                   Descrição  |
|:---------|:--------------:|-----------------------------:|
| POST     | /auth/register |     Cadastro de novo usuário |
| POST     |  /auth/login   | Login e geração de token JWT |
| GET      |    /auth/me    |  Retorna usuário autenticado |



### 📋 Boards
| Método   |     Rota      |                              Descrição       |
|:---------|:-------------:|---------------------------------------------:|
| POST     | /boards       |                            Criar novo quadro |
| GET      |    /boards    |                    Listar quadros do usuário |
| GET      | /boards/{id}  |                    Ver detalhes de um quadro |
| PUT      | /boards/{id}  |                   Atualizar título/descrição |
| DELETE   | /boards/{id}  | Deletar quadro (e listas/tarefas associadas) |

### 📄 Lists
| Método   |       Rota              |        Descrição       |
|:---------|:-----------------------:|-----------------------:|
| POST     | /boards/{boardId}/lists |            Criar lista | 
| GET      | /boards/{boardId}/lists |   Ver listas do quadro | 
| PUT      |       /lists/{id}       | Editar título da lista | 
| DELETE   |       /lists/{id}       |          Deletar lista | 

### ✅ Tasks
 | Método  |         Rota          |             Descrição   |
 |:--------|:---------------------:|------------------------:|
 | POST    | /lists/{listId}/tasks |            Criar tarefa |
 | GET     | /lists/{listId}/tasks | Listar tarefas da lista |
 | PUT     |      /tasks/{id}      |        Atualizar tarefa |
 | DELETE  |      /tasks/{id}      |          Deletar tarefa |


Desenvolvido por Kauan como projeto de estudo com Spring Boot.