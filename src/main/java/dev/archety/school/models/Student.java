package dev.archety.school.models;

import java.sql.Date;

public class Student extends Person {
	
	private String studNum;
	private Date dateBr;
	
	
	
	public String getStudNum() {
		return studNum;
	}
	public void setStudNum(String studNum) {
		this.studNum = studNum;
	}
	public Date getDateBr() {
		return dateBr;
	}
	public void setDateBr(Date dateBr) {
		this.dateBr = dateBr;
	}
	public Student() {
		super();
		
	}
	public Student(String firNam, String lasNam, String stuNum, Date dateBr) {
		super(firNam, lasNam);
		
		this.studNum = studNum;
		this.dateBr = dateBr;
		
	}
	
	
	@Override
	public String toString() {
		return "Student [studNum=" + studNum + ", dateBr=" + dateBr + ", firNam=" + firNam + ", lasNam=" + lasNam + "]";
	}
	
	

}
