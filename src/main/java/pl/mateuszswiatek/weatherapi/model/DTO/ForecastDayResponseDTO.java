package pl.mateuszswiatek.weatherapi.model.DTO;

import lombok.Data;

@Data
public class ForecastDayResponseDTO {
    private String date;
    private DayResponseDTO day;
}
