🧑‍🎓 Student Task Manager (SPA)

A simple Full Stack Web Development project built using Spring Boot (Backend) and HTML, CSS, JavaScript (Frontend).
This application helps students manage their daily homework/tasks in a Single Page Application (SPA) without page refresh.

📌 Project Theme

Web Development (Full Stack)

🎯 Project Goal

Build a simple Single Page Application (SPA) to track student homework tasks.

✨ Features

➕ Add a new task using input box

📋 View all tasks in a list

🔄 No page refresh (SPA behavior)

💾 Tasks stored in a local .json file

🌐 REST API using Spring Boot

🛠️ Tech Stack
Backend

Java

Spring Boot

REST Controller

JSON file storage (tasks.json)

Frontend

HTML

CSS

JavaScript (Fetch API)

📂 Project Structure
taskmanager/
│── src/main/java/com/dhruv/taskmanager
│   ├── controller
│   │   └── TaskController.java
│   ├── model
│   │   └── Task.java
│   └── StudentTaskManagerApplication.java
│
│── src/main/resources
│   ├── static
│   │   └── index.html
│   ├── application.properties
│
│── tasks.json
│── pom.xml
│── README.md

🔗 API Endpoints
➕ Add Task
POST /tasks


Request Body (JSON):

{
  "title": "Complete DBMS Assignment"
}

📋 Get All Tasks
GET /tasks


Response (JSON):

[
  {
    "id": 1,
    "title": "Spring Boot"
  },
  {
    "id": 2,
    "title": "Revise Java Collections"
  }
]

🖥️ Frontend UI

Input box to enter task

Add button to submit task

Task list updates instantly without refreshing the page

▶️ How to Run the Project
Backend
mvn spring-boot:run


Server runs on:

http://localhost:8080

Frontend

Open in browser:

http://localhost:8080/index.html

📦 Storage

Tasks are stored in a local file:
📄 tasks.json

No external database required

🚀 Future Enhancements

Delete task

Mark task as completed

Use SQLite / MySQL

React frontend

👨‍💻 Author

Dhruv Dubey
B.Tech | Full Stack Java Developer
