import com.google.gson.annotations.SerializedName;

public class ExchangeRate {


    @SerializedName("no")
    String no;

    @SerializedName("effectiveDate")
    String effectiveDate;

    @SerializedName("mid")
    Double mid;

    @Override
    public String toString() {
        return
                "[" + effectiveDate +
                ", średni kurs = " + mid +
                ']';
    }
}
