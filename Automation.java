package Week3Day2;

public class Automation extends MultipleLangauge{

	public void Selenium() {
		System.out.println("Selenium method comes from TestTool interface");
	}

	public void Java() {
		System.out.println("Selenium method comes from Language interface");
	}

	@Override
	public void Python() {
		System.out.println("Selenium method comes from MultipleLanguage Abstract Class");	
	}
	public static void main(String arg[]) {
		Automation au = new Automation();
		au.Selenium();
		au.Java();
		au.Python();
		au.ruby();
	}
}
