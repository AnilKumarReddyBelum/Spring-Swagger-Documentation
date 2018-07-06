package com.javainuse.swaggertest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Student", description = "Student model is describes the structure of the student data.")
public class Student {

	@ApiModelProperty(notes = "Unique identifier of the person. No two persons can have the same id", example = "1", required = true, position = 0, readOnly = true)
	private Integer id;

	@ApiModelProperty(notes = "Garde of the Student", example = "A-Grade", required = true, position = 1)
	private String grade;

	@ApiModelProperty(notes = "Nameof the Student", example = "John", required = true, position = 2)
	private String name;

	@ApiModelProperty(notes = "Address of the Student", example = "Hyd", required = true, position = 3)
	private String address;

	public Student() {

	}

	public Student(Integer id, String grade, String name, String address) {
		super();
		this.id = id;
		this.grade = grade;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
