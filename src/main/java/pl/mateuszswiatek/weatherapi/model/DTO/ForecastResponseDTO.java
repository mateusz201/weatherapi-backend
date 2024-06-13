package pl.mateuszswiatek.weatherapi.model.DTO;

import lombok.Data;

import java.util.List;

@Data
public class ForecastResponseDTO {
    private List<ForecastDayResponseDTO> forecastDays;
}