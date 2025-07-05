# 🔗 URL Shortener Service (Spring Boot)

This is a simple backend application that shortens long URLs and allows decoding them back. Built using **Java 17** and **Spring Boot**, it provides REST APIs for encoding and decoding URLs.

---

## 🚀 Features

- Encode long URLs into short, unique links
- Decode shortened URLs back to their original form
- Stateless and RESTful API design
- Easy to test using Postman

---

## 🧪 API Usage Guide (Postman)

Make sure the application is running at:  
**`http://localhost:8080`**

### 🔐 1. Encode a URL

- **Method:** `POST`  
- **Endpoint:** `/api/v1/shortener/encode`  
- **Full URL:** `http://localhost:8080/api/v1/shortener/encode`

#### Request Body (JSON):
```json
{
  "url": "https://www.youtube.com/feed/subscriptions"
}

#### Sample Response:
```json
{
  "shortenedUrl": "http://localhost:8080/abc123"
}


### 🔐 1. Decode a URL

- **Method:** `GET`  
- **Endpoint:** `/api/v1/shortener/decode`  
- **Full URL:** `http://localhost:8080/api/v1/shortener/decode`

#### Request Body (JSON):
```json
{
  "shortenedUrl": "http://localhost:8080/abc123"
}

#### Sample Response:
```json
{
  "url": "https://www.youtube.com/feed/subscriptions"
}
