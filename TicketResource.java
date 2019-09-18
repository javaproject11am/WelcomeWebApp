package com.nit.rest.resources;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nit.rest.customexceptions.TicketNotFoundException;
import com.nit.rest.dto.TicketDTO;

@Singleton
@Path("ticketResource")
public class TicketResource {

	@Produces(MediaType.APPLICATION_XML)
	@Path("{tid}")
	@GET
	public Response bookTicket(@PathParam("tid") String tid) throws Exception {
		
		if(tid.equals("ABC123")) {
			
			TicketDTO tDTO = new TicketDTO();
			
			tDTO.settID(101);
			tDTO.setFromStation("Ahmednagar");
			tDTO.setToStation("Pune");
			
		
		return Response.ok(tDTO).build();
		}
		
		else {
			
			throw new TicketNotFoundException("Bad Request");
		}
	}
	
	
}
