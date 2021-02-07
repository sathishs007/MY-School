/**
 * 
 */
package com.school.dataserv.api.rest;

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
import com.school.dataserv.utils.XLsReader;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author sathi
 *
 */
@RestController
@RequestMapping(value = "/myschool/v1/dataserv")
@Api(tags = { "StudentDetails" })
@CrossOrigin(origins = { "*" }) 
public class StudentDetails {
    @Autowired
	XLsReader xlsReader;
    @Autowired
    IStudentService iStudentService;
    
	@RequestMapping(value = "/student-details-upload", method = RequestMethod.POST)
	@ApiOperation(value = "student-details-upload.", notes = "Returns the student upload Details in body.")
	/*@ApiImplicitParams({
	    @ApiImplicitParam(name = "Authorization", value = "Authorization token", 
	                      required = true, dataType = "string", paramType = "header") })*/
	public ResponseEntity<ResponseBO> uploadStudentDetails(@RequestParam("file")MultipartFile file,HttpServletRequest request, HttpServletResponse response)throws MySchoolException {
		ResponseBO bo=new ResponseBO();
		try {
		String status=	iStudentService.createStudent(file);
		if(status.equalsIgnoreCase("SUCCESS")) {
			bo.setResponseCode("200");
			bo.setResponseMessage(status);
		}else {
			bo.setResponseCode("500");
			bo.setResponseMessage(status);
		}
		}catch(MySchoolException ex) {
			bo.setResponseCode("500");
			bo.setResponseMessage(ex.getMessage());
		}
		return new ResponseEntity<>(bo, HttpStatus.OK);
	}
	@RequestMapping(value = "/get-student-details", method = RequestMethod.GET)
	@ApiOperation(value = "get-student-details.", notes = "Returns the student Details in body.")
	/*@ApiImplicitParams({
	    @ApiImplicitParam(name = "Authorization", value = "Authorization token", 
	                      required = true, dataType = "string", paramType = "header") })*/
	public ResponseEntity<?>getStudentDetails(HttpServletRequest request, HttpServletResponse response)throws MySchoolException{
		//List<StudentVO>getStudentDetailsList=new ArrayList<StudentVO>();
		StudenBO bo=null;
		try {
			int userId=1001;
			String role="Student";
			//int userId=(int) request.getAttribute("userId");
			//String role=(String) request.getAttribute("role");
			if(role.equalsIgnoreCase("Student")) {
		bo=iStudentService.getStudentDetails(userId);
			}else if(role.equalsIgnoreCase("Teacher")) {
			bo=new 	StudenBO();
			bo.setMessage("Welcome to My school App");
			}
		}catch (MySchoolException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(bo, HttpStatus.OK);
		
	}

}
