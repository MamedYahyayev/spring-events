package az.maqa.spring.event.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RequestHotelBook {
    private String userId;
    private String hotelId;
}
