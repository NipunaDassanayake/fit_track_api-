# FitTrack — Social Fitness + Learning Platform (Backend API)

FitTrack is a full-stack social fitness & learning platform.  
This repository contains the **Java Spring Boot backend API** that powers:

- Workout courses with lessons & quizzes  
- Course completion tracking and achievements  
- Social feed with posts, likes, comments, and shares  
- Follow/unfollow between users  
- Media uploads using Cloudinary

A React.js frontend consumes this API to provide the full user experience.

---

## ✨ Core Features

### 👤 Authentication & Users
- Secure authentication with **Spring Security + OAuth2**
- Role-based access control (e.g., USER, TRAINER, ADMIN)
- Protected REST endpoints and token-based authorization
- User profiles with bio, avatar, and achievements

### 🏋️ Courses, Lessons & Quizzes
- Create structured **workout courses** with multiple lessons
- Attach descriptions, media, and difficulty levels to lessons
- Add **quizzes** to verify understanding at the end of a course
- Track user progress (started, in progress, completed)

### 🏅 Achievements
- When a user passes a quiz / completes a course:
  - Automatically generate a **shareable achievement**
  - Display achievements on the user’s profile

### 📰 Social Feed
- Users can:
  - Create posts about routines, progress, or tips
  - Upload images/videos via **Cloudinary**
  - Like, comment, and share posts
- Follow/unfollow other users
- Personalized feed based on followed users

---

## 🛠 Tech Stack

**Backend**
- Java  
- Spring Boot  
- Spring Security + OAuth2  
- Spring Data JPA  
- MySQL

**Media**
- Cloudinary (images & videos)

- <img width="1860" height="863" alt="s1" src="https://github.com/user-attachments/assets/fed68e05-6d10-4b90-a41c-a79af5ba18b7" />
<img width="1908" height="878" alt="s5" src="https://github.com/user-attachments/assets/88d36366-a614-45bb-bed1-d75f11ad5b1f" />
<img width="1892" height="929" alt="s4" src="https://github.com/user-attachments/assets/49343920-36ff-4d5b-bd1e-17268320d58b" />
<img width="1905" height="881" alt="s3" src="https://github.com/user-attachments/assets/daa665ee-d502-4e2d-8883-b8d6744408f4" />
<img width="1912" height="1019" alt="s2" src="https://github.com/user-attachments/assets/ff11e3d4-755b-4060-9e92-62c74d52d880" />


---

## 📁 Project Structure (high-level)

```text
src/
  main/
    java/com/fittrack/...
      config/           # Security & application configuration
      controllers/      # REST controllers
      dto/              # Request/response DTOs
      entities/         # JPA entities
      repositories/     # Spring Data repositories
      services/         # Business logic
    resources/
      application.yml   # Application configuration<img width="1912" height="1019" alt="s2" src="https://github.com/user-attachments/assets/971e004e-823b-4945-9f18-7003ecb3b210" />









