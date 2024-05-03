package TestNgtestcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ustTestNG3 {
  @Test
  public void beforeclass() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Am running class");
  }
@Test
  @AfterClass
  public void afterClass() {
	  
	  System.out.println("tear down");
  }

}
