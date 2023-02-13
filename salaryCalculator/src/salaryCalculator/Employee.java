package salaryCalculator;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		double taxSalary = 0;
		if(this.salary > 1000) {
			taxSalary = this.salary * 0.03;
		}
		return taxSalary;
	}
	
	public int bonus() {
		int bonusHours=0;
		if(this.workHours > 40) {
			bonusHours = (this.workHours-40)*30;
		}
		return bonusHours;
	}
	
	public double raiseSalary() {
		int workYear = 2023-this.hireYear;
		double extra=0;
		if(workYear < 10 ) {
			extra = this.salary*0.05;
			return extra;
		}else if(workYear > 9 && workYear < 20 ) {
			extra = this.salary*0.1;
			return extra;
		}else if(workYear > 19) {
			extra = this.salary*0.15;
			return extra;
		}
		return extra;
	}
	
	public void print() {
		System.out.println("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma saati : " + this.workHours + "\nBaşlangıç Yılı : " + this.hireYear);
		System.out.println("Vergi : " + tax() + "\nBonus : " + bonus() + "\nMaaş Artışı : " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary-tax()+bonus()));
		System.out.println("Toplam Maaş : " + (this.salary+raiseSalary()+bonus()-tax()));
	}
	
	
}
