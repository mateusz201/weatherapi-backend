package pl.mateuszswiatek.weatherapi.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
    @JsonProperty("forecastday")
    private List<ForecastDay> forecastDays;
}
