package dapsr.retrofitdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import dapsr.retrofitdemo.POJO.Pojo;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by rajanmaurya on 22/9/15.
 */
public class Fragment1 extends Fragment {


        PostInterface postInterface ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment1, container, false);

        final EditText editText = (EditText)layout.findViewById(R.id.editText);
        final TextView textView = (TextView) layout.findViewById(R.id.textView);
        Button button = (Button) layout.findViewById(R.id.update);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        postInterface = ServiceGenerator.createService(PostInterface.class , getResources().getString(R.string.base_url));
                postInterface.getCategoryPosts(editText.getText().toString(), new Callback<Pojo>() {
                    @Override
                    public void success(Pojo pojo, Response response) {

                        textView.setText("" +pojo.getCoord().getLat() + "\n"
                                            + pojo.getWeather().get(0).getDescription()+"\n"
                                            + pojo.getMain().getTemp() + "\n"
                                            +"max temp" + pojo.getMain().getTempMax() +"\n"
                                            + pojo.getWind().getSpeed());

                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                });


            }
        });


        return layout;
    }
}
