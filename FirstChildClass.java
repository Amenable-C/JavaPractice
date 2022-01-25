package inheritance;

public class FirstChildClass extends ParentClass{
	public FirstChildClass() {
		System.out.println("FirstChildClass constructor");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("-- FirstChildClass make more delicious JJajang() --");
	}
}
