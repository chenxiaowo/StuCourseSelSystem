package org.action;
import java.util.Map;
import org.dao.DlDao;
import org.dao.XxDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.XxDaoImp;
import org.model.Dlb;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport{
	// Dlb类对象，用于存取Dlb属性的值
	private Dlb dlb;
	// 生成其get和set方法
	
	public Dlb getDlb() {
		return dlb;
	}

	public void setDlb(Dlb dlb) {
		this.dlb = dlb;
	}
	
	
	public String execute() throws Exception {
		DlDao dlDao=new DlDaoImp();//得到Dao接口对象
		Dlb user=dlDao.validate(dlb.getXh(), dlb.getKl());//调用Dao中的方法
		if(user!=null){
		//如果不为空，保存到Session中
			Map session=(Map)ActionContext.getContext().getSession();
			Dlb dlbl = null;
			dlbl = (Dlb) session.get("dlb");
			if(dlbl==null)
			{
				dlbl=dlb;
			}
			
			session.put("dlb", dlbl);
			session.put("xh",dlb.getXh());
			XxDao xxDao=new XxDaoImp();//得到Dao接口对象
			Xsb xs=xxDao.getXsb(dlb.getXh());
			session.put("xsxx",xs);
			return SUCCESS;
		}else{
			return ERROR;
		}
	}




	
}
