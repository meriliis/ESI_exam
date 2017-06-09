package com.example.demo.requests.infrastructure;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Philosoraptor on 06/03/2017.
 */
@Service
public class ReservationsIdentifierFactory {
    public String nextReservationID() {
        return UUID.randomUUID().toString();
    }
}
