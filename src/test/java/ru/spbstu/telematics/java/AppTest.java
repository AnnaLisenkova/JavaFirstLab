package ru.spbstu.telematics.java;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class AppTest
extends TestCase
{
	public void testApp1()
	{
		List<String> k = new ArrayList<String>();
		k = App.getFileList("/home/anna");
		if (k.contains(".p2") && k.contains(".cache") && k.contains("JavaThird"))
			assertTrue(true);
	}
	
	public void testApp2()
	{
		List<String> k = new ArrayList<String>();
		k = App.getFileList("/home/anna/eclipse");
		if (k.contains("eclipse") && k.contains(".metadata"))
			assertTrue(true);
	}
}
