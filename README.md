# Smart Resume Analyzer

An **AI-powered Spring Boot backend** that evaluates resumes and returns a score based on simulated logic. This project is designed to demonstrate **REST API development**, **file handling**, and **deployment skills**.

## 🚀 Features
- **Resume Upload API** – Upload resumes in `.pdf` or `.docx` format.
- **Dynamic Resume Scoring** – Generates a random score (0–100) for now (AI integration possible later).
- **Spring Boot Backend** – RESTful API built with Java and Spring Boot.
- **CORS Enabled** – Ready to integrate with any React/Angular frontend.
- **Cloud-Ready** – Deployed on Render.

---

## 📂 Project Structure
├── src
│ ├── main
│ │ ├── java/com/example/demo
│ │ │ ├── DemoApplication.java
│ │ │ ├── ResumeController.java
│ │ │ ├── ResumeRepository.java
│ │ │ ├── SecurityConfig.java
│ │ └── resources/application.properties
│ └── test
├── pom.xml
├── Procfile
└── README.md

yaml
Copy
Edit

---

## 🔑 API Endpoints

### 1. Test Backend
**GET** `https://resume-backend-9wos.onrender.com/api/`  
**Response:**
```json
"Backend is running!"
2. Upload Resume
POST https://resume-backend-9wos.onrender.com/api/upload
Form-data:

file: Upload your resume (PDF/DOCX).

Response:

json
Copy
Edit
{
  "fileName": "JohnDoeResume.pdf",
  "score": 85
}
🛠️ Tech Stack
Backend: Java, Spring Boot

Build Tool: Maven

Cloud Hosting: Render

Version Control: Git & GitHub

💡 Future Enhancements
Integrate AI/ML model for resume keyword analysis.

Connect with a React-based frontend dashboard.

Deploy with CI/CD pipelines.

👤 Author
Sai Nikhitha
