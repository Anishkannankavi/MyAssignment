package week5.assignment;

public class Automation extends  MultipleLanguage {

	public void selenium() {
		System.out.println("Selenium");		
	}

	public void java() {
		System.out.println("java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation cls=new Automation();
		cls.selenium();
		cls.java();
		cls.ruby();
	}

}
