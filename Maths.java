package studybot;

import java.io.File;
import java.util.Scanner;

public class Maths extends Subject{
	public Maths() {
		finalExam = new File("Math Final Exam.txt");
	}
	
	public static void runMath() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Hello, this is LearningBot. Are you in exam mode?");
		if(console.nextLine().toLowerCase().equals("yes")) {
			// which subject?
			// read from file
		}
		
		System.out.println("What do you need help on today?");
		System.out.println("Topics I can help in: math, physics, chemistry, biology, and english. "
				+ "Choose one you need help on!");
		
		boolean properInput = false;
		while(!properInput) {
			String subject = console.nextLine();
			switch(subject.toLowerCase()) {
			case "math":
				properInput = true;
				boolean helped = false;
				System.out.println("Homework?");
				if(console.nextLine().toLowerCase().equals("yes")) {
					mathHW(console);
					helped = true;
					break;
				}
				System.out.println("Testing?");
				if(console.nextLine().toLowerCase().equals("yes")) {
					mathTest(console);
					helped = true;
					break;
				}
				System.out.println("Learning?");
				if(console.nextLine().toLowerCase().equals("yes")) {
					mathLearn(console);
					helped = true;
					break;
				}
				if(!helped) System.out.println("I am sorry that I have not been able to help you.");
				break;
			case "exit":
				return;
			default:
				System.out.println("Please try again.");
			}
		}
	}

	public static void mathHW(Scanner console) {
		System.out.println("I can help in addition, subtraction, multiplication, and division. \n"
				+ "");
		String topic = console.nextLine();
		switch(topic) {
		case "addition":
			add(console);
			break;
		case "add":
			add(console);
			break;
		case "+":
			add(console);
			break;
		case "subtraction":
			subtract(console);
			break;
		case "subtract":
			subtract(console);
			break;
		case "minus":
			subtract(console);
			break;
		case "-":
			subtract(console);
			break;
		case "multiplication":
			multiply(console);
			break;
		case "multiply":
			multiply(console);
			break;
		case "times":
			multiply(console);
			break;
		case "*":
			multiply(console);
			break;
		case "division":
			divide(console);
			break;
		case "divide":
			divide(console);
			break;
		case "/":
			divide(console);
			break;
		}
	}

	public static void add(Scanner console) {
		System.out.println("How many numbers do you want to add?");
		int numbers = console.nextInt();
		double sum = 0;
		for(int i = 0; i < numbers; i++){
			System.out.print("Number " + (i+1) + ": ");
			int num = console.nextInt();
			sum += num;
		}
		System.out.println("Your final sum is: " + sum);
	}
	public static void subtract(Scanner console) {
		System.out.println("How many numbers do you want to subtract?");
		int numbers = console.nextInt();
		System.out.println("___: ");
		double result = Double.parseDouble(console.nextLine());
		for(int i = 0; i < numbers; i++){
			System.out.print(result + " - ___: ");
			double num = Double.parseDouble(console.nextLine());
			result -= num;
		}
		System.out.println("Your final result is: " + result);
	}
	public static void multiply(Scanner console) {
		System.out.println("How many numbers do you want to multiply?");
		int numbers = console.nextInt();
		int product = 1;
		for(int i = 0; i < numbers; i++){
			System.out.print("Number " + (i+1) + ": ");
			double num = Double.parseDouble(console.nextLine());
			product *= num;
		}
		System.out.println("Your final product is: " + product);
	}
	public static void divide(Scanner console) {
		System.out.println("How many numbers do you want to divide?");
		int numbers = console.nextInt();
		System.out.println("___: ");
		double quotient = Double.parseDouble(console.nextLine());
		for(int i = 0; i < numbers; i++){
			System.out.print(quotient + " / ___: ");
			double num = Double.parseDouble(console.nextLine());
			quotient /= num; 
		}
		System.out.println("Your final quotient is: " + quotient);
	}
	public static void mixed(Scanner console) {
		System.out.println("How many expressions do you have?");
		int expressions = console.nextInt();
		System.out.println("What is the first number?");
		double result = Double.parseDouble(console.nextLine());
		for(int i = 0; i < expressions; i++){
			System.out.println("What sign (*, /, +, -)");
			char sign = console.next().charAt(0);
			System.out.println("What number?");
			switch(sign){
			case '*':
				result *= console.nextInt();
				break;
			case '/':
				result /= console.nextInt();
				break;
			case '+':
				result += console.nextInt();
				break;
			case '-':
				result -= console.nextInt();
				break;
			}
		}
		System.out.println("Your final answer is: " + result);
	}

	public static void mathTest(Scanner console) {
		System.out.println("I can help in addition, subtraction, multiplication, and division.");
		String topic = console.nextLine();
		switch(topic) {
		case "addition":
			a(console);
			break;
		case "add":
			a(console);
			break;
		case "+":
			a(console);
			break;
		case "subtraction":
			s(console);
			break;
		case "subtract":
			s(console);
			break;
		case "minus":
			s(console);
			break;
		case "-":
			s(console);
			break;
		case "multiplication":
			m(console);
			break;
		case "multiply":
			m(console);
			break;
		case "times":
			m(console);
			break;
		case "*":
			m(console);
			break;
		case "division":
			d(console);
			break;
		case "divide":
			d(console);
			break;
		case "/":
			d(console);
			break;
		}
	}

	public static void a(Scanner console) {
		int full = 30;
		int score = 0;

		System.out.println("Easy: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Easy Problem " + i + ": ");
			int first = (int)(Math.random()*10);
			int second = (int)(Math.random()*10);
			System.out.println("What is " + first + " + " + second + "?");
			checkAnswer(first + second, console.nextInt());
		}

		System.out.println("Medium: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Medium Problem " + i + ": ");
			int first = (int)(Math.random()*50);
			int second = (int)(Math.random()*50);
			System.out.println("What is " + first + " + " + second + "?");
			checkAnswer(first + second, console.nextInt());
		}

		System.out.println("Hard: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Hard Problem " + i + ": ");
			int first = (int)(Math.random()*100);
			int second = (int)(Math.random()*100);
			int third = (int) (Math.random()*100);
			System.out.println("What is " + first + " + " + second + " + " + third + "?");
			checkAnswer(first + second + third, console.nextInt());
		}

		if(score == full) System.out.println("Amazing! You got everything right! You have mastered addition.");
		else if(score > full-5) System.out.println("Great job! You got " + score + " out of " + full + ". ");
		else if(score > full-15) System.out.println("You need some work on addition... "
				+ "You got a " + score + " over " + full + ".");
		else System.out.println("Review your addition. RIGHT NOW. And then take the test again. "
				+ "You got a " + score + " over " + full + ".");
	}
	public static void s(Scanner console) {
		int full = 30;
		int score = 0;

		System.out.println("Easy: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Easy Problem " + i + ": ");
			int first = (int)(Math.random()*20);
			int second = (int)(Math.random()*10);
			System.out.println("What is " + first + " - " + second + "?");
			checkAnswer(first - second, console.nextInt());
		}

		System.out.println("Medium: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Medium Problem " + i + ": ");
			int first = (int)(Math.random()*60);
			int second = (int)(Math.random()*30);
			System.out.println("What is " + first + " - " + second + "?");
			checkAnswer(first - second, console.nextInt());
		}

		System.out.println("Hard: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Hard Problem " + i + ": ");
			int first = (int)(Math.random()*100);
			int second = (int)(Math.random()*50);
			int third = (int) (Math.random()*50);
			System.out.println("What is " + first + " - " + second + " - " + third + "?");
			checkAnswer(first - second - third, console.nextInt());
		}

		if(score == full) System.out.println("Amazing! You got everything right! You have mastered subtraction.");
		else if(score > full-5) System.out.println("Great job! You got " + score + " out of " + full + ". ");
		else if(score > full-15) System.out.println("You need some work on subtraction... "
				+ "You got a " + score + " over " + full + ".");
		else System.out.println("Review your subtraction. RIGHT NOW. And then take the test again. "
				+ "You got a " + score + " over " + full + ".");
	}
	public static void m(Scanner console) {
		int full = 30;
		int score = 0;

		System.out.println("Easy: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Easy Problem " + i + ": ");
			int first = (int)(Math.random()*10);
			int second = (int)(Math.random()*10);
			System.out.println("What is " + first + " * " + second + "?");
			checkAnswer(first * second, console.nextInt());
		}

		System.out.println("Medium: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Medium Problem " + i + ": ");
			int first = (int)(Math.random()*50);
			int second = (int)(Math.random()*50);
			System.out.println("What is " + first + " * " + second + "?");
			checkAnswer(first * second, console.nextInt());
		}

		System.out.println("Hard: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Hard Problem " + i + ": ");
			int first = (int)(Math.random()*100);
			int second = (int)(Math.random()*100);
			int third = (int) (Math.random()*100);
			System.out.println("What is " + first + " * " + second + " * " + third + "?");
			checkAnswer(first * second * third, console.nextInt());
		}

		if(score == full) System.out.println("Amazing! You got everything right! You have mastered multiplication.");
		else if(score > full-5) System.out.println("Great job! You got " + score + " out of " + full + ". ");
		else if(score > full-15) System.out.println("You need some work on multiplication... "
				+ "You got a " + score + " over " + full + ".");
		else System.out.println("Review your multiplication. RIGHT NOW. And then take the test again. "
				+ "You got a " + score + " over " + full + ".");
	}
	public static void d(Scanner console) {
		int full = 30;
		int score = 0;

		System.out.println("For this test, please type in decimals, not fractions. \n");

		System.out.println("Easy: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Easy Problem " + i + ": ");
			int first = (int)(Math.random()*20);
			int second = (int)(Math.random()*10+1);
			System.out.println("What is " + first + " / " + second + "?");
			checkAnswer((double)first / second, Double.parseDouble(console.nextLine()));
		}

		System.out.println("Medium: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Medium Problem " + i + ": ");
			int first = (int)(Math.random()*60);
			int second = (int)(Math.random()*30+1);
			System.out.println("What is " + first + " / " + second + "?");
			checkAnswer((double)first / second, Double.parseDouble(console.nextLine()));
		}

		System.out.println("Hard: 10 problems.");
		for(int i = 1; i <= 10; i++) {
			System.out.print("Hard Problem " + i + ": ");
			int first = (int)(Math.random()*100);
			int second = (int)(Math.random()*50);
			int third = (int) (Math.random()*50);
			System.out.println("What is " + first + " / " + second + " / " + third + "?");
			checkAnswer((double)first / second / third, Double.parseDouble(console.nextLine()));
		}

		if(score == full) System.out.println("Amazing! You got everything right! You have mastered division.");
		else if(score > full-5) System.out.println("Great job! You got " + score + " out of " + full + ". ");
		else if(score > full-15) System.out.println("You need some work on division... "
				+ "You got a " + score + " over " + full + ".");
		else System.out.println("Review your division. RIGHT NOW. And then take the test again. "
				+ "You got a " + score + " over " + full + ".");
	}

	public static boolean checkAnswer(int key, int answer) {
		if(answer == key) {
			System.out.println("Correct!");
			return true;
		}else {
			System.out.println("Sorry, that is incorrect. The right answer is " + key + ".");
			return false;
		}
	}
	public static boolean checkAnswer(double key, double answer) {
		if(Math.abs(answer - key) < 0.000001) {
			System.out.println("Correct!");
			return true;
		}else {
			System.out.println("Sorry, that is incorrect. The right answer is " + key + ".");
			return false;
		}
	}

	public static void mathLearn(Scanner console){
		System.out.println("I can teach you on one of these topics: basic algebra (+,-,*,/), "
				+ "basic geometry (squares, circles, etc.), or trigonometry (sin, cos, tan).");
		System.out.println("Keywords: algebra, geometry(geo), or trigonometry(trig)");
		String answer = console.nextLine();
		switch(answer){
		case "algebra":
			System.out.println("+,-,*,/, or all?");
			switch(console.nextLine()){
			case "+":
				learnAdd(console);
				break;
			case "-":
				learnSubtract(console);
				break;
			case "*":
				learnMultiply(console);
				break;
			case "/":
				learnDivide(console);
				break;
				//finalExam(console);
			}
			break;
			//teach negative numbers
		case "geometry":
			learnGeometry(console);
		case "trig":
			learnTrig(console);
		case "trigonometry":
			learnTrig(console);
		}
	}

	public static void learnAdd(Scanner console){
		System.out.println("1 + 1 = 2. Your turn! What is 1 + 2?");
		if(console.nextInt() == 3)System.out.print("Great! Let's try 5 practice problems.");
		else System.out.print("Well... You need a little work... 1 + 2 is 3. Now, let's try some more practice problems.");
		int score = 0;
		for(int i = 0; i < 5; i++){
			int a = (int)(Math.random()*5);
			int b = (int)(Math.random()*5);
			int ans = a + b;
			System.out.println("What is " + a + " + " + b + "?");
			if(checkAnswer(ans, console.nextInt())) {
				System.out.println("Correct!");
				score++;
			}else System.out.println("Sorry, that is incorrect. " + a + " + " + b + " = " + ans + ".");
		}
		if(score>3) System.out.println("You're getting a hang of this! Now, take this 30 problem test to truly master addition.");
		else System.out.println("You need to practice much more on addition... Take this 30 problem test to improve.");
		a(console);
	}
	public static void learnSubtract(Scanner console){
		System.out.println("Do you know addition? Y/N");
		if(console.nextLine().toUpperCase().equals("N") || console.nextLine().toUpperCase().equals("NO")) {
			learnAdd(console);
			System.out.println("Now that you know addition, let's get back to subtraction.");
		}
		System.out.println("If you know addition, you know that 1 + 1 = 2. That means that 2 - 1 = 1."
				+ "If 1 + 2 = 3, what is 3 - 1?");
		if(console.nextInt() == 2)System.out.print("Great! Let's try 5 practice problems.");
		else System.out.print("Well... You need a little work... 3 - 1 is 2. ");
		int score = 0;
		for(int i = 0; i < 5; i++){
			int a = (int)(5+Math.random()*5);
			int b = (int)(Math.random()*5);
			int ans = a - b;
			System.out.println("What is " + a + " - " + b + "?");
			if(checkAnswer(ans, console.nextInt())) {
				System.out.println("Correct!");
				score++;
			}else System.out.println("Sorry, that is incorrect. " + a + " - " + b + " = " + ans + ".");
		}
		if(score>3) System.out.println("You're getting a hang of this! Now, take this 30 problem test to truly master subtraction.");
		else System.out.println("You need to practice much more on subtraction... Take this 30 problem test to improve.");
		s(console);
	}
	public static void learnMultiply(Scanner console){
		System.out.println("Do you know addition? Y/N");
		if(console.nextLine().toUpperCase().equals("N") || console.nextLine().toUpperCase().equals("NO")) {
			learnAdd(console);
			System.out.println("Now that you know addition, let's get back to multiplication.");
		}
		System.out.println("When you multiply, you add the same number a certain amount of times. If you are calculating a*b, you add the number (a) b times.");
		System.out.println("2 * 3 is adding the number (2) 3 times, or adding the number (3) 2 times, which is 6. What is 3 * 4?");
		if(console.nextInt() == 12)System.out.print("Great! Let's try 5 practice problems.");
		else System.out.print("Well... You need a little work... 3 * 4 is 12. Now, let's try some more practice problems.");
		int score = 0;
		for(int i = 0; i < 5; i++){
			int a = (int)(1+Math.random()*5);
			int b = (int)(1+Math.random()*5);
			int ans = a * b;
			System.out.println("What is " + a + " * " + b + "?");
			if(checkAnswer(ans, console.nextInt())) {
				System.out.println("Correct!");
				score++;
			}else System.out.println("Sorry, that is incorrect. " + a + " * " + b + " = " + ans + ".");
		}
		if(score>3) System.out.println("You're getting a hang of this! Now, take this 30 problem test to truly master multiplication.");
		else System.out.println("You need to practice much more on multiplication... Take this 30 problem test to improve.");
		m(console);
	}
	public static void learnDivide(Scanner console){
		System.out.println("Do you know multiplication? Y/N");
		if(console.nextLine().toUpperCase().equals("N") || console.nextLine().toUpperCase().equals("NO")) {
			learnMultiply(console);
			System.out.println("Now that you know multiplication, let's get back to division.");
		}
		System.out.println("If you know multiplication, you know that 2 * 3 = 6. That means that 6 / 3 = 2, and 6 / 2 = 3. If 3 * 4 = 12, what is 12 / 3?");
		System.out.println("2 * 3 is adding the number (2) 3 times, or adding the number (3) 2 times, which is 6. What is 3 * 4?");
		if(console.nextInt() == 12)System.out.println("Great! You got the question correct.");
		else System.out.println("Well... You need a little work... 3 * 4 is 12. ");
		System.out.println("Note that you cannot divide numbers by zero. Imagine that you have 1 cookie and you want to split it up to 0 friends. "
				+ "See, it doesn't make sense. And you are happy that you have a cookie to yourself.");
		System.out.println("Note that if you divide zero by any other number, you still get zero. Imagine that you have 0 cookies to split up to 4 friends."
				+ " You don't have any cookies, so each friend gets 0 cookies.");
		System.out.println("Now, let's try some practice problems.");
		int score = 0;
		for(int i = 0; i < 5; i++){
			int a = (int)(5+Math.random()*10);
			int b = (int)(1+Math.random()*5);
			int ans = a * b;
			System.out.println("What is " + a + " / " + b + "?");
			if(checkAnswer(ans, console.nextInt())) {
				System.out.println("Correct!");
				score++;
			}else System.out.println("Sorry, that is incorrect. " + a + " / " + b + " = " + ans + ".");
		}
		if(score>3) System.out.println("You're getting a hang of this! Now, take this 30 problem test to truly master division.");
		else System.out.println("You need to practice much more on division... Take this 30 problem test to improve.");
		d(console);
	}

	public static void learnGeometry(Scanner console){
		System.out.println("Here's some basic geometry. Triangles are shapes that have 3 sides. Their area can be calculated by (1/2)*(base)*(height), and their perimeter is calculated by the sum of their sides."
				+"\n Quadrilaterals have 4 sides, and they can always be separated to 2 triangles, so their area is (base)*(height), and their perimeter is calculated by the sum of their sides."
				+"\n Trapezoids are quadrilaterals that have one pair of parallel sides. Their areas can be calculated by (1/2)*(base1-base2)*(height). Their perimeters are calculated the same way as other quadrilaterals."
				+"\n Parallelograms are quadrilaterals that have 2 pairs of parallel sides. Their areas and perimeters are calculated the same way as other quadrilaterals."
				+"\n Rhombuses are parallelograms with all sides having the same length. Their areas are calculated the same way as other quadrilaterals, and their perimeters are 4*(the length of a side)."
				+"\n Rectangles are parallelograms with all corners being 90 degrees (right angles). Therefore, their areas can be calculated by (length)*(width), and their perimeters are 2*(length+width)."
				+"\n Squares are rectangles with all sides having the same length. Their areas are calculated by (side)*(side), and their perimeters are calculated by 4*(side)"
				+"\n Circles do not have any sides. They have a center and a radius (a line from the center of the circle to a point on it). Diameter = 2*(radius), Area = pi*(radius)*(radius), and Perimeter = 2*pi*(radius).");
		System.out.println();
		System.out.println("Now, let's do some practice problems, calculating area.");
		int score = 0;
		int base1 = (int) (Math.random()*10+1);
		int base2 = (int) (Math.random()*10+1);
		int height = (int) (Math.random()*10+1);
		double area = 0.5*(Math.abs(base1+base2))*height;
		System.out.println("A trapezoid has parallel sides of " + base1 + " and " + base2 + ", and a height of " + height + ". What is its area?");
		if(checkAnswer(area, Double.parseDouble(console.next()))) score++;
		base1 = (int) (Math.random()*10+1);
		height = (int) (Math.random()*10+1);
		area = base1*height;
		System.out.println("A parallelogram has a base of " + base1 + " and a height of " + height + ". What is its area?");
		if(checkAnswer(area, Double.parseDouble(console.next()))) score++;
		base1 = (int) (Math.random()*10+1);
		height = (int) (Math.random()*10+1);
		area = base1*height;
		System.out.println("A rectangle has a width of " + base1 + " and a height of " + height + ". What is its area?");
		if(checkAnswer(area, Double.parseDouble(console.next()))) score++;
		base1 = (int) (Math.random()*10+1);
		area = base1*base1;
		System.out.println("A square has a side length of " + base1 + ". What is its area?");
		if(checkAnswer(area, Double.parseDouble(console.next()))) score++;
		if(score == 4) System.out.println("Great Job! You got everything correct!");
		else if(score == 3) System.out.println("Cool! A 3 out of 4! You're getting a hang of geometry.");
		else System.out.println("You need some more practice on geometry... You got a " + score + " out of 4.");
	}	

	public static void learnTrig(Scanner console){
		System.out.println("The three basic functions of trigonometry are sine, cosine, and tangent, often abbreviated to just sin(), cos(), and tan(). "
				+"\n In a right triangle, the sin of an angle is the (length of the side on opposite the angle)/(hypotenuse). "
				+"\n In a right triangle, the cos of an angle is the (length of the side adjacent to the angle)/(hypotenuse)."
				+"\n In a right triangle, the tan of an angle is the (sin of the angle)/(cos of the angle)."
				+"\n The functions secant, cosecant, and cotangent are the reciprocals of cosine, sine, and tangent, respectively.");
		System.out.println();
		System.out.println("Now, let's do some practice problems using trigonometry. Please enter answers with 2 decimal places, and round!");
		System.out.println("A right triangle has an angle a, which is adjacent to a leg of side length 3, and opposite to a leg of side length 4. The hypotenuse of the triangle is 5.");
		System.out.println("What is the sine of  angle a?");
		int score = 0;
		int full = 6;
		if(checkAnswer(0.80, console.nextDouble())) {
			System.out.println("Correct!");
			score++;
		}else System.out.println("Sorry, that is incorrect. The answer is 0.80.");
		System.out.println("What is the cosine of  angle a?");
		if(checkAnswer(0.80, Double.parseDouble(console.next()))) {
			System.out.println("Correct!");
			score++;
		}else System.out.println("Sorry, that is incorrect. The answer is 0.60.");
		System.out.println("What is the tangent of  angle a?");
		if(checkAnswer(0.80, Double.parseDouble(console.next()))) {
			System.out.println("Correct!");
			score++;
		}else System.out.println("Sorry, that is incorrect. The answer is 1.33.");
		System.out.println("What is the secant of  angle a?");
		if(checkAnswer(0.80, Double.parseDouble(console.next()))) {
			System.out.println("Correct!");
			score++;
		}else System.out.println("Sorry, that is incorrect. The answer is 1.67.");
		System.out.println("What is the cosecant of  angle a?");   
		if(checkAnswer(0.80, Double.parseDouble(console.next()))) {
			System.out.println("Correct!");
			score++;
		}else System.out.println("Sorry, that is incorrect. The answer is 1.25.");
		System.out.println("What is the cotangent of  angle a?");
		if(checkAnswer(0.80, Double.parseDouble(console.next()))) {
			System.out.println("Correct!");
			score++;
		}else System.out.println("Sorry, that is incorrect. The answer is 0.75.");

		if(score == full) System.out.println("Nice, full score! You got this trig stuff down real good!");
		else if(score == full-1) System.out.println("Nice, you're getting the hang of this! 4/6.");
		else if(score == full-2) System.out.println("Not bad... 3/6.");
		else System.out.println("... You need some work on this...");
	}

}