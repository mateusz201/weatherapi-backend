package pl.mateuszswiatek.weatherapi.utils.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.mateuszswiatek.weatherapi.model.DTO.DayResponseDTO;
import pl.mateuszswiatek.weatherapi.model.DTO.ForecastDayResponseDTO;
import pl.mateuszswiatek.weatherapi.model.DTO.ForecastResponseDTO;
import pl.mateuszswiatek.weatherapi.model.DTO.WeatherResponseDTO;
import pl.mateuszswiatek.weatherapi.model.external.Day;
import pl.mateuszswiatek.weatherapi.model.external.Forecast;
import pl.mateuszswiatek.weatherapi.model.external.ForecastDay;
import pl.mateuszswiatek.weatherapi.model.external.WeatherResponse;

@Mapper
public interface WeatherMapper {
    WeatherMapper INSTANCE = Mappers.getMapper(WeatherMapper.class);

    WeatherResponseDTO toWeatherResponseDTO(WeatherResponse weatherResponse);
    ForecastResponseDTO toForecastResponseDTO(Forecast forecast);
    ForecastDayResponseDTO toForecastDayResponseDTO(ForecastDay forecastDay);
    DayResponseDTO toDayResponseDTO(Day day);
}
