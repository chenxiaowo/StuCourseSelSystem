package org.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Kcb entity. @author MyEclipse Persistence Tools
 */

public class Kcb implements java.io.Serializable {

	// Fields

	private String kch;
	private String kcm;
	private short kxxq;
	private Integer xs;
	private Integer xf;
	private String skjs;
	private String skdd;
	private Set xkb = new HashSet(0);
	private Set xsbs = new HashSet();


	// Constructors

	/** default constructor */
	public Kcb() {
	}


	public Kcb(String kch, String kcm, short kxxq, Integer xs, Integer xf,
			String skjs, String skdd, Set xkb, Set xsbs) {
		super();
		this.kch = kch;
		this.kcm = kcm;
		this.kxxq = kxxq;
		this.xs = xs;
		this.xf = xf;
		this.skjs = skjs;
		this.skdd = skdd;
		this.xkb = xkb;
		this.xsbs = xsbs;
	}


	public String getKch() {
		return kch;
	}


	public void setKch(String kch) {
		this.kch = kch;
	}


	public String getKcm() {
		return kcm;
	}


	public void setKcm(String kcm) {
		this.kcm = kcm;
	}


	public short getKxxq() {
		return kxxq;
	}


	public void setKxxq(short kxxq) {
		this.kxxq = kxxq;
	}


	public Integer getXs() {
		return xs;
	}


	public void setXs(Integer xs) {
		this.xs = xs;
	}


	public Integer getXf() {
		return xf;
	}


	public void setXf(Integer xf) {
		this.xf = xf;
	}


	public String getSkjs() {
		return skjs;
	}


	public void setSkjs(String skjs) {
		this.skjs = skjs;
	}


	public String getSkdd() {
		return skdd;
	}


	public void setSkdd(String skdd) {
		this.skdd = skdd;
	}


	public Set getXkb() {
		return xkb;
	}


	public void setXkb(Set xkb) {
		this.xkb = xkb;
	}


	public Set getXsbs() {
		return xsbs;
	}


	public void setXsbs(Set xsbs) {
		this.xsbs = xsbs;
	}

	
	
	
}