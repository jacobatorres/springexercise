package com.jtorres.DAO;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jtorres.springexercise.entity.Rulesheet;

@Repository
public class RulesheetDAOImpl implements RulesheetDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Rulesheet> getRulesheets() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		System.out.println("here...");
		
		try {
			
			
			Query<Rulesheet> query = currentSession.createQuery("from Rulesheet", Rulesheet.class);
			
			List<Rulesheet> rulesheets = query.getResultList();
			
			return rulesheets;

		} catch (Exception e) {
			System.out.println("huhu...");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void saveRulesheet(@Valid Rulesheet therulesheet) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(therulesheet);
		
	}

}
