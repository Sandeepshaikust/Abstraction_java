package Testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametersExample {
@Parameters({ "fn" })
  @Test
  public void a(String firstName) {
	System.out.println("Invoked testString " + firstName);
	  assert "Cedric".equals(firstName);
	}
  
@Parameters({ "sn" })
@Test
public void b(String secondname) {
	System.out.println("Invoked testString " + secondname);
	  assert "Sandeep".equals(secondname);
	}
}
