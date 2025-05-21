package org.example.weatherapi.model;


public class WeatherResponse {

    private double temperature;
    private String description;
    private int humidity;
    private double windSpeed;
    private String city;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Getter i Setter dla description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter i Setter dla humidity
    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    // Getter i Setter dla windSpeed
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    // Getter i Setter dla city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
