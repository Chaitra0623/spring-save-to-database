package com.xworkz.XworkzHoliday.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.XworkzHoliday.Entity.IPLEntity;

@Component
public class IPLDAOImpl implements IPLDAO {
	@Autowired
	private SessionFactory factory;

	public IPLDAOImpl() {
		System.out.println("created\t :" + this.getClass().getSimpleName());
	}

	
   public void save(IPLEntity iplEntity) {
		System.out.println("invoked save :" + iplEntity);
		Session session = factory.openSession();
				
		try {
			if (Objects.nonNull(session)) {
				session.beginTransaction();
				System.out.println("data saved in database");
				session.save(iplEntity);
				session.getTransaction().commit();
			} else {
				System.out.println("data not saved in database");
			}

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			System.out.println("exeception occurd"+e.getMessage());
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
			}
		}

	}
}
