package com.yauritux.factory;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import com.yauritux.domain.RuleService;

public class RuleServiceFactory {

	private PyObject classObject;
	
	public RuleServiceFactory() {
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.exec("from service.rule_service import RuleService");
		classObject = interpreter.get("RuleService");
		interpreter.close();		
	}
	
	public RuleService create() {
		PyObject ruleService = classObject.__call__();
		return (RuleService) ruleService.__tojava__(RuleService.class);		
	}
}
