package studybot;

import java.util.Scanner;

public class Student {
	String name;
	Subject subjectLearning;
	
	private static final Scanner in = new Scanner(System.in);
	
	public Student() {
		Helper.type("What subject are you learning?");
		String subject = in.next();
		if(subject.equalsIgnoreCase("math")) subjectLearning = new Maths();
	}
	
}