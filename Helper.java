package studybot;

public final class Helper {
	
	private Helper() {
		//prevents instantiation
	}
	
	public static void type(String sentence) {
		for(int i=0; i<sentence.length(); i++) {
			try {
				System.out.print(sentence.charAt(i));
				Thread.sleep(35);
			}
			catch (InterruptedException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}