package notSistemi;

public class Teacher {
	String name;
	String branch;
	String mpno;
	
	public Teacher(String name, String branch, String mpno) {
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
	}

	void printTeacher() {
		System.out.println("Öğretmen adı soyadı : " + this.name + "\nBranşı : " + this.branch + "\nTelefon numarası : " + this.mpno);
	}
}
