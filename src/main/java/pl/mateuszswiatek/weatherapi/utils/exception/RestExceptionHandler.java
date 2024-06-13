package pl.mateuszswiatek.weatherapi.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiExceptionResponse> handleApiException(ApiException exception) {
        ApiExceptionResponse body = new ApiExceptionResponse(exception.getMessage());
        HttpStatus status = exception.getStatus();

        return new ResponseEntity<>(body, status);
    }

}
