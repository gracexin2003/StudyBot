package studybot;

import java.util.Scanner;

/*
 * This program assists teachers and students with the educational process.
 */

public class Main {
	@SuppressWarnings({ "static-access", "unused", "resource" })
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Helper.type("Welcome to Study Bot!");
		Helper.type("This bot revolutionizes the learning experience.");
		Helper.type("");
		while(true) {
			Helper.type("Are you a student or a teacher?");
			String personType = in.next();
			if(personType.equalsIgnoreCase("student")) {
				Subject currentSubject = new Subject();
				new Student();
				Maths x = new Maths();
				x.runMath();
				break;
			}
			else if(personType.equalsIgnoreCase("teacher")) {
				new Teacher(new Maths());
				break;
			}
		}
		System.out.println();
	}
	
}