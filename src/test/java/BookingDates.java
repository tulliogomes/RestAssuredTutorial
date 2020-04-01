import java.util.Date;

import javax.xml.crypto.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

// "bookingdates": {
//     "checkin": "2018-11-23",
//     "checkout": "2018-12-03"
// },


public class BookingDates {
	
	@JsonProperty
	private Date checkin;
	@JsonProperty
	private Date checkout;

}
