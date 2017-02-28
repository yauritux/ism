package com.yauritux.domain;

public class Rule {

	private String ruleId;
	private String ruleName;
	private String ruleDesc;
	
	public Rule() {}

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleDesc() {
		return ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}
	
	@Override
	public String toString() {
		return "Rule [ruleId='" + ruleId + "', ruleName='" + ruleName
				+ "', ruleDesc='" + ruleDesc + "']";
	}	
}
