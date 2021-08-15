package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email emailJS = new Email("John", "Smith");
		
		System.out.println(emailJS.showInfo());
	}

}
