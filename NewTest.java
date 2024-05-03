package TestNgtestcases;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;

public class NewTest {
  
boolean res;
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc", "ddd" },
      new Object[] { "tomsmith", "SuperSecretPassword!" },
    };
  }
  @Test(dataProvider = "dp")
  
  public void login(String U, String p) {
	  System.out.println("Username:" + U + "Password" +p);
	  res=U.equals("tomsmith") ? true :false;
	  Assert.assertEquals(true, res);
  }
}
