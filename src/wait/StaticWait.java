package wait;

public class StaticWait {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("before wait");
		
		Thread.sleep(10000);   // it will wait for if the condition in the code is true or false
		
		System.out.println("after wait");
	}

}
