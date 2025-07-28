Smart Resume Analyzer
Hey! This is my Spring Boot backend project where I built a simple API that checks resumes and gives a score (just random for now). I made this project to practice REST APIs, file upload logic, and cloud deployment.

🚀 What’s inside this project?
You can upload a resume (.pdf or .docx) and get a random score (0–100).
It’s a Spring Boot REST API, so easy to connect with any frontend (like React).
I enabled CORS so React/Angular can directly talk to this backend.
It’s live! I deployed it on Render (free hosting).

📂 Folder Setup (In simple words)
This is how I arranged my files:

css
Copy
Edit
├── src
│   ├── main
│   │   ├── java/com/example/demo
│   │   │   ├── DemoApplication.java   (Main starting point)
│   │   │   ├── ResumeController.java  (All API logic is here)
│   │   │   ├── ResumeRepository.java
│   │   │   ├── SecurityConfig.java
│   │   └── resources/application.properties
│   └── test
├── pom.xml   (Dependencies file)
├── Procfile  (For Render Deployment)
└── README.md
🔑 How to Use the API?
1. Check if backend is running
Open this in browser:

bash
Copy
Edit
https://resume-backend-9wos.onrender.com/api/
You’ll see:

arduino
Copy
Edit
Backend is running!
2. Upload a Resume
Send a POST request here:

bash
Copy
Edit
https://resume-backend-9wos.onrender.com/api/upload
Add a form-data field: file (your resume file).

Response looks like this:

json
Copy
Edit
{
  "fileName": "JohnDoeResume.pdf",
  "score": 85
}
🛠️ Tech I Used
Java + Spring Boot for backend.

Maven for building the project.

Render for free deployment.

GitHub for version control.

💡 My Future Plans
Add AI/ML to actually analyze keywords in resumes.

Create a React dashboard that connects to this backend.

Automate everything using CI/CD pipelines.

👤 About Me
I’m Sai Nikhitha. I built this project to improve my backend + cloud skills.
https://github.com/sainikhitha1506
