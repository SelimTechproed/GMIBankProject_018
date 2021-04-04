package gmibank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts2 {

    private String accounts;

    public String getAccounts2() {
        return accounts;
    }

    public void setAccounts2(String accounts2) {
        this.accounts = accounts2;
    }
}
