package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 
{
	@Test
	public void sum()
	{
	int a=10;
	int b=20;
	Assert.assertEquals(30, a+b);
	
	System.out.println("sum");
	}

	@Test
	public void sub()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
		
		System.out.println("sub");
	}

	@Test
	public void div()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
		
		System.out.println("div");
	}

	@Test
	public void mul()
	{
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
		
	}

	
}
