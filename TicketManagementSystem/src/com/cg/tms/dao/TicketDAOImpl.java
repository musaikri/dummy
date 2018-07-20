package com.cg.tms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO{
	private static Map<String,TicketBean> ticketLog=new HashMap<String, TicketBean>();
	Util u=new Util();
	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		ticketLog.put(ticketBean.getTicketNo(),ticketBean);
		return true;
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
