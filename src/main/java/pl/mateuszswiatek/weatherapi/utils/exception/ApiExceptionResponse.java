package pl.mateuszswiatek.weatherapi.utils.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Getter
@Setter
public class ApiExceptionResponse {
    private String message;
    private ZonedDateTime timestamp;

    public ApiExceptionResponse(String message) {
        this.message = message;
        this.timestamp = ZonedDateTime.now();
    }
}
