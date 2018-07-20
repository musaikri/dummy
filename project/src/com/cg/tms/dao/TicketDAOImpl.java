package com.cg.tms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO{
int count=0;
	private static Map<String,TicketBean> ticketLog=new HashMap<String, TicketBean>();
	Util u=new Util();
	public boolean raiseNewTicket(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		ticketLog.put(ticketBean.getTicketNo(),ticketBean);
		return true;
	}

	public List<String> listTicketCategory() {
		// TODO Auto-generated method stub
		
Map<String, String> map=u.getTicketCategoryEntries();

List<String> result2 = new ArrayList(map.values());
/*List<TicketCategory> list=null;
list.add((TicketCategory) result2);
/*if(count==0){
	TicketCategory bean=new TicketCategory();
	bean.setCategoryName(map.get("tc001"));
	List<TicketCategory> list=null;
	list.add(bean);
	count++;
	return list;
}
else if(count==1){
	TicketCategory bean=new TicketCategory();
	bean.setCategoryName(map.get("tc002"));
	List<TicketCategory> list=null;
	list.add(bean);
	count++;
	return list;
}
else if(count==2){
	TicketCategory bean=new TicketCategory();
	bean.setCategoryName(map.get("tc003"));
	List<TicketCategory> list=null;
	list.add(bean);
	count++;
	return list;
}
return null;
*///bean.setTicketCategoryId(map.containsValue("software installation"));



	return result2;
	}

}
