package studybot;

import java.io.*;

public class Teacher {
	private Subject subjectTeaching;
	
	public Teacher(Subject subjectTeaching) {
		this.subjectTeaching = subjectTeaching;
	}
	
	@SuppressWarnings({ "unused", "resource" })
	public void setExam() {
		try {
			File finalExam = subjectTeaching.getFinalExam();
			PrintWriter out = new PrintWriter(finalExam);
			
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found.");
		}
	}
}