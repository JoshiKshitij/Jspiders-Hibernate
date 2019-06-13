package com.test;

import java.util.Arrays;

public class Runner {

	static void test(String ... strings){
		
		for (String string : strings) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
		
		test("kshitij"  , "joshi" , "hitler");
	}
}
