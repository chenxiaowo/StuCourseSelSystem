package org.action;

import java.util.Map;

import org.dao.XkDao;
import org.dao.imp.XkDaoImp;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SelectKc extends ActionSupport {
	private String seKch;
	public String getSeKch() {
		return seKch;
	}
	public void setSeKch(String seKch) {
		this.seKch = seKch;
	}
	@Override
	public String execute() throws Exception {
		
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		session.put("seKch",seKch);
		XkDao xkdao = new XkDaoImp();
		xkdao.xsxk(xs, seKch);
		
		return SUCCESS;
	}

}
