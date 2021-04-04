package gmibank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States2 {

    private String states;

    public String getStates2() {

        return states;
    }

    public void setStates2(String states2) {
        this.states = states2;
    }
}
