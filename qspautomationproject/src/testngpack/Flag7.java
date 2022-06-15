package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test(groups="FUNCTIONAL")
  public void ft1() 
  { 
	  Reporter.log("ft1",true);
	  
  }
  
  @Test(groups="SMOKE")
  public void St1() 
  { 
	  Reporter.log("St1",true);
	  
  }
  
  @Test(groups="INTEGRATION")
  public void it1() 
  { 
	  Reporter.log("it1",true);
	  
  }
  
  //---------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft2() 
  { 
	  Reporter.log("ft2",true);
	  
  }
  
  @Test(groups="SMOKE")
  public void st2() 
  { 
	  Reporter.log("st2",true);
	  
  }
  
  @Test(groups="INTEGRATION")
  public void It3() 
  { 
	  Reporter.log("It3",true);
	  
  }
  
  //-----------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft3() 
  { 
	  Reporter.log("ft3",true);
	  
  }
  
  @Test(groups="SMOKE")
  public void St3() 
  { 
	  Reporter.log("St3",true);
	  
  }
  
  @Test(groups="INTEGRATION")
  public void it3() 
  { 
	  Reporter.log("it3",true);
	  
  }
  
  //---------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft4() 
  { 
	  Reporter.log("ft4",true);
	  
  }
  
  @Test(groups="SMOKE")
  public void St4() 
  { 
	  Reporter.log("St4",true);
	  
  }
  
  @Test(groups="INTEGRATION")
  public void it4() 
  { 
	  Reporter.log("it4",true);
	  
  } 
  
  //---------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft5() 
  { 
	  Reporter.log("ft5",true);
	  
  }
  
  @Test(groups="SMOKE")
  public void St5() 
  { 
	  Reporter.log("St5",true);
	  
  }
  
  @Test(groups="INTEGRATION")
  public void it5() 
  { 
	  Reporter.log("it5",true);
	  
  }
  
  //-------------------------------------------------------------------------------
  
  @Test(groups="FUNCTIONAL")
  public void ft6() 
  { 
	  Reporter.log("ft6",true);
	  
  }
  
  @Test(groups="SMOKE")
  public void St6() 
  { 
	  Reporter.log("St6",true);
	  
  }
  
  @Test(groups="INTEGRATION")
  public void it6() 
  { 
	  Reporter.log("it6",true);
	  
  }
}
