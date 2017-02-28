package com.yauritux.factory;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import com.yauritux.domain.UserService;

public class UserServiceFactory {

	private PyObject classObject;
	
	public UserServiceFactory() {
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.exec("from service.user_service import UserService");
		classObject = interpreter.get("UserService");
		interpreter.close();		
	}
	
	public UserService create() {
		PyObject userService = classObject.__call__();
		return (UserService) userService.__tojava__(UserService.class);		
	}
}
