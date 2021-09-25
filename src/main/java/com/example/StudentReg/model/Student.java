package com.example.StudentReg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer stdId;
	
	@Column(name="name")
	private String stdName;
	
	@Column(name="fee")
	private Double stdFee;
	
	@Column(name="course")
	private String stdCourse;
	
	@Column(name="disc")
	private Double stdFeeDisc;
	
	@Column(name="gst")
	private Double stdFeeGst;
	

}
