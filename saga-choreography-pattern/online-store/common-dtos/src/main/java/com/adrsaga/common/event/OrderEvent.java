package com.adrsaga.common.event;

import com.adrsaga.common.dto.OrderRequestDto;

import java.util.Date;
import java.util.UUID;

public class OrderEvent implements Event {
    private UUID eventId= UUID.randomUUID();
    private Date eventDate = new Date();
    private OrderRequestDto orderRequestDto;
    private OrderStatus orderStatus;


    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public Date getDate() {
        return eventDate;
    }
}
