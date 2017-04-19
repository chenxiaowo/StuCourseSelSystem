package org.action;

import java.util.Map;

import org.dao.DlDao;
import org.dao.GrDao;
import org.dao.XxDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.GrDaoImp;
import org.dao.imp.XxDaoImp;
import org.model.Dlb;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowXx extends ActionSupport {
	private Xsb xsb;

	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		Map session=(Map)ActionContext.getContext().getSession();
		String xh = session.get("xh").toString();
		XxDao xxDao=new XxDaoImp();//得到Dao接口对象
		Xsb xs=xxDao.getXsb(xh);
		session.put("xsxx",xs);
		
		return SUCCESS;
	}
	
}
