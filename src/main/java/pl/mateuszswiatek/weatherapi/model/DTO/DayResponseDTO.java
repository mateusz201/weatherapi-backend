package pl.mateuszswiatek.weatherapi.model.DTO;

import lombok.Data;

@Data
public class DayResponseDTO {
    private double maxTempC;
    private double minTempC;
    private double avgTempC;
    private double maxWindKph;
    private double totalPrecipitationMm;
    private double totalSnowfallCm;
    private double avgHumidity;
    private double avgVisibilityKm;
    private double uv;
}
