package com.backEnd.assignment3.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backEnd.assignment3.model.Ticket;
import com.backEnd.assignment3.repository.TicketRepository;
import com.backEnd.assignment3.services.TicketServices;
@Service
public class TicketServiceImpl implements TicketServices {
	
private final TicketRepository ticketRepository;

public TicketServiceImpl(TicketRepository ticketRepository) {
	this.ticketRepository=ticketRepository;
}
	
	@Override
	public List<Ticket> getAllTicket() {
		List<Ticket> ticket = this.ticketRepository.findAll();
		return ticket;
	}

	@Override
	public Ticket saveTicket(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}

	@Override
	public Ticket getTicketById(Long id) {
		return this.ticketRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("invalid employee id passed"));
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}

	@Override
	public void deleteTicketById(Long id) {
		this.ticketRepository.deleteById(id);

	}

	@Override
	public List<Ticket> getByKeyword(String keyword){
		  return ticketRepository.findByKeyword(keyword);
		 }
	



}
