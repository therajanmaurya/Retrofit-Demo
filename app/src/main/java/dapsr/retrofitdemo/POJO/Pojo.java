package dapsr.retrofitdemo.POJO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajanmaurya on 22/9/15. Defines our Plain Old Java Object. This
 * class defines the keys and fields which are recieved in the JSON by the REST
 * API. Data types are according to the data received via the API and the names
 * of the variables are exactly the same as in the JSON data. This is the root
 * JSON object received via the API. Inner objects are defined as different class
 * viz. Wind, Weather, etc.
 */
public class Pojo {

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Coord coord;
    public List<Weather> weather = new ArrayList<Weather>();
    public Wind wind;
    public Main main;

}