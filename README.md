🧑‍🎓 Student Task Manager (SPA)
# 1. Project Title & Goal
Student Task Manager is a simple full-stack Single Page Application (SPA) that allows students to add and view their daily homework/tasks without refreshing the page.

# 2. Setup Instructions
Prerequisites
Java 11+
Maven
Any browser (Chrome recommended)

# 3 Steps to Run the Project
Backend (Spring Boot) : mvn spring-boot:run

Backend server will start at:http://localhost:8080

Frontend
Open the application in browser:

http://localhost:8080/index.html

# 3. The Logic (How I Thought)
Why did you choose this approach?
I chose a Single Page Application (SPA) approach to provide a smooth user experience without page reloads.
Spring Boot was used to quickly build REST APIs, while HTML, CSS, and JavaScript (Fetch API) were used on the frontend for simplicity and clarity.

What was the hardest bug you faced, and how did you fix it?
The hardest issue was ensuring that tasks were updated on the UI instantly after adding a new task.
I fixed this by properly handling the Fetch API response and dynamically updating the task list using JavaScript without refreshing the page.

# 4. Output Screenshots
➕ Add a new task using input box
📋 View all tasks in a list
🔄 No page refresh (SPA behavior)
💾 Tasks stored in a local .json file



# 5. Future Improvements
If I had 2 more days, I would add:
Delete task functionality
Mark task as completed
Database integration (MySQL / SQLite)
Authentication (Login / Register)

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

#  API Endpoints
➕ Add Task
POST /tasks
