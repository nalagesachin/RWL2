package ashwins_program;

public class Controller {

	public static void main(String[] args) {

		StudentInfo student_info = new StudentInfo(02, "Priya", "Kawade");
		StudentInfo student_info1 = new StudentInfo(03, "Archana", "Khaire");
		StudentInfo student_info2 = new StudentInfo(04, "Sachin", "Nalage");
		StudentInfo student_info3 = new StudentInfo(05, "Mahesh", "Dewade");
		StudentInfo student_info4 = new StudentInfo(06, "Ashwini", "Dewade");

		StudentInfo[] array = { student_info, student_info1, student_info2, student_info3, student_info4 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].rollNumber);
			System.out.println(array[i].fName);
			System.out.println(array[i].lName);

		}

	}

}
