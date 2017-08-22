package com.example.administrator.designsupportdemo.retrofit;

import com.example.administrator.designsupportdemo.BuildConfig;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DAL
{
    private BaseAPIService baseAPIService;
    public static final DAL shareDAL = new DAL();

    private DAL() {

    }
    public BaseAPIService baseAPIService() {
        if (baseAPIService == null) {
            OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
            httpClientBuilder.connectTimeout(60, TimeUnit.SECONDS);
            if (BuildConfig.DEBUG) {
//                httpClientBuilder.interceptors().add(interceptor);
//                HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            }
                      // .addCallAdapterFactory(DALCallAdapterFactory.create())
            Retrofit retrofit = new Retrofit.Builder()
                    .client(httpClientBuilder.build())
                    .baseUrl("http://gank.io/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            baseAPIService = retrofit.create(BaseAPIService.class);
        }
        return baseAPIService;
    }
}

