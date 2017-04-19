package org.action;

import java.util.Map;

import org.dao.XkDao;
import org.dao.imp.XkDaoImp;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteKc extends ActionSupport {
	private String unseKch;
	
	
	
	public String getUnseKch() {
		return unseKch;
	}



	public void setUnseKch(String unseKch) {
		this.unseKch = unseKch;
	}



	@Override
	public String execute() throws Exception {
		
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		session.put("unseKch",unseKch);
		XkDao xkdao = new XkDaoImp();
		xkdao.txkc(xs, unseKch);
		return SUCCESS;
	}
}
