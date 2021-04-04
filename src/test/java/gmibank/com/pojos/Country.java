package gmibank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

//import org.apache.commons.lang.builder.ToStringBuilder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "states"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("states")
    private Object states;
    /**
     * No args constructor for use in serialization
     *
     */
    public Country() {
    }
    public Country(String name) {
        this.name = name;
    }
    public Country(String name, Object states) {
        this.name = name;
        this.states = states;
    }
    /**
     *
     * @param name
     * @param id
     * @param states
     */
    public Country(Integer id, String name, Object states) {
        super();
        this.id = id;
        this.name = name;
        this.states = states;
    }
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty("states")
    public Object getStates() {
        return states;
    }
    @JsonProperty("states")
    public void setStates(Object states) {
        this.states = states;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("states", states).toString();
   }

    public void setId(String line) {
    }
}
