import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("table")
    String table;

    @SerializedName("currency")
    String currency;

    @SerializedName("code")
    String code;

    @SerializedName("rates")
    List<ExchangeRate> rates;
}
