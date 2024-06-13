package pl.mateuszswiatek.weatherapi.utils.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "Weather Application API",
        version = "v1",
        description = "This API provides weather-related data and forecasts for the next 3 days"
))
public class OpenApiConfig {
}