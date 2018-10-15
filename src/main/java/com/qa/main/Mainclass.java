package com.qa.main;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mainclass {
	
	@Test
	public void Sum(){
		int a = 10 ;
		int b = 20 ;
		Assert.assertEquals(30, a+b);
		System.out.println("Sum Method");
		
	}

}
