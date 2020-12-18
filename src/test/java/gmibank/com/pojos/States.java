package gmibank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private int id;
    private String name;
    private String tpcountry;

    public States() {
    }

    public States(String name){
        this.name = name;
    }

    public States(String state, Object o) {
    }
//    public States(String null){
//
//    }

    @Override
    public String toString() {
        return "States{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tpcountry='" + tpcountry + '\'' +
                '}';
    }

    public States(int id, String name, String tpcountry) {
        this.id = id;
        this.name = name;
        this.tpcountry = tpcountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(String tpcountry) {
        this.tpcountry = tpcountry;
    }




}

