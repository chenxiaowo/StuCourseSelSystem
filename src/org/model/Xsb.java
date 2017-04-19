package org.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Xsb entity. @author MyEclipse Persistence Tools
 */

public class Xsb implements java.io.Serializable {

	// Fields

	private String xh;
	private String xm;
	private boolean xb;
	private Date csrq;
	private Integer zyId;
	private Integer zxf;
	private String bz;
	private String zp;
	
	private Set kcbs = new HashSet();
	
	// Constructors

	/** default constructor */
	public Xsb() {
	}

	public Xsb(String xh, String xm, boolean xb, Date csrq, Integer zyId,
			Integer zxf, String bz, String zp, Set kcbs) {
		super();
		this.xh = xh;
		this.xm = xm;
		this.xb = xb;
		this.csrq = csrq;
		this.zyId = zyId;
		this.zxf = zxf;
		this.bz = bz;
		this.zp = zp;
		this.kcbs = kcbs;
	}

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

	public String getZp() {
		return zp;
	}

	public void setZp(String zp) {
		this.zp = zp;
	}

	public Set getKcbs() {
		return kcbs;
	}

	public void setKcbs(Set kcbs) {
		this.kcbs = kcbs;
	}

	
}