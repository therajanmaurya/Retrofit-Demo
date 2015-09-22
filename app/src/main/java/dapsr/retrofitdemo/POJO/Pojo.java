package dapsr.retrofitdemo.POJO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajanmaurya on 22/9/15.
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