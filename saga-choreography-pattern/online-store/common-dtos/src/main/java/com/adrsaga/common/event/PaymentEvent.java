package com.adrsaga.common.event;

import com.adrsaga.common.dto.PaymentRequestDto;

import java.util.Date;
import java.util.UUID;

public class PaymentEvent implements Event {

    private UUID eventId= UUID.randomUUID();
    private Date eventDate = new Date();

    private PaymentRequestDto paymentRequestDto;

    private PaymentStatus paymentStatus;

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getDate() {
        return eventDate;
    }
}
