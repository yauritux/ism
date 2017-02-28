package com.yauritux.mappers;

import java.util.List;

import com.yauritux.domain.Rule;

public interface RuleMapper {

	public void insertUser(Rule rule);
	
	public Rule getRuleById(String ruleId);
	
	public Rule getRuleByName(String ruleName);
	
	public List<Rule> getAllRules();	
}
