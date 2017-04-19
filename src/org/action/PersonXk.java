package org.action;
import java.util.Map;
import java.util.Set;

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
public class PersonXk extends ActionSupport{
	// Dlb类对象，用于存取Dlb属性的值
	
	
	public String execute() throws Exception {
		
		Map session=(Map)ActionContext.getContext().getSession();
		String xh = session.get("xh").toString();
		GrDao grDao=new GrDaoImp();//得到Dao接口对象
		Set kcbs = grDao.getKcb(xh);
		session.put("grkb",kcbs);
			return SUCCESS;
	}
}
