package basics;

public class SwitchDemo {

	public static void main(String[] args) {

		displayCourseDetails("Spring");
		
	}
	
	static void displayCourseDetails(String course) {
		
		switch(course) {
			case "Java" :
				System.out.println("Java is a server side programming language");
				System.out.println("Java is robust due to its exception handling");
				break;
			case "Spring" :
				System.out.println("Spring is a framework to build java applications");
				System.out.println("Spring Boot is the latest methodology to build applications");
				break;
			case "Hibernate":
				System.out.println("Hibernate is an ORM tool");
				System.out.println("We use Hibernate to communicate with database");
				break;
			default :
				System.out.println("Check the input provided");
		}
		
		System.out.println("end stmt in displayCourse method");

	}
}
