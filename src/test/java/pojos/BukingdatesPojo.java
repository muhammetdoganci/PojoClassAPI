package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BukingdatesPojo {
    /*
    "bookingdates": {
          "checkin": "2018-01-01",
          "checkout": "2019-01-01"
      },
     */
    private String checkin;
    private String checkout;

    public BukingdatesPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public BukingdatesPojo() {
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "BukingdatesPojo{" +
                "checkin='" + checkin + '\'' +
                "checkout='" + checkout + '\'' +
                '}';
    }
}
