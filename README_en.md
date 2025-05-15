# 🗺️ VoyAgent - AI Travel Planner & Autonomous Agent (Under Construction...)

<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=19&pause=1000&color=4BA1F7&center=true&width=800&lines=Hi~VoyAgent%2C+Empower+your+journey+with+AI+autonomous+planning~" alt="Typing SVG" /></a>

## 🗺️ Project Introduction

**VoyAgent** is an AI-powered travel planning platform that leverages large language models and autonomous agents to help users create personalized travel plans through interactive conversations.
Built with **Spring Boot 3 + Spring AI + LangChain4j**, it integrates the ReAct agent architecture and MCP protocol, enabling autonomous reasoning, web searching, data scraping, and PDF report generation for end-to-end AI travel planning experiences.

## ✨ Core Features

* **AI Travel Assistant Dialogue System**: Supports multi-turn conversations to understand user preferences and dynamically generate trip itineraries.
* **Autonomous Decision-Making Agent (VoyAgent)**: Automatically searches flight/hotel/attraction/weather data, reasons step-by-step, and generates comprehensive travel plans.
* **Multi-modal Tool Integration**: Encapsulates tools for web scraping, PDF generation, map services, weather forecasts, image retrieval, and more.
* **Knowledge Retrieval & Memory Management**: Employs RAG architecture and vector databases to enhance AI memory and retrieval capabilities.
* **PDF Itinerary Export**: Automatically generates standardized travel plan PDFs, supporting one-click download.

## 🛠️ Tech Stack

| Module                       | Technologies                                       |
| ---------------------------- | -------------------------------------------------- |
| **Core Framework**           | Java 21, Spring Boot 3, Spring AI, LangChain4j     |
| **LLM Integration**          | Ollama, BaiLian AI Platform                        |
| **Agent Architecture**       | ReAct Agent, Tool Calling, MCP Protocol            |
| **Knowledge Retrieval**      | RAG + PGVector                                     |
| **Tool Services**            | SearchAPI, Maps API, Weather API, Jsoup, iText PDF |
| **Performance & Deployment** | Kryo, Serverless, Knife4j API Docs                 |

## 💡 Technical Highlights

* Built **autonomous ReAct chain agent** capable of thinking, acting, and observing, enabling task automation and decision making.
* Integrated **RAG + vector database**, enhancing trip planning with knowledge-based recommendations and rapid content recall.
* Implemented **Tool Calling orchestration**, enabling automatic parameter filling and seamless interaction with multiple external services.
* Deployed as **serverless functions**, combined with Kryo serialization, ensuring elastic scaling and high-performance response.
* Fully integrated **Knife4j API documentation**, improving development collaboration efficiency.

## 🚀 Prerequisites

* JDK 21
* Spring Boot 3.x
* Redis 6.0+
* MySQL 8.0+
* Maven 3.8+
* Ollama (optional for local model deployment)

## 🧑‍💻 Local Development

### 1. Clone the repository

```bash
git clone https://github.com/Voyager0587/VoyAgent.git
cd VoyAgent
```

### 2. Configure the database

```sql
CREATE DATABASE voyagent_db;
```

Modify `src/main/resources/application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/voyagent_db
    username: your_username
    password: your_password
```

### 3. Configure Redis

```yaml
spring:
  redis:
    host: localhost
    port: 6379
```

### 4. Run the application

```bash
mvn spring-boot:run
```

### 5. Access API documentation

[http://localhost:8080/doc.html](http://localhost:8080/doc.html)

## 🏗️ Deployment Guide

### Quick Docker deployment

```bash
docker build -t voyagent-backend .
docker run -d -p 8080:8080 voyagent-backend
```

## ✅ Testing

```bash
mvn test
```

## 🤝 Contribution Guide

We welcome contributions to VoyAgent:

1. Fork this repository.
2. Create a new feature branch.
3. Submit a pull request.

## 📜 License

Licensed under the [MIT License](LICENSE). Free to use, modify, and distribute.

## 👨‍💻 Developers

* **Voyager0587** - \[[GitHub](https://github.com/Voyager0587)]
* **Other Contributors** - Thanks to everyone who contributed!

