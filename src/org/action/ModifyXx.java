package org.action;

import java.util.Date;
import java.util.Map;

import org.dao.XgDao;
import org.dao.imp.XgDaoImp;
import org.model.Xsb;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ModifyXx extends ActionSupport {
	
	private String xh;
	private String xm;
	private boolean xb;
	private Date csrq;
	private Integer zyId;
	private Integer zxf;
	private String bz;

	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public boolean isXb() {
		return xb;
	}
	public void setXb(boolean xb) {
		this.xb = xb;
	}
	public Date getCsrq() {
		return csrq;
	}
	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}
	public Integer getZyId() {
		return zyId;
	}
	public void setZyId(Integer zyId) {
		this.zyId = zyId;
	}
	public Integer getZxf() {
		return zxf;
	}
	public void setZxf(Integer zxf) {
		this.zxf = zxf;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	


	@Override
	public String execute() throws Exception {
		Map session=(Map)ActionContext.getContext().getSession();
		Xsb xs = (Xsb) session.get("xsxx");
		xs.setXh(xh);
		xs.setXm(xm);
		xs.setXb(xb);
		xs.setCsrq(csrq);
		xs.setZyId(zyId);
		xs.setZxf(zxf);
		xs.setBz(bz);
		
		XgDao xg = new XgDaoImp();
		xg.xgXs(xs);
		
		session.put("xsxx", xs);
		return SUCCESS;
	}
}
