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

import com.school.dataserv.Iservice.IStudentMarkService;
import com.school.dataserv.exception.MySchoolException;
import com.school.dataserv.model.ResponseBO;
import com.school.dataserv.utils.XLsReader;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/myschool/v1/dataserv")
@Api(tags = { "StudentMarkDetails" })
@CrossOrigin(origins = { "*" }) 
public class StudentMarkController {

	 @Autowired
		XLsReader xlsReader;
	    @Autowired
	    IStudentMarkService iStudentMarkService;
	    
		@RequestMapping(value = "/student-mark-details-upload", method = RequestMethod.POST)
		@ApiOperation(value = "student-mark-details-upload.", notes = "Returns the student mark upload Details in body.")
		/*@ApiImplicitParams({
		    @ApiImplicitParam(name = "Authorization", value = "Authorization token", 
		                      required = true, dataType = "string", paramType = "header") })*/
		public ResponseEntity<ResponseBO> uploadStudentMarks(@RequestParam("file")MultipartFile file,HttpServletRequest request, HttpServletResponse response)throws MySchoolException {
			ResponseBO bo=new ResponseBO();
			try {
			String status=	iStudentMarkService.createStudentMark(file);
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
}
