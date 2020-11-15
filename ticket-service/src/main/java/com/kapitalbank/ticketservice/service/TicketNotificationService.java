package com.kapitalbank.ticketservice.service;

import com.kapitalbank.ticketservice.model.Ticket;

public interface TicketNotificationService {

    void sendToQueue(Ticket ticket);
}
