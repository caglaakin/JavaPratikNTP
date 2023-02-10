package notSistemi;

public class Main {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Hayri", "BSD", "0555");
		Teacher t2 = new Teacher("Recep", "NTP", "552");
		Teacher t3 = new Teacher("Hüseyin", "MP", "532");
		
		Course c1 = new Course("Bilişim Sistemleri Donanımı", "101", "BSD",0.2);
		Course c2 = new Course("Nesne Tabanlı Programlama", "102", "NTP",0.3);
		Course c3 = new Course("Mobil Programlama", "103", "MP",0.25);
		c1.addTeacher(t1);
		c2.addTeacher(t2);
		c3.addTeacher(t3);
		System.out.println("Öğretmenler eklendi");
		
		Student s1 = new Student("Ahmet", "1520", 3, c1,c2,c3);
		s1.addBulkExamNote(56,78,15,85,65,40);
		s1.isPass();
		Student s2 = new Student("Ayşe", "1241", 4, c1,c2,c3);
		s2.addBulkExamNote(100, 89, 45,65,75,80);
		s2.isPass();
		Student s3 = new Student("Veli", "1043", 4, c1,c2,c3);
		s3.addBulkExamNote(42, 54, 69,55,75,95);
		s2.isPass();
		
		
	}

}
