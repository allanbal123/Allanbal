public class Main {
	public static void main(String[] args) {
		
		int brainRot1 = 69;
		int brainRot2 = 0;
		
		try {
		    int result = brainRot1/ brainRot2;
		    System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
		    System.out.println("built-in Exception: Cannot divide by zero");
		}
		
		System.out.println("Program continues running...");
	}
}
