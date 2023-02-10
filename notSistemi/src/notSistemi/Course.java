package notSistemi;

public class Course {
	String name;
	String code;
	String prefix;
	int note,noteV;
	Teacher teacher;
	double rateNote;
	
	
	public Course(String name, String code, String prefix,double rateNote) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.noteV = 0;
		this.rateNote = rateNote;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;			
		}else {
			System.out.println("Öğretmen branşı uyumlu değil.  " + teacher.name);
		}
	}
	
	void printTeacher() {
		this.teacher.printTeacher();
	}
	
	
	
}
