import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NbpApi {


    @GET("/api/exchangerates/rates/a/{currency}/last/{amount}/?format=json")
    Call<Data> getLastData(@Path("currency")String currency,@Path("amount")int amount);

}

