package gmibank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country2 {

    private String country;

    public String getCountry2() {
        return country;
    }

    public void setCountry2(String country2) {
        this.country = country2;
    }
}
