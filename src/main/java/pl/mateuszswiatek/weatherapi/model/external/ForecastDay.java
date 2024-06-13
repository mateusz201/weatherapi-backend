package pl.mateuszswiatek.weatherapi.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import pl.mateuszswiatek.weatherapi.model.external.Day;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDay {
    private String date;
    private Day day;
}
