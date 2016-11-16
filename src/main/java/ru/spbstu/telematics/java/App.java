package ru.spbstu.telematics.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App
{
	public static List<String> getFileList(String string){
	File f = new File(string);
	List<String> k = new ArrayList<String>();
	for (String Number : f.list()){
		k.add(Number);
	}
			System.out.println(k);
		return k;
	}
	public static void main( String[] args ){ 
		getFileList("/home/anna");
	}
}
