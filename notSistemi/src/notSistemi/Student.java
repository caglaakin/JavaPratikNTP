package notSistemi;

public class Student {
	String name;
	String stuNo;
	int classes;
	Course c1;
	Course c2;
	Course c3;
	double average;
	boolean isPass;
	
	public Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0;
		this.isPass = false;
		
	}
	
	void addBulkExamNote(int note1,int note2,int note3,int noteV1,int noteV2,int noteV3) {
		if(note1 >=0 && note1<=100) {
			this.c1.note = note1;
		}
		if(note2>=0 && note2<=100) {
			this.c2.note = note2;
		}
		if(note3>=0 && note3<=100) {
			this.c3.note = note3;
		}
		if(noteV1>=0 && noteV1<=100) {
			this.c1.noteV = noteV1;
		}
		if(noteV2>=0 && noteV2<=100) {
			this.c2.noteV = noteV2;
		}
		if(noteV3>=0 && noteV3<=100) {
			this.c3.noteV = noteV3;
		}
		
	}
	
	
	void printNote() {
		System.out.println(this.c1.name +" \t: " + this.c1.note + "\nSözlü Notunuz : " + this.c1.noteV + "\n***");
		System.out.println(this.c2.name +" \t: " + this.c2.note + "\nSözlü Notunuz : " + this.c2.noteV + "\n***");
		System.out.println(this.c3.name +" \t: " + this.c3.note + "\nSözlü Notunuz : " + this.c3.noteV + "\n***");
	}
	
	boolean calcAverage() {
		this.average = (((this.c1.note*(1-this.c1.rateNote))+(this.c1.noteV*this.c1.rateNote))+
				((this.c2.note*(1-this.c2.rateNote))+(this.c2.noteV*this.c2.rateNote))+
				((this.c3.note*(1-this.c3.rateNote))+(this.c3.noteV*this.c3.rateNote)))/3;
		return this.average > 55;
	}
	
	void isPass() {
		System.out.println("========================");
		if(this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
			System.out.println("Notlar tam girilmemiş...");
		}
		else {
			boolean value = calcAverage();
			if(value) {
				System.out.println("Sınıfı geçtiniz!\nOrtalamanız : " + this.average);
			}else {
				System.out.println("Sınıfta kaldınız.\nOrtalamanız : " + this.average);
			}
		}
		System.out.println("---------\nNotlarınız : ");
		printNote();
	}
	
}
