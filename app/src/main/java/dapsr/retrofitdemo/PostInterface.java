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
     *
     * @param category category It of the post
     *
     * @param listCallback  get ArrayList of All post of category It
     */
    @GET("/weather")
    void getCategoryPosts(@Query("q") String category , Callback<Pojo> listCallback);

//    @GET("/media")
//    void getCoverImage(@Query("post_parent") int media, Callback<List<ImagePoJo>> imagePoJoCallback);
//
//    @GET("/posts")
//    void getSearchContent(@Query("s") String searchString, @Query("page") int pagenumber, Callback<List<PostPoJo>> listCallbacksearch);

}
