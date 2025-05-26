# 🗺️ VoyAgent - AI 旅行规划大师 （施工中...）
> 简历要早了，本来打算搞完这个再搞简历的，提前搞了。。。

<a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=19&pause=1000&color=4BA1F7&center=true&width=800&lines=Hi~VoyAgent%EF%BC%8C%E6%8E%8C%E6%8F%A1AI%E8%87%AA%E4%B8%BB%E8%A7%84%E5%88%92%EF%BC%8C%E6%89%93%E9%80%A0%E4%BD%A0%E7%9A%84%E4%B8%AA%E6%80%A7%E8%A1%8C%E7%A8%8B~" alt="Typing SVG" /></a>

## 🗺️ 项目简介

**VoyAgent** 是一个基于大语言模型和自主智能体的 AI 旅行规划平台，致力于帮助用户通过对话自动生成个性化旅行方案。
项目基于 **Spring Boot 3 + Spring AI + LangChain4j**，结合 ReAct 智能体架构，集成多种工具与 MCP 协议，支持自主检索、自动推理与 PDF 生成，打造端到端的旅行 AI 应用。

## ✨ 核心功能

* **AI 旅行大师对话系统**：支持多轮对话，理解用户偏好，动态规划行程。
* **自主决策智能体 VoyAgent**：可自动检索航班/酒店/景点/天气数据，自主推理直到产出完整行程。
* **多模态工具调用**：封装网页抓取、PDF 生成、地图定位、天气服务、图片检索等。
* **知识检索与记忆管理**：基于 RAG 架构与向量知识库，增强 AI 记忆与信息召回能力。
* **行程文档导出**：自动生成标准化旅行计划 PDF 文档，支持一键下载。

## 🛠️ 技术架构

* **核心框架**：Java 21、Spring Boot 3、Spring AI、LangChain4j
* **大模型接入**：Ollama、百炼平台
* **智能体 Agent**：ReAct Agent、Tool Calling、MCP 协议
* **知识检索**：RAG + PGVector
* **工具封装**：SearchAPI、地图 API、天气 API、Jsoup、iText PDF
* **性能与部署**：Kryo、Serverless、Knife4j 接口文档

## 💡 技术亮点

* 基于 **ReAct 思维链模式** 构建自主规划 Agent，支持自主搜索、推理、执行，提升决策自动化程度。
* 集成 **RAG + 向量数据库**，结合知识库补充行程背景信息，快速召回精准内容。
* 使用 **Tool Calling 自动编排** 多类工具服务，支持复杂任务拆分与执行，减少用户手动查询成本 80%。
* 借助 **Serverless 函数化部署** 提升接口弹性扩展，结合 Kryo 序列化提升响应性能。
* 集成 **Knife4j 自动生成接口文档**，提升团队开发效率。

## 🚀 环境要求

* JDK 21
* Spring Boot 3.x
* Redis 6.0+
* MySQL 8.0+
* Maven 3.8+
* Ollama（本地大模型可选）

## 🧑‍💻 本地开发与运行

### 1. 克隆仓库

```bash
git clone https://github.com/Voyager0587/VoyAgent.git
cd VoyAgent
```

### 2. 配置数据库

```sql
CREATE DATABASE voyagent_db;
```

修改 `src/main/resources/application.yml`：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/voyagent_db
    username: your_username
    password: your_password
```

### 3. 配置 Redis

```yaml
spring:
  redis:
    host: localhost
    port: 6379
```

### 4. 启动应用

```bash
mvn spring-boot:run
```

### 5. 访问接口文档

[http://localhost:8080/doc.html](http://localhost:8080/doc.html)

## 🏗️ 部署指南

### Docker 快速部署

```bash
docker build -t voyagent-backend .
docker run -d -p 8080:8080 voyagent-backend
```

## ✅ 测试

```bash
mvn test
```

## 🤝 贡献指南

欢迎对 VoyAgent 项目贡献：

1. Fork 仓库
2. 创建新分支并修改
3. 提交 Pull Request

## 📜 许可证

基于 [MIT License](LICENSE) 开源，自由使用、修改与分发。

## 👨‍💻 开发者

* **Voyager0587** - \[[https://github.com/Voyager0587](https://github.com/Voyager0587)]
* **其他贡献者** - 感谢所有为项目贡献的人！
