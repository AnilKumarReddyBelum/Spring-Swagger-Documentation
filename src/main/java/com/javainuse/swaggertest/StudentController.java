package com.javainuse.swaggertest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "StudentAPI", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, description = "StudentAPI is handling all the student operations.")
public class StudentController {

	private static Logger logger = LoggerFactory.getLogger(StudentController.class);

	@PostMapping(value = "/student/save")
	@ApiOperation("Create a record in the DB by using this API.")
	public @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully called the create API.", response = Student.class) }) Student create(
					@ApiParam(name = "Student JSON Data", required = true, value = "Send the student data is in the form of JSON format.") @RequestBody Student student) {
		logger.info("creating-->" + student.toString());
		return student;
	}

	@PutMapping("/student/update")
	@ApiOperation("update a record in the DB by using this API.")
	public @ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully called the update API.", response = Student.class) }) Student update(
					@ApiParam(name = "student", required = true, value = "send student id,name,age and address parameters.") @RequestBody Student student) {
		logger.info("updating-->" + student.toString());
		return student;
	}

}
