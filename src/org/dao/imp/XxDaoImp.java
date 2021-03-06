package org.dao.imp;
import org.dao.XxDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Kcb;
import org.model.Xsb;
import org.util.HibernateSessionFactory;
public class XxDaoImp implements XxDao {
	
	public Xsb getXsb(String xh) {
		try{
			Session session=org.util.HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Xsb where xh=?");
			query.setParameter(0, xh);
			query.setMaxResults(1);
			Xsb xsb=(Xsb) query.uniqueResult();
			if(xsb!=null){
				return xsb;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	
}
