package dev.archety.school.models;

public class Teacher extends Person {
	
	private String teaSub;

	public Teacher() {
		super();
		
	}

	public Teacher(String firNam, String lasNam, String teaSub) {
		super(firNam, lasNam);
		this.teaSub = teaSub;
	}

	@Override
	public String toString() {
		return "Teacher [teaSub=" + teaSub + ", firNam=" + firNam + ", lasNam=" + lasNam + "]";
	}
	
	

}
