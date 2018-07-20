package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.TicketManagementSystemException;

public class TicketServiceImpl implements TicketService {
	TicketDAO dao=new TicketDAOImpl();
	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		String id=String.valueOf((Math.random()*999+1)); 
		ticketBean.setTicketStatus("New");
		ticketBean.setTicketNo(id);
		return dao.raiseNewTicket(ticketBean);
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return dao.listTicketCategory();
	}

	@Override
	public boolean validateEntry(int ticketCategoryId) throws TicketManagementSystemException {
		// TODO Auto-generated method stub
		if(!(ticketCategoryId>=0&&ticketCategoryId<=3))
		{
			throw new TicketManagementSystemException("enter correct value");
		}
		return false;
	}

}
