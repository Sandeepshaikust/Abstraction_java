package TestNgtestcases;

import org.testng.annotations.Test;

public class ustTestNG2 {
	
		  @Test(dependsOnMethods="f")
		  public void e() {
			  
			  System.out.println("Am first");
		  }
		  
		  @Test(priority=1)
		  public void f() {
			  
			  System.out.println("Am last");
		  }
		}
