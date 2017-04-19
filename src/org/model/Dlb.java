package org.model;

/**
 * Dlb entity. @author MyEclipse Persistence Tools
 */

public class Dlb implements java.io.Serializable {

	// Fields

	private Integer id;
	private String kl;
	private String xh;
	// Constructors

	public String getXh() {
		return xh;
	}


	public void setXh(String xh) {
		this.xh = xh;
	}


	/** default constructor */
	public Dlb() {
	}


	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getKl() {
		return this.kl;
	}

	public void setKl(String kl) {
		this.kl = kl;
	}

}