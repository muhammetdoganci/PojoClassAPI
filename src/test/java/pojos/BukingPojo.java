package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BukingPojo {
    /*
    {
            "firstname": "Joe",
            "lastname": "Morante Briones",
            "totalprice: 111,
            "depositpaid": true,
            "bookingdates": {
                "checkin": "2018-01-01",
                "checkout": "2019-01-01"
    },
            "additionalneeds": "Breakfast"
    }
    */
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private BukingdatesPojo bukingdatesPojo;
    private String additionalneeds;

    public BukingPojo(String firstname, String lastname, Integer totalprice, Boolean depositpaid, BukingdatesPojo bukingdatesPojo, String additionalneeds) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalprice = totalprice;
        this.depositpaid = depositpaid;
        this.bukingdatesPojo = bukingdatesPojo;
        this.additionalneeds = additionalneeds;
    }

    public BukingPojo() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public BukingdatesPojo getBukingdatesPojo() {
        return bukingdatesPojo;
    }

    public void setBukingdatesPojo(BukingdatesPojo bukingdatesPojo) {
        this.bukingdatesPojo = bukingdatesPojo;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    @Override
    public String toString() {
        return "BukingPojo{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalprice=" + totalprice +
                ", depositpaid=" + depositpaid +
                ", BukingdatesPojo='" + bukingdatesPojo + '\'' +
                ", additionalneeds='" + additionalneeds + '\'' +
                '}';
    }
}
