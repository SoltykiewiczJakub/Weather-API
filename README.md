#  Weather API - Spring Boot Application

This is a simple Spring Boot application that fetches current weather data from the [OpenWeatherMap API](https://openweathermap.org/api). It exposes a RESTful endpoint where you can query weather data for a given city.

##  Technologies

- Java 21+
- Spring Boot
- Spring Web
- RestTemplate
- OpenWeatherMap API

---

## Getting Started

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

### 3. Create an Account and API Key
You need to create an account at [OpenWeather](https://openweathermap.org/) and generate an API key at [API Keys Dashboard](https://home.openweathermap.org/api_keys).

Then, add your API key to the `application.properties` file.

### 4. API Endpoint
Request:
```bash
GET /api/weather
```
Example:
```bash
Get http://localhost:8080/api/weather
```

