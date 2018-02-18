import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {

    static String BASE_URL = "http://api.nbp.pl/";

    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        NbpApi nbpApi = retrofit.create(NbpApi.class);

        Call<Data> exchangeRateCall = nbpApi.getLastData("eur", 10);
        System.out.println("URL: " + exchangeRateCall.request().url());

        exchangeRateCall.enqueue(new Callback<Data>() {
            public void onResponse(Call<Data> call, Response<Data> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Data data = response.body();

                    System.out.println("CODE:  " + data.code);
                    for (ExchangeRate er : data.rates) {
                        System.out.println(er.toString());
                    }

                }
            }

            public void onFailure(Call<Data> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }
}
