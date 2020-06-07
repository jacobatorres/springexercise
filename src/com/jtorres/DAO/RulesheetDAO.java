package com.jtorres.DAO;

import java.util.List;

import javax.validation.Valid;

import com.jtorres.springexercise.entity.Rulesheet;

public interface RulesheetDAO {
	
	public List<Rulesheet> getRulesheets();

	public void saveRulesheet(@Valid Rulesheet therulesheet);

}
