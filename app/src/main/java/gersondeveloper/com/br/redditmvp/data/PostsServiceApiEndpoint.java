package gersondeveloper.com.br.redditmvp.data;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsServiceApiEndpoint {


//Created by Gerson Cardoso Filho em 05 de novembro de 2016

        private static final String TAG = "RetrofitRestClient";
        private static final String BASE_URL = "HERE ENTERS YOUR BASIC URL";
        //Timeout in milliseconds;
        private static final int TIMEOUT = 60;

        private static PostsServiceApiEndpoint instance;
        private Retrofit retrofit;
        PostsServiceApi apiService;

        //Singleton initializer
        public static void initialize()
        {
            if (instance != null)
            {
                instance = new PostsServiceApiEndpoint();
            }
        }

        //Singleton instance getter
        public static PostsServiceApiEndpoint getInstance()
        {
            initialize();
            return instance;
        }

        //Constructor
        private PostsServiceApiEndpoint()
        {
            final OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                    .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                    .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                    .build();


            this.retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            this.apiService = retrofit.create(PostsServiceApi.class);
        }

        //Here goes the methods that will consumes the RetrofitRestClient
        //Examples
   /*public void getUserLogin(Map<String,String> data, Callback<User> callback)
    {
        Call<User> call = apiService.getUserLogin(data);
        call.enqueue(callback);
    }

    public void registerUser(User user, Callback<User> callback)
    {
        Call<User>call = apiService.postUser(user);
        call.enqueue(callback);
    }

    public void registerPayment(Payment payment, Callback<Payment> callback)
    {
        Call<Payment>call = apiService.postPayment(payment);
        call.enqueue(callback);
    }

    public void deletePayment(String paymentId, Callback<Payment> callback)
    {
        Call<Payment>call = apiService.deletePayment(paymentId);
        call.enqueue(callback);
    }*/





}
