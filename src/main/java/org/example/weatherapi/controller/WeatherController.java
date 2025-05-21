package org.example.weatherapi.controller;

import org.example.weatherapi.model.WeatherResponse;
import org.example.weatherapi.service.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public String getWeather(@RequestParam(required = false) String city, Model model) {
        if (city != null && !city.isBlank()) {
            try {
                WeatherResponse weather = weatherService.getWeather(city);
                model.addAttribute("weather", weather);
                model.addAttribute("city", city);
            } catch (Exception e) {
                model.addAttribute("error", "Could not fetch weather for: " + city);
            }
        }
        return "weather";
    }
}
