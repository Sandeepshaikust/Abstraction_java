package TestNgtestcases;


import org.testng.annotations.Test;

public class ustTestNG1 {
  @Test(priority=1)
  public void a() {
	  
	  System.out.println("Am Successfully running first");
  }
  
  @Test(priority=2)
  public void b() {
	  
	  System.out.println("Am Successfully running last");
  }
}
