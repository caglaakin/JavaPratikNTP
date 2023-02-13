package boksOyunu;

public class Fighter {
	String name;
	int damage;
	int health;
	int weight;
	double dodge;
	
	public Fighter(String name, int damage, int health, int weight, double dodge) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
		this.dodge = dodge;
	}
	
	int hit(Fighter foe) {
		System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu." );
		
		
		if(foe.dodge()) {
			System.out.println(foe.name + " gelen hasarı blokladı.");
			System.out.println("--------------");
			return foe.health;
		}
		
		if(foe.health - this.damage < 0) {
			return 0;			
		}
		System.out.println("--------------");
		return foe.health-this.damage;
		
	}
	
	public boolean dodge() {
		double randomValue = Math.random() * 100;
		return randomValue <= this.dodge;
	}
	
	
	

}
