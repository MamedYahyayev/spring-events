package az.maqa.spring.event.service;

import az.maqa.spring.event.event.ReservationCreatedEvent;
import az.maqa.spring.event.request.RequestHotelBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ApplicationEventPublisher publisher;

    @Async
    public void publishReservationEvent(RequestHotelBook requestHotelBook) {
        publisher.publishEvent(new ReservationCreatedEvent(requestHotelBook));
    }
}
