package com.kapitalbank.ticketservice.repository;

import com.kapitalbank.ticketservice.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, String> {
}
