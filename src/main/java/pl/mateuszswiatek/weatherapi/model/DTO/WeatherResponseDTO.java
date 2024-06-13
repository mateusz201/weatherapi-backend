package pl.mateuszswiatek.weatherapi.model.DTO;

import lombok.Data;

@Data
public class WeatherResponseDTO {
    private ForecastResponseDTO forecast;
}