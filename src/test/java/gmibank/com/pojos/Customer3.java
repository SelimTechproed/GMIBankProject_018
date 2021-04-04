package gmibank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer3 {

   private int id;
   private String firstName;
   private String lastName;
   private String middleInitial;
   private String email;
   private String mobilePhoneNumber;
   private String phoneNumber;
   private String zipCode;
   private String address;
   private String city;
   private  String ssn;
   private  String createDate;
   private boolean zelleEnrolled;
   private Country3 country;
   private States3 state;
   private User3 user;
   private Accounts3 accounts;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }

    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public Country3 getCountry() {
        return country;
    }

    public void setCountry(Country3 country) {
        this.country = country;
    }

    public States3 getState() {
        return state;
    }

    public void setState(States3 state) {
        this.state = state;
    }

    public User3 getUser() {
        return user;
    }

    public void setUser(User3 user) {
        this.user = user;
    }

    public Accounts3 getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts3 accounts) {
        this.accounts = accounts;
    }
}
