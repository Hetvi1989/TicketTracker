package com.backEnd.assignment3.services;

import java.util.List;

import com.backEnd.assignment3.model.Ticket;

public interface TicketServices {

	List<Ticket> getAllTicket();

	Ticket saveTicket(Ticket ticket);

	Ticket getTicketById(Long id);

	Ticket updateTicket(Ticket ticket);	

	void deleteTicketById(Long id);
	
	List<Ticket> getByKeyword(String keyword);

}
