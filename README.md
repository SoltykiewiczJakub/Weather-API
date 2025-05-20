# 🌦️ Weather API - Spring Boot Application

This is a simple Spring Boot application that fetches current weather data from the [OpenWeatherMap API](https://openweathermap.org/api). It exposes a RESTful endpoint where you can query weather data for a given city.

## 🔧 Technologies

- Java 17+
- Spring Boot
- Spring Web
- RestTemplate
- OpenWeatherMap API

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/SoltykiewiczJakub/Weather-API.git
cd Weather-API

```
### 2. Build and run the application
Using Maven:
```bash
./mvn spring-boot:run
```
Or run the main class WeatherApiAplication from your IDE.

### 3. API Endpoint
Request
```bash
GET /weather?city={cityName}
```
Example
```bash
Get http://localhost:8080/weather?city=Warsaw
```
