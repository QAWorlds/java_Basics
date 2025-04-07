package method_overriding;

public class Register  extends Guest {
	
	public void student(int a) {
		
		
		System.out.println("ram");
	}
	
	
	public static void main(String[] args) {
		
		
		Register a = new Register();
		
		
		a.student();

}
	
}