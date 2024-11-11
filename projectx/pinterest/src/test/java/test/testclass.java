package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseclass.baseclass;
import excelutilies.utilies;
import pageclass.page;



public class testclass extends baseclass {
//@Test
//public void login() {
//	 page F1= new page();
//	
//	String xl="C:\\Users\\Luminar\\Documents\\pinterestBook1.xlsx";
//	String Sheet="Sheet1";
//	int rowCount=utilies.getRowCount(xl, Sheet);
//	for(int i=1;i<=rowCount;i++)
//	{
//
//		String Email=utilies.getCellValues(xl, Sheet, i, 0);
//		System.out.println("username----"+Email);
// 
//		
//		String Password=utilies.getCellValues(xl, Sheet, i, 1);
//		System.out.println("password----"+Password);
//		     F1.myaccount();
//			F1.setvalues(Email, Password);	 
//			driver.navigate().refresh();
//			F1.login();
//			
			
			 
//}
//	@Test
//	public void test1() //title verification
//	{
//		String actual=driver.getTitle();
//		String expect="Pinterest - India";
//		Assert.assertEquals(actual, expect,"title failed");
//		
//	}
//	@Test
//	public void testlogo()  //logo verification
//	{
//		WebElement logo=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/div[1]/div[1]/div/a/div"));
//		Boolean logodisplay=logo.isDisplayed();
//		if(logodisplay)
//		{
//			System.out.println("Logo is displayed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
//
//

@Test
	private void testsearch() {
 
page p2= new page();
p2.search();

}	
}



	

