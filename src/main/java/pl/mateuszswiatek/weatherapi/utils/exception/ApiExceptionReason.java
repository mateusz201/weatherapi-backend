package pl.mateuszswiatek.weatherapi.utils.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ApiExceptionReason {
    CLIENT_ERROR("Client error - please check your request parameters.", HttpStatus.BAD_REQUEST),
    SERVER_ERROR("Server error - please try again later.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String message;
    private final HttpStatus status;
}