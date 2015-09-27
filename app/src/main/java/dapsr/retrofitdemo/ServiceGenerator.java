package dapsr.retrofitdemo;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.android.AndroidLog;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Generates service for API calls.
 *
 * @author Rajan Maurya
 * @date ${DATE}
 */
public class ServiceGenerator
{

	/**
	 * Private Constructor. No need to instantiate this class.
	 */
	private ServiceGenerator()
	{
		/**
		 * Required empty constructor.
		 */
	}


	/**
	 * Creates service for REST API calls with access tokens.
	 * @param serviceClass	Type of service you need to create.
	 * @param baseUrl		REST API's base URL.
	 * @param <S>
	 * @return
	 */
	public static <S> S createService(Class<S> serviceClass, String baseUrl)
	{
		// Creates new Gson obejct.
		Gson gson = new Gson();

		// Creates new RestAdapter object to create a adapter which performs the API HTTP calls
		// and parses the JSON onto the POJO classes.
		RestAdapter.Builder builder = new RestAdapter.Builder()
				.setEndpoint(baseUrl)
				.setLogLevel(RestAdapter.LogLevel.FULL).setLog(new AndroidLog("Retrofit-Demo"))
				.setConverter(new GsonConverter(gson))
				.setClient(new OkClient(new OkHttpClient()));

		RestAdapter adapter = builder.build();

		return adapter.create(serviceClass);
	}
}
