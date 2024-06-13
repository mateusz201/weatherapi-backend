package pl.mateuszswiatek.weatherapi.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mateuszswiatek.weatherapi.model.external.Forecast;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private Forecast forecast;
}
