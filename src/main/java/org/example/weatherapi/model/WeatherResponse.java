package org.example.weatherapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class WeatherResponse {

    private double temperature;
    private String description;
    private int humidity;
    private double windSpeed;

}
