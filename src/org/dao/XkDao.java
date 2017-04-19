package org.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Dlb;
import org.model.Xsb;

public interface XkDao {

	public List allKc();
	public void xsxk(Xsb xs,String kch);
	public void txkc(Xsb xs,String kch);
}
