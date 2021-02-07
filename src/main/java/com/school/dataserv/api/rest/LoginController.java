package com.school.dataserv.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.school.dataserv.Iservice.ILoginService;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.JwtUser;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/myschool/v1")
@Api(tags = { "LoginController" })
@CrossOrigin(origins = { "*" }) 
public class LoginController {
    @Autowired
	ILoginService iLoginService;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
	@ApiOperation(value = "login MySchool.", notes = "Returns the login Details in body.")
	public ResponseEntity<?> uploadStudentDetails(@RequestBody JwtUser user)throws MySchoolException {
    	JwtUser bo=null;
    	try {
       bo=iLoginService.getLogin(user);
    	}catch(MySchoolException ms) {
    		return new ResponseEntity<>(ms.getErrorMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    	}
		return new ResponseEntity<>(bo,HttpStatus.OK);
    	
    }
	
	
}
