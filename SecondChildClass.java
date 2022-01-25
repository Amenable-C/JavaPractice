package inheritance;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		System.out.println("SecondChildClass constructor");
	}
	
	@Override
	public void makeJJajang() {
		System.out.println("-- SecondChildClass make more delicious JJajang() --");
	}
}
