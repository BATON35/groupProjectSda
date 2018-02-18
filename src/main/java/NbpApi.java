import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface NbpApi {


    @GET("/api/exchangerates/rates/a/{currency}/last/{amount}/?format=json")
    Call<Data> getLastData(@Path("currency")String currency,@Path("amount")int amount);

    @GET("/api/exchangerates/rates/a/{currency}/{fromDate}/{toDate}/?format=json")  //SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
    Call<Data> getRangeDate(@Path("currency")String currency, @Path("fromDate")Date fromDate, @Path("toDate")Date toDate);

}

