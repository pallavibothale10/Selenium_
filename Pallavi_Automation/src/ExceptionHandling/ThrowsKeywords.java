package ExceptionHandling;

public class ThrowsKeywords {
	public static void main(String[] args) {
		
		//thows keyword is used to declared the exception
		ThrowsKeywords TK= new ThrowsKeywords();
		TK.Sum();
		System.out.println("hiii");
	}
		public void Sum() {
		
		try {
			div();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("helloooo");
			int k=10+20;
			System.out.println(k);
		}
		
		}
	
	public void div() {
		int i= 10/0;
		int j= 100/0;
		System.out.println();
		
	}
	
}