package ru.nesterenko.part01.lesson20.task01;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataWeather {

    @JsonProperty("title")
    private String title;

    @JsonProperty("location_type")
    private String locationType;

    @JsonProperty("woeid")
    private int woeid;

    @JsonProperty("latt_long")
    private String latt_long;

    DataWeather() {
    }

    @Override
    public String toString() {
        return "DataWeather{" +
                "title='" + title + '\'' +
                ", locationType='" + locationType + '\'' +
                ", woeid=" + woeid +
                ", latt_long=" + latt_long +
                '}';
    }

    //    "title" : San Francisco,
//    "location_type" : City,
//            "woeid" : 2487956,
//            "latt_long" : 37.777119, -122.41964
}
