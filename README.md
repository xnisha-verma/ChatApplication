# 💬 Real-Time Chat Application

A real-time web chat application built using **Spring Boot**, **WebSockets**, **STOMP**, and **Thymeleaf**.  
This application enables multiple users to communicate instantly through a shared chat interface.

---

## 🚀 Live Demo

🌐 https://chatapplication-3-0ixj.onrender.com

> Note: Since the app is hosted on a **free Render instance**, it may take **30–50 seconds to wake up** after inactivity.

---

## 📌 Features

- ⚡ Real-time messaging using **WebSockets**
- 📡 Communication using **STOMP messaging protocol**
- 🧠 Backend powered by **Spring Boot**
- 🎨 Dynamic frontend using **Thymeleaf**
- 🌌 Modern UI with animated **Aurora background**
- ❄ Snowfall and star animations
- 👥 Multi-user chat support
- 📦 Dockerized deployment
- ☁ Cloud deployment using **Render**

---

## 🛠 Tech Stack

### Backend
- Java
- Spring Boot
- Spring WebSocket
- STOMP Protocol

### Frontend
- HTML
- CSS
- JavaScript
- Thymeleaf

### Deployment
- Render Cloud

---

## ⚙️ How It Works

1. A user opens the chat page in their browser.
2. The frontend establishes a **WebSocket connection** with the server.
3. Messages are sent to the backend endpoint:
    /app/sendMessage
4. The Spring Boot server processes the message.
5. The message is broadcast to all connected users through:

6. Every connected client instantly receives the new message.

---

## 🧪 Running the Project Locally

Clone the repository:

```bash
git clone https://github.com/xnisha-verma/ChatApplication.git
cd ChatApplication/App
./mvnw spring-boot:run
http://localhost:8080

