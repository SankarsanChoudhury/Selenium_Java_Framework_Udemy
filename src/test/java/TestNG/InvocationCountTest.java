package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//This test case will be executed 5 times
	@Test(invocationCount = 5)
	public void Sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}

}
