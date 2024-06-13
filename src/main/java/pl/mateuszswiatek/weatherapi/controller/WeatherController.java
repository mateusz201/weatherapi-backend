package pl.mateuszswiatek.weatherapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.mateuszswiatek.weatherapi.model.DTO.WeatherResponseDTO;
import pl.mateuszswiatek.weatherapi.service.WeatherService;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<Mono<WeatherResponseDTO>> getWeather(@RequestParam String location) {
        return new ResponseEntity<>(weatherService.getWeather(location), HttpStatus.OK);
    }
}
