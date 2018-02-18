
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Scanner;

public class Main {

    static String BASE_URL = "http://api.nbp.pl/";
    static String waluta;
    static int iloscNotowan;
    static int nrWaluty;
    private static int range;


    public static void main(String[] args) {

        getCurrency();

        getRange();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        NbpApi nbpApi = retrofit.create(NbpApi.class);

        Call<Data> exchangeRateCall = nbpApi.getLastData(waluta, iloscNotowan);
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

    private static String getCurrency() {
        System.out.println("wybierz walutę: \n 0 -> EUR\n 1 -> USD\n 2 -> CHF\n 3 -> GBP");
        Scanner sc = new Scanner(System.in);
        nrWaluty = sc.nextInt();
        switch (nrWaluty) {
            case 0:
                waluta = "eur";
                break;
            case 1:
                waluta = "usd";
                break;
            case 2:
                waluta = "chf";
                break;
            case 3:
                waluta = "gbp";
                break;
        }
        return waluta;
    }


    public static int getRange() {
        System.out.println("z ilu dni wyświetlić średnie kursy? ");
        Scanner sc = new Scanner(System.in);



            iloscNotowan = sc.nextInt();



        System.out.println(iloscNotowan);
        return iloscNotowan;
    }
}
