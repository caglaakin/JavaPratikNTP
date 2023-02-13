package boksOyunu;

public class Main {

	public static void main(String[] args) {
		Fighter f1 = new Fighter("Marc", 15, 120, 96, 12);
		Fighter f2 = new Fighter("Alex", 25, 110, 103, 11);
		
		Match m1 = new Match(f1,f2,110,90);
		
		m1.run();
		
		

	}

}
