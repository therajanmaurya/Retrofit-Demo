package dapsr.retrofitdemo;

import dapsr.retrofitdemo.POJO.Pojo;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by rajanmaurya on 5/8/15.
 */
public interface PostInterface {


    /**
     * Fetch catergory posts by making a HTTP GET request along with query parameters and parses
     * the responses onto the JSON if successful.
     * 
     * @param q 		Query parameter.
     * @param callback 	The callback to be called on success/failure.
     */
    @GET("/weather")
    void getWeatherData(@Query("q") String q , Callback<Pojo> callback);


}
