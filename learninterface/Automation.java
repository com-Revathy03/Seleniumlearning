package learninterface;

public class Automation extends MultipleLanguage{

	@Override
	public void selenium() {
		System.out.println("Automation tool is selenium");
		
	}
	@Override
	public void Java() {
		System.out.println("java is programming language");
		
	}
	@Override
	public void ruby() {
		System.out.println("ruby is a programming language");
		
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.selenium();
		auto.Java();
		auto.ruby();
		auto.python();
	}
}
