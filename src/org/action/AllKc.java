package org.action;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dao.DlDao;
import org.dao.XkDao;
import org.dao.imp.DlDaoImp;
import org.dao.imp.XkDaoImp;
import org.model.Dlb;
import org.model.Kcb;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class AllKc extends ActionSupport{
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
		
		Map session=(Map)ActionContext.getContext().getSession();
		Set mykb = (Set) session.get("grkb");
		XkDao kc = new XkDaoImp();
		List kcs = kc.allKc();
		Iterator<Kcb> it = kcs.iterator();
		while(it.hasNext()&&mykb!=null)
		{
			Kcb tmp = it.next();
			Iterator<Kcb> it2 = mykb.iterator();
			while(it2.hasNext())
			{
				Kcb tmp2 = it2.next();
				if(tmp.getKch().equals(tmp2.getKch()))
				{
					it.remove();
				}
			}
		}
		session.put("kcs", kcs);
		
		return SUCCESS;
	}
	
}
