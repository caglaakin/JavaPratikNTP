package boksOyunu;

import java.util.Random;

public class Match {
	Fighter f1,f2;
	int maxweight,minweight;
	
	
	
	public Match() {
	}

	public Match(Fighter f1, Fighter f2, int maxweight, int minweight) {
		this.f1 = f1;
		this.f2 = f2;
		this.maxweight = maxweight;
		this.minweight = minweight;
	}
	
	public void run() {
		Fighter first = f1,second = f2;
		
		if(starter() == 1) {
			first = f1;
			second = f2;
		}else if(starter() == 2) {
			first = f2;
			second = f1;
		}
		
		if(checkWeight()) {
			while(f1.health > 0 && f2.health > 0) {
				System.out.println("===== YENİ ROUND =====");
					second.health = first.hit(second);
					if(isWin()) {
						break;
					}
					first.health = second.hit(first);
					if(isWin()) {
						break;
					}
				printScore();
			}
		}else {
			System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
		}
	}
	
	
	public boolean checkWeight() {
		return ((f1.weight >= minweight && f1.weight <= maxweight) && (f2.weight >= minweight && f2.weight <= maxweight));
	}
	
	public boolean isWin() {
		if(f1.health == 0) {
			System.out.println("Maçı kazanan : " + f2.name);
			return true;
		}
		else if(f2.health == 0) {
			System.out.println("Maçı kazanan : " + f1.name);
			return true;
		}
		
		return false;	
	}
	
	public int starter() {
		Random randomStarter = new Random();
		int random = randomStarter.nextInt(2)+1;
		return random;
	}
	
	public void printScore() {
		//System.out.println("-------------");
		System.out.println(f1.name + " kalan can \t: " + f1.health + "\n" + f2.name + " kalan can \t: " + f2.health);
	}
	
	
}
