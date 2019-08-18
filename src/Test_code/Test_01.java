package Test_code;

import org.testng.Assert;
import org.testng.annotations.Test;

import Java_code.Demo_test_01;

public class Test_01 {

//Added testng tags to execute test cases
	
@Test(priority =1)
public static void code1()
{
	Demo_test_01.test_01();
	//java verification point : Assert
	Assert.assertTrue(false, "Test cases failed as we have false value: FAIL!!!!!!!!!!!");
	
	//
	//boolean bo = driver.findelement(By.xpath("//a[@clas='sjhdgjgd']")).isdisplayed;
	//bp==false
	//Assert.assertTrue(bo, "Test cases failed as element is not displayed: FAIL!!!!!!!!!!!");
	//Assert.assertEquals(actual, expected, message);

	
}
	
@Test(priority =2)
public static void code2()
{
	Demo_test_01.test_02();
}

@Test(priority =3)
public static void code3()
{
	Demo_test_01.test_03();
}

@Test(priority =4)
public static void code4()
{
	Demo_test_01.test_04();
}

@Test(priority =5)
public static void code5()
{
	Demo_test_01.test_05();
}
}
