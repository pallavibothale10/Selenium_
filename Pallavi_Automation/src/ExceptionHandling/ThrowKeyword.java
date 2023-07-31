package ExceptionHandling;

public class ThrowKeyword {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {
			throw new Exception("Automation Testing");
			
		} catch (Exception e) {
			System.out.println("Hello hii");
			e.printStackTrace(); //// for write the exception
			
		}
		System.out.println("HI");
	

}
}