package az.maqa.spring.event.api;

import az.maqa.spring.event.request.RequestHotelBook;
import az.maqa.spring.event.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private ReservationService service;

    @PostMapping
    public void hotelBook(@RequestBody RequestHotelBook requestHotelBook) {
        service.publishReservationEvent(requestHotelBook);
    }


}
