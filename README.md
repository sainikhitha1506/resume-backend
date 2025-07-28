Hey! This is my backend project using Spring Boot.  
The idea is very simple – you can upload your resume (PDF or DOCX), and the API will give you a random score (0-100).  
I built this project to learn backend APIs, file upload logic, and how to deploy projects to the cloud.

---

What this project can do:
1. Upload resumes and get a score.
2. Check if the backend is running.
3. Can connect easily with any frontend like React.
4. I deployed this on Render, so it is live.

---

How I arranged my files:
- DemoApplication.java – The main starting file for Spring Boot.
- ResumeController.java – All the API code is here (upload, test API).
- ResumeRepository.java – Repository for future database connections.
- SecurityConfig.java – To manage security and allow frontend access.
- application.properties – Settings for the project.

---

How to test the API:
1. Open this link in the browser to check if the backend is running:  
   https://resume-backend-9wos.onrender.com/api/  
   It will show: **Backend is running!**

2. To upload a resume:  
   - Make a POST request to: https://resume-backend-9wos.onrender.com/api/upload  
   - Add form-data with key "file" and upload your resume file.  
   - You will get a response like:  
     {
       "fileName": "YourResume.pdf",
       "score": 85
     }

---

Tech I used:
- Java and Spring Boot for backend.
- Maven for building the project.
- Render for deployment.
- GitHub for version control.

---

What I want to add later:
- Connect this with a React dashboard.
- Add AI/ML logic to check keywords in resumes.
- Add CI/CD pipelines for automatic deployment.

---

About me:
I am Sai Nikhitha. I built this project to practice my backend and cloud skills.
