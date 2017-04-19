package org.dao.imp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.dao.XkDao;
import org.dao.XxDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Kcb;
import org.model.Xsb;
public class XkDaoImp implements XkDao {

	public List allKc() {
		
		
		Session session=org.util.HibernateSessionFactory.getSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Kcb");
		List kcs = query.list();
		session.close();
		return kcs;
	
	}

	public void xsxk(Xsb xs, String kch) {
		
		Session session=org.util.HibernateSessionFactory.getSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Kcb where kch=?");
		query.setParameter(0, kch);
		query.setMaxResults(1);
		Kcb kc = (Kcb) query.uniqueResult();
		Set tmp = xs.getKcbs();
		tmp.add(kc);
		xs.setKcbs(tmp);
		session.merge(xs);
		ts.commit();
		session.close();
		
	}

	public void txkc(Xsb xs, String kch) {

		Session session=org.util.HibernateSessionFactory.getSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Kcb where kch=?");
		query.setParameter(0, kch);
		query.setMaxResults(1);
		Kcb kc = (Kcb) query.uniqueResult();
		
		Set kcs = xs.getKcbs();
		Iterator<Kcb> it = kcs.iterator();
		while(it.hasNext())
		{
			Kcb temp = it.next();
			if(temp.getKch().equals(kc.getKch()))
			{
				it.remove();
			}
		}
		
		xs.setKcbs(kcs);
		session.merge(xs);
		
		ts.commit();
		session.close();
		
	}

	
	

}
