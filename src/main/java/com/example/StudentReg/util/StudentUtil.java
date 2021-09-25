package com.example.StudentReg.util;

import org.springframework.stereotype.Component;

import com.example.StudentReg.model.Student;

import lombok.var;

@Component
public class StudentUtil {

	public void calulateDetails(Student s) {
		var fee = s.getStdFee();
		var disc = fee * 10/100.0;
		var gst = fee * 12/100.0;
		
		s.setStdFeeDisc(disc);
		s.setStdFeeGst(gst);
		
	}

}
