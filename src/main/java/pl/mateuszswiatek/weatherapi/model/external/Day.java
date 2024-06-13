package pl.mateuszswiatek.weatherapi.model.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    @JsonProperty("maxtemp_c")
    private double maxTempC;

    @JsonProperty("mintemp_c")
    private double minTempC;

    @JsonProperty("avgtemp_c")
    private double avgTempC;

    @JsonProperty("maxwind_kph")
    private double maxWindKph;

    @JsonProperty("totalprecip_mm")
    private double totalPrecipitationMm;

    @JsonProperty("totalsnow_cm")
    private double totalSnowfallCm;

    @JsonProperty("avghumidity")
    private double avgHumidity;

    @JsonProperty("avgvis_km")
    private double avgVisibilityKm;

    @JsonProperty("uv")
    private double uv;
}