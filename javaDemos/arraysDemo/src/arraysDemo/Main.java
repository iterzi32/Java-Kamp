package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Hakkı";
		String student2 = "Demet";
		String student3 = "Mürüvvet";
		String student4 = "Baki";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);

		System.out.println("----------------------------------");

		String[] students = { "Hakkı", "Demet", "Mürüvvet", "Baki" };
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		System.out.println("-----------------------------------");

		for (String student : students) {
			System.out.println(student);
		}
	}

}
