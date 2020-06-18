package sonarqube.mavensonar;

public class DemoSonar{

	public static void main(String[] args) {
		System.out.println("hello java");
		start();

	}
	
	
	public static void main2(String[] args) {
		System.out.println("Hi Java");
		start();

	}
	
	public static String start() {
		System.out.println("start");
		return "start";
	}
	
	public static String stop() {
		System.out.println("The test cases is stopped ");
		return "stop";
	}

}




