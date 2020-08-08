package ru.nesterenko.part01.lesson20.task01;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

/**
 *Есть набор бесплатных сервисов в интернете, предоставляющих данные в формате JSON:
 * https://github.com/toddmotto/public-apis/blob/master/README.md
 * Выбрать любой сервис, какой больше нравится, и написать программу, которая с ним взаимодействует.
 * Класс сериализуемого объекта может содержать не все поля, а только 2-3 ключевых. Например, для погоды
 * достаточно показать диапазон температур.
 * Минимальное количество запросов к сервису - 1.
 * Не обязательно реализовывать весь функционал, предоставляемый сервисом.
 * Достаточного одного любого запроса
 *
 * @version 08 August 2020
 * @author NII
 */
public class JSON_Main {
    public static void main(String[] args) {
        DataWeather[] dataWeather;
        try {
            URL jsonUrl = new URL("https://www.metaweather.com/api/location/search/?query=san");
            ObjectMapper mapper = new ObjectMapper();
            dataWeather = mapper.readValue(jsonUrl, DataWeather[].class);
            for ( DataWeather dw : dataWeather) {
                System.out.println(dw.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
