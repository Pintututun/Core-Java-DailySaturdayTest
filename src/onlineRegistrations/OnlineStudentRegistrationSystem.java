package onlineRegistrations;

import java.util.Scanner;

class Course {
	private String courseName;
	private int availableSeats;

	public Course(String courseName, int availableSeats) {
		super();
		this.courseName = courseName;
		this.availableSeats = availableSeats;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public synchronized boolean registerStudent() {
		if (availableSeats > 0) {
			availableSeats--;
			return true;
		} else {
			return false;
		}
	}

}

class Student {
	private String studentName;
	private Course course;

	public Student(String studentName) {
		super();
		this.studentName = studentName;
		
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void registerForCourse()
	{
		synchronized (this) {
			
			if(course.registerStudent())
			{
				System.out.println(" "+studentName+" is eligible for the "+course.getCourseName());
			}
			else
			{
				System.out.println(studentName+" is not eligible for the course");
			}
		}
	}
}

public class OnlineStudentRegistrationSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Course math = new Course("Math", 5);
		Course english = new Course("English", 5);
		Course science = new Course("Science", 5);
		//Student stu = null;
		for (int i = 1; i <= 6; i++) {

			System.out.print("Enter the name of student:");
			String name = sc.nextLine();
			Student stu = new Student(name);
			System.out.print("Enter the course want to enroll");
			String subject = sc.nextLine();

			if (subject.equalsIgnoreCase("Math")) {
				stu.setCourse(math);
			} else if (subject.equalsIgnoreCase("English")) {
				stu.setCourse(english);;
			} else if (subject.equalsIgnoreCase("Science")) {
				stu.setCourse(science);;
			} else {
				System.out.println("Invalid subject");
			}
			Thread t = new Thread() {
				public void run() {
					stu.registerForCourse();
				}
			};
			t.start();
			sc.nextLine();

		}

	}
}
