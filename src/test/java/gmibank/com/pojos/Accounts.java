package gmibank.com.pojos;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts {
    public String getUnknown() {
        return unknown;
    }

    public void setUnknown(String unknown) {

        this.unknown = unknown;
    }

    private String unknown;

}