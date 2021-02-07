package com.school.dataserv.api.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.school.dataserv.Iservice.IStudentService;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.ResponseBO;
import com.school.dataserv.model.StudenBO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/myschool/v1/dataserv")
@Api(tags = { "StaffController" })
@CrossOrigin(origins = { "*" }) 
public class StaffController {

	 @Autowired
	    IStudentService iStudentService;
	 
	 @RequestMapping(value = "/student-details-list", method = RequestMethod.POST)
		@ApiOperation(value = "student-details-list.", notes = "Returns the student Details list in body.")
	/* @ApiImplicitParams({
		    @ApiImplicitParam(name = "Authorization", value = "Authorization token", 
		                      required = true, dataType = "string", paramType = "header") })*/
	 public ResponseEntity<?> getStudentDetailsList(@RequestParam (required=true)int clas,@RequestParam (required=true)String section,HttpServletRequest request, HttpServletResponse response)throws MySchoolException {
		 List<StudenBO>getStudentDetailsList=null;
		 try {
			getStudentDetailsList=iStudentService.getStudentDetailsList(clas, section);
		}catch(MySchoolException e) {
			
		}
		 return new ResponseEntity<>(getStudentDetailsList, HttpStatus.OK);
		 
	 }
}
