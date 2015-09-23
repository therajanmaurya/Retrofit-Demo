package dapsr.retrofitdemo.POJO;

/**
 * Created by rajanmaurya on 22/9/15.
 */
public class Main {

    public float temp;
    public float pressure;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTempMin() {
        return temp_min;
    }

    public void setTempMin(float tempMin) {
        this.temp_min = tempMin;
    }

    public float getTempMax() {
        return temp_max;
    }

    public void setTempMax(float tempMax) {
        this.temp_max = tempMax;
    }

    public float getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(float seaLevel) {
        this.seaLevel = seaLevel;
    }

    public float getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(float grndLevel) {
        this.grndLevel = grndLevel;
    }

    public int humidity;
    public float temp_min;
    public float temp_max;
    public float seaLevel;
    public float grndLevel;


}
