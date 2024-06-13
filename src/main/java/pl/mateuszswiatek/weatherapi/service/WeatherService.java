package pl.mateuszswiatek.weatherapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import pl.mateuszswiatek.weatherapi.model.DTO.WeatherResponseDTO;
import pl.mateuszswiatek.weatherapi.model.external.WeatherResponse;
import pl.mateuszswiatek.weatherapi.utils.exception.ApiException;
import pl.mateuszswiatek.weatherapi.utils.mapper.WeatherMapper;
import reactor.core.publisher.Mono;

import static pl.mateuszswiatek.weatherapi.utils.exception.ApiExceptionReason.*;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final WebClient webClient;
    @Value("${API_KEY}")
    private String apiKey;
    private static final String KEY = "key";
    private static final String LOCATION = "q";
    private static final String DAYS = "days";
    private static final int FORECAST_DAYS = 3;

    public Mono<WeatherResponseDTO> getWeather(String location) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/forecast.json")
                        .queryParam(KEY, apiKey)
                        .queryParam(LOCATION, location)
                        .queryParam(DAYS, FORECAST_DAYS)
                        .build())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, clientResponse ->
                        Mono.error(new ApiException(CLIENT_ERROR))
                )
                .onStatus(HttpStatusCode::is5xxServerError, clientResponse ->
                        Mono.error(new ApiException(SERVER_ERROR))
                )
                .bodyToMono(WeatherResponse.class)
                .map(WeatherMapper.INSTANCE::toWeatherResponseDTO);
    }
}